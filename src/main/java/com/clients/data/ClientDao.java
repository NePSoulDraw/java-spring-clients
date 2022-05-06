
package com.clients.data;

import com.clients.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientDao extends CrudRepository<Client, Integer>{

}
