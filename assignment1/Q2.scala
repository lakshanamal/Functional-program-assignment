object Q2{
  val pi:Double=3.14;
  def main(args:Array[String])
  {
    println("volume of sphere ");
    println("-----------------");
    println("Enter the redius of sphere :");
    var redius:Double=scala.io.StdIn.readFloat();
    var volume:Double=volumeOfSphere(redius);
    print("volume of sphere :"+volume);
  }
  
  def volumeOfSphere(red:Double):Double={
    var vol:Double=(4*pi*red*red*red)/3;
    return vol;
  }
}