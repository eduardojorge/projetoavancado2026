package exeAdapter;
/*
 * Created on 06/10/2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author emjorge
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DoisPonto {
	
	private int x1,y1,x2,y2;
	
	public DoisPonto(int x1_,int y1_,int x2_,int y2_){
		   this.x1=x1_;
		   this.y1=y1_;
		   this.x2=x2_;
		   this.y2=y2_;
	
	}
	

	/**
	 * @return Returns the x.
	 */
	public int getX1() {
		return x1;
	}
	/**
	 * @return Returns the y.
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * @return Returns the x.
	 */
	public int getX2() {
		return x2;
	}
	/**
	 * @return Returns the y.
	 */
	public int getY2() {
		return y2;
	}
	
	public String toString(){
		return "(X1="+this.x1+",Y1="+this.y1+")(X2="+this.x2+",Y2="+this.y2+")";
	}
}
