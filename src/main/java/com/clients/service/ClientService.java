
package com.clients.service;

import com.clients.domain.Client;
import java.util.List;

public interface ClientService {

    public List<Client> findClientList();
    
    public Client findClient(Client client);
    
    public void save(Client client);
    
    public void delete(Client client);
    
}
