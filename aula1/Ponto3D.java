public class Ponto3D extends Ponto{
	
	private int z;
	public Ponto3D(int x_,int y_,int z_){
		super(x_,y_);
		this.z= z_;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public static void main (String args[]){
		Ponto p = new Ponto3D(1,2,3);
		
		System.out.println("Ponto x="+p.getX()+ " y="+p.getY());

        Ponto3D p3d = (Ponto3D) p; // Downcasting to access z
        System.out.println("Ponto z="+p3d.getZ());
        
	}

}