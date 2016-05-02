package model;

import java.util.ArrayList;
import to.ClienteTO;
import dao.ClienteDAO;

public class Vendedor {
	public ArrayList<ClienteTO> listarClientes(){
		ArrayList<ClienteTO> lista;
		ClienteDAO dao = new ClienteDAO();
		lista = dao.listarClientes();
		return lista;
	}
	public ArrayList<ClienteTO> listarClientes(String chave){
		ArrayList<ClienteTO> lista;
		ClienteDAO dao = new ClienteDAO();
		lista = dao.listarClientes(chave);
		return lista;
	}

}
