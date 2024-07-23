package com.example.Proyecto.Integrador.controller;


import com.example.Proyecto.Integrador.dto.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {



    @GetMapping("/")
    public ResponseEntity<List<Userdto>> findAll(){
        ArrayList<Userdto> lista = new ArrayList<Userdto>();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Userdto> findById(@PathVariable("id") Long id) {
        Userdto usuario = new Userdto(id,"juan","juan@gmail.com");
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/")
    public ResponseEntity<Userdto> save(@RequestBody Userdto userDto){
        return ResponseEntity.ok(userDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Userdto> update(@RequestBody Userdto userDto,@PathVariable("id") Long id){
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>delete(@PathVariable("id") Long id){
        return ResponseEntity.noContent().build();
    }


}
