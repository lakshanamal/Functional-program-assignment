
object Q1 {
  def main(args:Array[String])
  { 
    print("Enter the number :")
    var num=scala.io.StdIn.readInt()
    var con=prime(num)
    println("is prime :"+con)
  }
  
  def prime(p:Int,n:Int=2):Boolean= n match {
 case x if(x==p) => true
 case x if GCD(p,x)>1 => false
 case x => prime(p,x+1)
}
  
  def GCD(a:Int,b:Int):Int=b match{
case 0 => a
case x if x>a => GCD(x,a)
case x => GCD(x,a%x)
}
  
}