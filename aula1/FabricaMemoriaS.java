public class FabricaMemoriaS {
    private static FabricaMemoriaS instance = null;

    public static final int HD = 1;
    public static final int CD = 2;

    private FabricaMemoriaS() {
    }
    public static FabricaMemoriaS getInstance() {
        if (instance == null) {
            instance = new FabricaMemoriaS();
        }
        return instance;
    }
    public MemoriaS criaMemoria(int tipo, int total, int unidade) {
        switch (tipo) {
            case HD:
                return new HD("12345", total, unidade);
            case CD:
                return new CD(total, unidade);
            default:
                throw new IllegalArgumentException("Tipo de memória inválido");
        }
    }


public static void main(String args[]){
	
		MemoriaS hd = FabricaMemoriaS.getInstance().criaMemoria(FabricaMemoriaS.HD, 10, MemoriaS.MB);
		MemoriaS cd = FabricaMemoriaS.getInstance().criaMemoria(FabricaMemoriaS.CD, 650, MemoriaS.MB);

		System.out.println(hd);
		System.out.println(cd);
		
		hd.GravaKB(1024);
		System.out.println(hd);
		cd.GravaKB(600);
		System.out.println(cd);
		
		((HD) hd).getNumeroSerie();
		((CD)cd).getEstado();
		
	}
}