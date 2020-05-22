
object Q3{
  def main(args:Array[String]){
    print("")
  var book_price=24.95;
  var cover_cost=book_price*60;
  var discount=book_price*40/100*60;
  var shipment_cost=3+0.75*10
  println("Cover price of 60 book : +"+cover_cost)
  println("total discount 	       : -"+f"$discount%1.2f");
  println("cost of the shipment   : -"+shipment_cost)
  println("	                --------");
  var total=cover_cost-discount+shipment_cost;
  println("total                  :  "+f"$total%1.2f");
  
  }
}