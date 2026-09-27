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
public abstract class FiguraGeometrica {
	
	private DoisPonto doisPonto;
	
	public FiguraGeometrica(DoisPonto ponto_){
		   this.doisPonto = ponto_;
		
	}
	public DoisPonto getDoisPonto(){
		return this.doisPonto;
	}

	public abstract double getArea();
	
	public abstract String getInformacaoEspecifica();
	
	public String toString(){
		
		return "Figura Geométrica "+this.getInformacaoEspecifica()+" Ponto="+
		this.doisPonto+" Área="+this.getArea();
		
	}
	public static void main(String args[]){
		DoisPonto p = new DoisPonto(4,6,5,4);
		FiguraGeometrica figuraTriangulo = new FiguraTriangulo(p);
		System.out.println(figuraTriangulo);
		Losango l = new Losango((FiguraTriangulo)figuraTriangulo);
		FiguraGeometrica figuraLosango = new FiguraLosango(l); 
		System.out.println(l);
	}
	

}
