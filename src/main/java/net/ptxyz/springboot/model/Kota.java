/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ptxyz.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kota")
/**
 *
 * @author Ahmad Maulana
 */
public class Kota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_kota;
    
    @Column(name = "Nama")
    private String nama;
    
    public Kota() {
        
    }

    public Kota(Long id_kota, String Nama) {
        this.id_kota = id_kota;
        this.nama = nama;
    }   

    public Long getId_Kota() {
        return id_kota;
    }

    public void setId_Kota(Long id_kota) {
        this.id_kota = id_kota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = nama;
    }
    
    
}
