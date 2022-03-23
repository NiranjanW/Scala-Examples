
//https://danielwestheide.com/blog/the-neophytes-guide-to-scala-part-7-the-either-type/

val greeting:Option[String] =Some("Hello, world!")

case class User (
    id: Int,
    firstName: String,
    lastName: String,
    age:Int,
    gender: Option[String]

)

object UserRepository {
    private val users = Map (1 -> User(1, "John" , "Doe",32, Some("male")),
                        2 -> User(2, "Johanna", "Doe", 30, None))
    
    def findById (id:Int):Option[User] =users.get(id)
    def findAll = users.values
}

val user1 = UserRepository.findById(1)
if (user1.isDefined) {
	println(user1.get.firstName)
}
val user = User(2, "Johanna", "Doe", 30, None)
//Specifying a default Value 
println("Gender: " + user.gender.getOrElse("not specified")) // will print "not specified"

//PatternMatching
val user3 = User(2, "Johanna", "Doe", 30, None)
user3.gender match {
    case Some(gender) => println ("Gender" + gender)
    case None => println ("Gendernot given")
}

//Options sa collections

UserRepository.findById(2).foreach(user => println(user.firstName)) // prints "Johanna"


def readFilesFromListOfFiles(list: List[String]) = {
  list.map(name => readFile(name))
}

def readFile(filename: String) = {
  Source.fromFile(filename).getLines.mkString.length
}

def readFile(filename: String): Either[String, Int] = {
  try {
    Right(Source.fromFile(filename).getLines.mkString.length)
  }
  catch {
    case ex: Exception => Left(ex.getMessage)
  }
}


def readFilesFromListOfFiles(list: List[String]) = {

 list.map (name => readFile (name))
 .map (_.fold (err => s"Error: $err", value => s"\nFile's length: $value"))
 .foreach (println (_) )
}