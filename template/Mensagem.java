
/*
 * Created on 03/10/2005
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
public abstract class Mensagem {


	protected String conteudo;
	protected String dataHora;
	protected String email;
	
	public Mensagem(String newEmail,String newConteudo,String newDataHora){
		this.email =newEmail;
		this.conteudo = newConteudo;
		this.dataHora = newDataHora;
	
		
	}
	
	/**
	 * @return Returns the conteudo.
	 */
	public String getConteudo() {
		return conteudo;
	}
	/**
	 * @return Returns the dataHora.
	 */
	public String getDataHora() {
		return dataHora;
	}
	/**
	 * @return Returns the email
	 */
	public String getEmail() {
		return this.email;
	}
	

	public abstract void verifica()throws Exception;
	
	public abstract  String getTxtMensagem();
	
	public String envia(Destinatario destinatario)throws Exception{
		this.verifica();
		return "Mensagem para "+destinatario.getNomeCompleto()+" "+this.getTxtMensagem();
		
	}
	
	public static void main(String args[]){
		
		
		Destinatario[] d = new Destinatario[2];
		
		d[0]= new Destinatario();
		d[0].setNome("emjorge");
		d[0].setNomeCompleto("Eduardo M. F. jorge");
		
		
		
		d[1]= new Destinatario();
		d[1].setNome("camila");
		d[1].setNomeCompleto("Camila S. P. Jorge");

		
		
		Mensagem email = new Email("emjorge@gamil.com","Prova Tópicos II","03/10/2005","Aviso");
		Mensagem email1 = new Email("emjorge@gmail.com","Prova Tópicos II","03/10/2005","");
		
		Mensagem sms = new Sms("camila@gmail.com","A Prova de Tópicos II será na sala 36","03/10/2005","9129-2234");
		Mensagem sms1 = new Sms("camila@gmail.com","Prova Tópicos II","03/10/2005","9129-2234");
		
		
		try{
			System.out.println(email.envia(d[0]));
		}catch(Exception e){ 
				System.out.println(e.getMessage()); }
		try{
			System.out.println(email1.envia(d[1]));
		}catch(Exception e){ 
			System.out.println(e.getMessage()); }
		try{
			System.out.println(sms.envia(d[0]));
		}catch(Exception e){ 
			System.out.println(e.getMessage()); 
		}
		try{
			System.out.println(sms1.envia(d[1]));
		}catch(Exception e){ 
			System.out.println(e.getMessage()); 
		}
		
		
	}
	
}
