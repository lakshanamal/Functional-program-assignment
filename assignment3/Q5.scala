object Q5 {
  def main(args:Array[String])
  {  print("Enter the number :")
    var number=scala.io.StdIn.readInt()
    print(add(number-1))
  }
  
  
  def iseven(num:Int):Boolean= num%2  match{
    case 0 => true
    case _ => false
  }
  
  def add(num:Int):Int= num match {
    case 1 => 0
    case x if iseven(x) =>x+add(x-1)
    case x  =>0+add(x-1)
  }
}