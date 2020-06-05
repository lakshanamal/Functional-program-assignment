
object Q2 {
  def main(args:Array[String])
  {
    var ticket_price=0
    println("Enter the ticket price	 :")
    ticket_price=scala.io.StdIn.readInt()
    var total:Int=profit(ticket_price)
    print("profit of the program :"+total)
    
  }
  
  def attendee(ticket_price:Int):Int=120+(15-ticket_price)*20/5
  
  def cost_for_attendee(ticket_price:Int):Int=500+attendee(ticket_price)*3
  
  def income(ticket_price:Int)=ticket_price*attendee(ticket_price)

  def profit(ticket_price:Int):Int=income(ticket_price)-cost_for_attendee(ticket_price)
}