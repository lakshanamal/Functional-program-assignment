object Q1 extends App
{
  var alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
  val decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size);
  val cipher=(algo:(Char, Int,String )=>Char , s:String,key:Int,a:String)=>s.map(algo(_,key,a));
  
  print("Enter the message( without space ) :");
  var message:String=scala.io.StdIn.readLine()
  val ct=cipher(encrypt,message,5,alphabet)
  println("Encrypt meassge :"+ct)
  
  val cp=cipher(decrypt,ct,5,alphabet)
  println("Decrypt message :"+cp)
  
}
