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
public class AgendaMap {
	
	private HashMap listaContato;
		
	/* (non-Javadoc)
	 * @see IF_Agenda#adicionaContato(IF_Contato)
//	 */
	public AgendaMap(){
		listaContato = new HashMap();
	}
	public boolean adiciona(IF_Contato contato) {
		// TODO Auto-generated method stub
		if(!this.listaContato.containsKey(contato.getTelefone())){
			this.listaContato.put(contato.getTelefone(),contato);
			return true;
		}else
			return false;
	}
	
			
	
	/* (non-Javadoc)
	 * @see IF_Agenda#removeContato(java.lang.String)
	 */
	public boolean remove(String telefone) {
		// TODO Auto-generated method stub
		if(this.listaContato.containsKey(telefone)){
			this.listaContato.remove(telefone);
			return true;
		}else
			return false;
	}
	
	public HashMap getHashContato(){
		return this.listaContato;
	}
	
	
	
	public static void main(String args[]){
		
		
	}
}
