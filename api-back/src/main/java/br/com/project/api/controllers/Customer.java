package br.com.project.api.controllers;

import br.com.project.api.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Customer {

    @Autowired
    private Repository action;

    @PostMapping("/")
    public br.com.project.api.models.Customer register(@RequestBody br.com.project.api.models.Customer c){
        return action.save(c);
    }
    
    @GetMapping("/")
    public Iterable<br.com.project.api.models.Customer> get(){
        return action.findAll();
    }

    @PutMapping("/")
    public br.com.project.api.models.Customer update(@RequestBody br.com.project.api.models.Customer c){
        return action.save(c);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable long id){
        action.deleteById(id);
    }

}
