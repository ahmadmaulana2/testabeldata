/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ptxyz.springboot.controller;

import java.util.List;
import net.ptxyz.springboot.model.Kota;
import net.ptxyz.springboot.repository.KotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Ahmad Maulana
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class KotaController {
    
    @Autowired
    private KotaRepository kotaRepository;
    
    // get all kota
    @GetMapping("/kota")
    public List<Kota> getAllEmployee(){
        return kotaRepository.findAll();
    }
    
    // create kota rest api
    @PostMapping("/kota")
    public Kota createEmployee(@RequestBody Kota kota){
        return kotaRepository.save(kota);
    }
}
