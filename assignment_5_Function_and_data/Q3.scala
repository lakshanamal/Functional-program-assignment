

object Q3 extends App {
  
  class account(id:String,account:Int,blc:Double)
  {
    val NIC:String=id;
    val accountNumber:Int=account;
    var balance:Double=blc;

    
    def transfer(toAccount:account,value:Double)
    {
      if(balance>value)
		{
			this.balance=this.balance-value;
      toAccount.balance=toAccount.balance+value;
		}
		else
		{
			println("Your account balnce is not sufficient.");
		}
      
    }
     override def toString ="["+NIC+":"+accountNumber +":"+ balance+"]"
  }
  
  var amal=new account("971741",1000235,10000);
  var kavi=new account("971742",1000234,5000);
  var value=5000;
  amal.transfer(kavi, value);
  println("----------bank tranfer---------");
  println();
  println("Your balance :"+amal.balance);
  println("You tranfered  "+value+ " to "+kavi.accountNumber);
  
  
}