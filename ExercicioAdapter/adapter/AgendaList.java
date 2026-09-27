package adapter;
/*
 * Created on 05/03/2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.util.*;
/**
 * @author 2004205172
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AgendaList implements IF_Agenda{
	
	private ArrayList listaContato = new ArrayList();
	/* (non-Javadoc)
	 * @see IF_Agenda#adicionaContato(IF_Contato)
	 */
	public boolean adicionaContato(IF_Contato _contato){
		if(!listaContato.contains(_contato)){
			listaContato.add(_contato);
			return true;
		}else
			return false;
	}	
	/* (non-Javadoc)
	 * @see IF_Agenda#getContato(java.lang.String)
	 */
	public IF_Contato getContato(String _telefone) {
		// TODO Auto-generated method stub
		IF_Contato c= new Contato();
		c.setTelefone(_telefone);

		return  (Contato) this.listaContato.get(this.listaContato.indexOf(c));
	}
	/* (non-Javadoc)
	 * @see IF_Agenda#getListaContato()
	 */
	public Iterator getListaContato() {
		// TODO Auto-generated method stub
		return listaContato.iterator();
	}
	/* (non-Javadoc)
	 * @see IF_Agenda#removeContato(java.lang.String)
	 */
	public boolean removeContato(String _telefone) {
		// TODO Auto-generated method stub
		IF_Contato c= new Contato();
		c.setTelefone(_telefone);
		
		return this.listaContato.remove(c);
	}
	
	public String toString(){
		
		String temp= "Lista de Contatos:\n";
		Iterator it = this.getListaContato();
		
		while(it.hasNext()){
			IF_Contato c = (IF_Contato)it.next();
			temp = temp + c+"\n";
		}
		return temp;
	}
	
	public String getTelefoneContato(String _nome){
		
		String tel = "Nao Encontrado";
		Iterator it = this.getListaContato();
		while(it.hasNext()){
			IF_Contato c = (IF_Contato) it.next();
			if(c.getNome().equals(_nome)){
				tel = c.getTelefone();
			}
		}
		return tel;
	}
	
	public static void main(String args[]){
		
		
		
		
			
	
		
		
	}
}
