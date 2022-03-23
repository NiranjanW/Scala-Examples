object TestApp extends App {
    val  lst = List(1,2,3,4,5,6,7,8,9,10,11)
    lst.foreach{println}
    val sum = lst.foldLeft(0)(_+_)
    println(s"Sum =$sum")
    val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")

    val concatDonuts :(String, String) =>String = (a,b) => (a+b+"Donuts")
    println(s"All donuts = ${donuts.foldLeft("")(concatDonuts)}")
}

