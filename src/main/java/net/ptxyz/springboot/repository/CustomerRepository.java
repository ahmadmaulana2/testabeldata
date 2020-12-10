/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ptxyz.springboot.repository;

import net.ptxyz.springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @Ahmad Maulana
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
