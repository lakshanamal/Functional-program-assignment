
object Q2 {
  def main(args:Array[String])
  { 
    print("Enter the number :")
    var num=scala.io.StdIn.readInt()
    var con=primeseq(num-1)
    println("prime num:"+con)
  }
  
  
  def primeseq(num:Int):Unit={
    if (prime(num)==true){
      println(num)
    }
    primeseq(num-1)
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