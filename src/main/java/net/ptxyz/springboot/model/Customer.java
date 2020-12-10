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
@Table(name = "customer")
/**
 *
 * @author Ahmad Maulana
 */
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cust_id;
    
    @Column(name = "Nama")
    private String nama;
    
    @Column(name = "Alamat")
    private String alamat;
     
    @Column(name = "Id_Kota")
    private Long id_kota;
    
    @Column(name = "Pendapatan")
    private double pendapatan;
    
    public Customer() {
        
    }

    public Customer(String Nama, String Alamat, Long Id_Kota, double pendapatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.id_kota = id_kota;
        this.pendapatan = pendapatan;
    }   

    public Long getId() {
        return cust_id;
    }

    public void setcust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String Alamat) {
        this.alamat = alamat;
    }

    public Long getId_Kota() {
        return id_kota;
    }

    public void setId_Kota(Long id_kota) {
        this.id_kota = id_kota;
    }
    
    public double getPendapatan() {
        return pendapatan;
    }
    
    public void setPendapatan(double Pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    
}
