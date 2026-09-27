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
public interface IF_Agenda {
	
	public boolean adicionaContato(IF_Contato contato);
	
	public IF_Contato getContato(String telefone);
	
	public boolean removeContato(String telefone);
	
	public Iterator getListaContato();
	
	public String getTelefoneContato(String _nome);
}
