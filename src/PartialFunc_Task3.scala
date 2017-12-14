/**************************************
 ******* Assignment 15 Task 3 *********
 ****** Partial Function Program ******
 **************************************/
class ProgramPartialFunc {
  def squareFunc(n: Int) {
    println("Square: " + n * n)
  }
  def adder(m: Int, n: Int, p: Int) = m + n + p

  def partialFunc(x:Int,y:Int) {
    val add = adder(2, _: Int, _: Int)
    println("------------------------")
    println("Addition: "+add(x, y))
    squareFunc(add(x, y))
    println("------------------------")
  }
}

object PartialFunc_Task3 {
  def main(args: Array[String]) {
    println("Enter numbers")
    var x:Int = scala.io.StdIn.readLine().toInt;
    var y:Int = scala.io.StdIn.readLine().toInt;
    new ProgramPartialFunc().partialFunc(x,y)
  }
}  
