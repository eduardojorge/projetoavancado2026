package adapter;

public class GerenciadorAgenda {
	
	public static final int LIST=1;
	
	
	IF_Agenda agenda =null;
	
	public void criaAgenda(int tipo){
		if (tipo==LIST){
			agenda =new AgendaList();
			
		}
	}
	public void contatos(){
		IF_Contato[] c = new IF_Contato[4];
		c[0] = new Contato();
		c[0].setNome("Atila");
		c[0].setTelefone("3492-5351");
		agenda.adicionaContato(c[0]);
		
		c[1] = new Contato();
		c[1].setNome("Celso");
		c[1].setTelefone("9961-1567");
		agenda.adicionaContato(c[1]);
		
		c[2] = new Contato();
		c[2].setNome("Talita");
		c[2].setTelefone("1234-5678");
		agenda.adicionaContato(c[2]);
		
		c[3] = new Contato();
		c[3].setNome("Zorac");
		c[3].setTelefone("9876-5432");
		agenda.adicionaContato(c[3]);
		
	}
	
	public void processaAgenda(){
		
		System.out.println(agenda);
		
		agenda.removeContato("9876-5432");
		
		System.out.println(agenda.getContato("1234-5678"));
		
		System.out.println(agenda);
		
		
		System.out.println(agenda.getTelefoneContato("Talita"));
	}
	
	public static void main(String args[]){
		GerenciadorAgenda gerenciadorAgenda = new GerenciadorAgenda();
		gerenciadorAgenda.criaAgenda(LIST);
		gerenciadorAgenda.contatos();
		gerenciadorAgenda.processaAgenda();
	}
	
	

}
