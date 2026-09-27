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
public class FiguraTriangulo extends FiguraGeometrica{
	
	private int base, altura;
	
	
	public FiguraTriangulo(DoisPonto ponto_){
		   super(ponto_);
	 	   
		   this.base = 2*(ponto_.getX2()-ponto_.getX1());
	 	  
		   if (ponto_.getY1()>ponto_.getY2()){
		   		this.altura = ponto_.getY1()-ponto_.getY2();
		   }else{
		   	  this.altura = ponto_.getY2()-ponto_.getY1();
		   }
		
	}
	public String getInformacaoEspecifica(){
		   return " Triangulo ";
	}
	
	
	public double getArea(){
		return this.base*this.altura/2;
		
	}

	/**
	 * @return Returns the altura.
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @return Returns the base.
	 */
	public int getBase() {
		return base;
	}
}
