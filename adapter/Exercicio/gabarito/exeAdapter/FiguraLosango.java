package exeAdapter;
/*
 * Created on 11/10/2010
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
public class FiguraLosango extends FiguraGeometrica{
	
	private Losango losango;
	
	public FiguraLosango(Losango losango_){
		   super(losango_.getTriangulo1().getDoisPonto());
	}	   
	
	public String getInformacaoEspecifica(){
		   return "\n"+losango.getTriangulo1()+"\n"+losango.getTriangulo2() + "\nLosnago ";
	}
	public double getArea(){
		return losango.getTriangulo1().getArea()+losango.getTriangulo2().getArea();
		
	}
	

}
