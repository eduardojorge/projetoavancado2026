public class Ponto {
	
	private int x,y;
	
	public Ponto(int x_,int y_){
		  this.x=x_;
		  this.y=y_;
	}
	
	
	public Ponto(){
		 this(0,0);
	}
	
	

	public Ponto(int x_){
		 this(x_,0);
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString(){
	
		return "Ponto x="+this.getX()+ " y="+this.getY();
		
	}
	public static void main(String args[]){
		
		Ponto p = new Ponto();
		
		System.out.println("Ponto x="+p.getX()+ " y="+p.getY());
		
		System.out.println(p);
		
		
	}
	

}
