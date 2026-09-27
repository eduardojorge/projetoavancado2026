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
public class Losango  {
	
	private FiguraTriangulo triangulo1;
	private FiguraTriangulo triangulo2;
	
	public Losango(FiguraTriangulo triangulo_){
		  this.triangulo1 = triangulo_;
		  	 
		
	}
	
	
	public void criaTriangulo2(){
         int x1=triangulo1.getDoisPonto().getX1();
         int y1=triangulo1.getDoisPonto().getY1()-2*triangulo1.getAltura();
         
         int x2=triangulo1.getDoisPonto().getX2();
         int y2=triangulo1.getDoisPonto().getY2();
		
		 DoisPonto p = new DoisPonto(x1,y1,x2,y2);
		 triangulo2 = new FiguraTriangulo(p); 
	}
	
	
	/**
	 * @return Returns the triangulo1.
	 */
	public FiguraTriangulo getTriangulo1() {
		return triangulo1;
	}
	/**
	 * @return Returns the triangulo2.
	 */
	public FiguraTriangulo getTriangulo2() {
		return triangulo2;
	}
}
