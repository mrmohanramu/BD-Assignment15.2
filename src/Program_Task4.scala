/**************************************
 ******* Assignment 15 Task 4 *********
 ******* Program use match case *******
 **************************************/
class MatchCase{
  def matchCaseFunc(course:String):String={
    course.toLowerCase() match {
      case "android" => "12999"
      case "big data development" => "17999"
      case "spark" =>"19999"
      case _ => "NA"
    }
  }
}

object Program_Task4 {
  def main(args: Array[String]) {
    println("Enter Course Name: ")
    var course: String = scala.io.StdIn.readLine().toString();
    print("Price of "+course.toUpperCase()+" course is: "+ new MatchCase().matchCaseFunc(course))
    
    
  }
}