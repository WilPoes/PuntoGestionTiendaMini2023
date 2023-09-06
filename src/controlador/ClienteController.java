package controlador;

import dao.ClienteDAO;
import entidades.Cliente;
import java.util.List;

public class ClienteController {

    private ClienteDAO clienteDAO;

    public ClienteController() {
        clienteDAO = new ClienteDAO();
    }

    public boolean registrarCliente(Cliente cliente) {
        return clienteDAO.registrarCliente(cliente);
    }
    
    public List<Cliente> listarClientes() {        
        return clienteDAO.ListarCliente();
    }

    // Otros métodos del controlador para operaciones relacionadas con clientes
}
