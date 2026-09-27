package adapter;
/*
 * Created on 05/03/2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author 2004205172
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Contato implements IF_Contato{
	
	private String nome, telefone;

	/**
	 * @return Returns the nome.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome The nome to set.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return Returns the telefone.
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone The telefone to set.
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		Contato contato = (Contato) arg0;
		if(this.telefone.equals(contato.getTelefone())){
			return true;
		}else
			return false;
	}
	
	public String toString(){
		return "Nome: "+this.nome+"\nTelefone: "+this.telefone;
	}
	
	
}
