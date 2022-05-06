
package com.clients.web;

import com.clients.domain.Client;
import com.clients.service.ClientService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClientService clientService;
    
    @GetMapping("/")
    public String index(Model model){
        
        List<Client> clients = clientService.findClientList();
        
        model.addAttribute("clients", clients);
        
        return "index";
         
    }
    
}
