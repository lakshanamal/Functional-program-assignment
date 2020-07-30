object Q1 extends App {
  
  
  class Rational(x:Int ,y:Int)
  {
    private def gcd(a:Int,b:Int):Int=if(b==0) return a else return gcd(b,a%b);
    def numer=x/gcd(x,y);
    def denom=y/gcd(x,y);
    
    require (denom !=0,"The denominator must not be zero");
    def neg = new Rational(-this.numer,this.denom);
     override def toString = numer + "/" + denom;
  }
  
  var r=new Rational(5,7);
  var negative=r.neg;
    println("negative of "+ r + " is  :"+negative);
}
