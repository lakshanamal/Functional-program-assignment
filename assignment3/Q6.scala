

object Q6 {
  def main(args:Array[String])
  {
    print("Enter the number :")
    var number=scala.io.StdIn.readInt()
    series(number)
  }
  
  def series(num:Int,n:Int=0):Unit={
    if(num>=n)
    {
       print(fib(n)+" ")
      series(num,n+1)
    }
     
  
  }
  
  
  def fib(num:Int):Int= num match{
    case 0 =>0
    case x if (x==1) =>num
    case x => fib(x-2)+fib(x-1)
  }
}