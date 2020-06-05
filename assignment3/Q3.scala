

object Q3 {
  def main(args:Array[String])
  {
    print("Enter the number :")
    var number:Int=scala.io.StdIn.readInt()
    println("Total :"+add(number))
  }
  
  def add(num:Int):Int= num match
  {
    case 0 => 0
    case _ => num+add(num-1)
  }
}