
sealed trait Season 

case class Summer() extends Season
case class Winter() extends Season
case class Spring() extends Season

object main extends App {
    def season(name: String)  {
        name match { 
            case Summer() => println("Its hot")
        }
    }

    def squarWitMap(xs:List[Int]) :List[Int] = {
        xs map (x => x*x)
    }

    def squreList(xs:List[Int]) :List[Int] = {
        xs match { 
            case List () => xs
            case y::ys => y  ::squareList(ys)
        }
    }
}
