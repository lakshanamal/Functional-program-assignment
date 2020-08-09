case class Point(x:Int,y:Int){

  def +(that:Point)=Point(this.x+that.x,this.y+that.y) 
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) 
  def Dis(that:Point):Double=
  {
   val distance=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return distance
  }

  def Invert(that:Point)=Point(this.y,this.x)
}

object Points {
   def main(args:Array[String])
  {
   val p1=Point(4,9)
   val p2=Point(8,15)
   
   println("function1:Addition "+p1+" and "+p2+"="+(p1+p2))
   println("")
   println("function1:Move a "+p1+" by given distance(3, 7)="+p1.move(3, 7))
   println("")
   val w=p1-p2

   println("function1:Distance between "+p1+" and "+p1+"="+w.Dis(w))
   println("")
   println("function1:Invert of "+p1+"="+p1.Invert(p1))
  }
}