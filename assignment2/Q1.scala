

object Q1{
  def main(args:Array[String])
  {
   println("Home salary ");
   println("------------\n")
   
   var N_hour=0;
   var OT_hour=0;
   print("Enter the number of working hours  :")
   N_hour=scala.io.StdIn.readInt()
    print("Enter the number of OT hours  :")
   OT_hour=scala.io.StdIn.readInt()
   
   var payment:Double=totalpayment(N_hour,OT_hour);
   print("Payment of employee :"+payment);
  }
  
  def normal_hour_payment(hour:Int):Int=hour*150
  
  def OT_hour_payment(hour:Int):Int=hour*75
  
  def payment(N_hour:Int,OT_hour:Int):Int=normal_hour_payment(N_hour)+OT_hour_payment(OT_hour)
    
  def tex(income:Double):Double=income*10/100
  
  def totalpayment(N_hours:Int,OT_hours:Int):Double=payment(N_hours,OT_hours)-tex(payment(N_hours,OT_hours))
  
}