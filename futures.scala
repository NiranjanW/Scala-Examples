import scala.concurrent.ExecutionContext.Implicits.global

object future extends App {
    def someFuture[T]: Future[T] = Future{
        someComputation()
    }

val complete = someFuture.onComplete { 
    case Success(result) => println(result)
    case Failure(e) => e.printStackTrace()
}

    private def scanFiles(docRoot: String): Future[Seq[String]] = Future {
    new File(docRoot).list.map(docRoot + _)

    private def processFile(fileName: String): Future[(String, Int)] =
        Future {
        val dataFile = new File(fileName)
        val wordCount =
            Source
            .fromFile(dataFile).getLines.foldRight(0)(_.split(" ").size + _)
            (fileName, wordCount)
            } recover {
            case e: java.io.IOException =>
            println("Something went wrong " + e)
            (fileName, 0)
            }
    }
}
