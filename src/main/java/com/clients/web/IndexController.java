
package com.clients.web;

import com.clients.data.ClientDao;
import com.clients.domain.Client;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClientDao clientDao;
    
    @GetMapping("/")
    public String index(Model model){
        
        Iterable<Client> clients = clientDao.findAll();
        
        model.addAttribute("clients", clients);
        
        return "index";
         
    }
    
}
