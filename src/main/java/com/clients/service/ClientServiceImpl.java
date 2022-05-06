
package com.clients.service;

import com.clients.data.ClientDao;
import com.clients.domain.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientDao clientDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Client> findClientList() {
        
        return (List<Client>) clientDao.findAll();
        
    }

    @Override
    @Transactional(readOnly = true)
    public Client findClient(Client client) {
        
        return clientDao.findById(client.getClientId()).orElse(null);
        
    }

    @Override
    @Transactional
    public void save(Client client) {
        
        clientDao.save(client);
        
    }

    @Override
    @Transactional
    public void delete(Client client) {

        clientDao.delete(client);
        
    }
    
}