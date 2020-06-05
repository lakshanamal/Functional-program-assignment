

object Q4 {
  def main(args:Array[String])
  {
    print("Enter the number :")
    var num:Int=scala.io.StdIn.readInt()
    if(isEven(num))  println(num +" is even number")
    else println(num +" is odd number")
  }
  
  def isEven(n:Int):Boolean=n match {
    case 0 => true
    case 1 => false
    case n if(n<0) => isEven(-n)
    case _ => isEven(n-2)
  }
}