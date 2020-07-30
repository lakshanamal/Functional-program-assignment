
object Q2 {
  
class Rational(x:Int,y:Int)
{
  
 
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b);
  
  require(y!=0,"The denominator must not be zero");
  def numer=x/gcd(x,y);
  def denom=y/gcd(x,y);
   
 
  
  def sub(that:Rational)=new Rational (this.numer*that.denom-this.denom*that.numer,that.denom*this.denom);
  override def toString=numer + "/" + denom;
}

def main(args:Array[String])
{
  var x=new Rational(3,4);
var y=new Rational(5,8);
var z=new Rational(2,7);

var subb=x.sub(y).sub(z);
println(subb);
}


}