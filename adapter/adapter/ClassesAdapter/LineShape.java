package adapter;

public class LineShape implements Shape {

private int x,y,y1;

public LineShape(int x_,int y_, int Y1_){
	this.x=x_;
	this.y=y_;
	this.y1=Y1_;
       
}
public int getLimiteX(){
      return this.x;
            
  }
public int getLimiteY(){
    return this.y1;
          
}
} 