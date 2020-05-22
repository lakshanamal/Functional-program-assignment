object Q1{
  def main(args:Array[String])
  {
    println("Celsius to Fahrenheit");
    println("-------------------------");
     print("Enter the Temperature in Celsius(°C) :")
     var cels:Double=scala.io.StdIn.readDouble();
     var fah:Double=tempConvertor(cels);
     println("Temprature in Fahrenheit :"+fah+"°F");
    
  }
  
  def tempConvertor(celsius:Double):Double={
     var fah:Double=celsius * 1.8000 + 32.00;
     return fah;
  }
}