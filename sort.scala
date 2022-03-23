object main extends App {
    def isort (xs:List[Int]) :List[Int] = {
        if (xs.isEmpty) Nil
        else insert ( xs.head , isort (xs.tail))
    }

    def insert (x:Int ,xs:List[Int]) : List[Int] = {
        if (xs.isEmpty || x < xs.head) x ::xs
        else xs.head :: insert (x, xs.tail)
    }

    val rand = List ( 5,3,2,1)
    print(isort(rand))

     def isort1(xs : List[Int]) : List[Int] = {
    xs match{
        case Nil => Nil
        case x :: xs1 => insert(x, isort(xs1))

   }
  }
   def insert1(x : Int, xs : List[Int]) : List[Int] = {

        xs match{
            case Nil => List(x)
            case y :: xs1 =>
                if(y >= x) x :: xs
                else y :: insert(x,  xs1)
        }

    }

}