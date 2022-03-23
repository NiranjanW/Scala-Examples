import java.nio._
import java.util.path
import java.io.File
import org.apache.commons.io.FileUtils

implicit class ReadFile(file:File ) {

        def read() = Source.fromFile(file){

        }
}

object ReadingFile {

    val filePath = ""
    val file = new File(filePath)
    val scanner = new Scanner(file) 

  while (scanner.hasNextLine) {
      val line = scanner.line
      println(line)
  }
val fileContents = FileUtils.readFile(file)
fileContents.foreach(println)

val scalaFileContents: Iterator[String] = Source.fromFile(file).getLines

def open(path:String) = new File(path)

val readLinesBoss = open(filePath).read()
readLinesBoss.foreach(println)

  def main (args: Array[String]){

  }
}