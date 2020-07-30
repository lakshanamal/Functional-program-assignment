object Q4_1 {
  
  class account(id:String,account:Int,blc:Double)
  {
    val NIC:String=id;
    val accountNumber:Int=account;
    var balance:Double=blc;
     override def toString ="["+NIC+":"+accountNumber +":"+ balance+"]"
  }
  
   val overdraft=(b:List[account])=> b.filter(_.balance<0);
   var Allbalance=(b:List[account])=>b.reduce((x,y)=>new account("0",0,x.balance+y.balance));
   var totalBalance=(b:List[account])=>b.map(x=>if(x.balance>0) x.balance*1.05d else x.balance*1.10d);
   
   
  def main(args:Array[String])
	{
  
   var amal  =new account("971741",1000234,5000);
   var kavi  =new account("971742",1000235,-67.0);
   var sajini=new account("971743",1000236,-0.09);
   var ishan =new account("971744",1000237,100.0);
  
   // List of account
   var bank:List[account]=List(amal,kavi,sajini,ishan);
  
 
  println("--------------------Bank management--------------------------");
  //overdraft account
  println("1.  List of Accounts with negative balances:");
  var negBalance=overdraft(bank);
  println();
  negBalance.foreach(x=>println(x));
  println();
  
  // sum of all account balance
  println("2.  Sum of all account balances:");
  var total=Allbalance(bank);
  println();
  println("Total of account balance :"+total.balance);
  println();
  
  // Final balance 
  println("3.  Final balances of all accounts(after apply the interest function):");
  var FinalTotal=totalBalance(bank);
   println();
  FinalTotal.foreach(x=>println(x));
  println();
  
  
}
}