/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.model.user;

import br.com.phdtech.loja.model.negocio.Pedido;
import br.com.phdtech.loja.util.database.ObjectDatabase;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author phelipp
 */
@Entity
public class Client implements ObjectDatabase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String cpf;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(mappedBy = "client")
    private List<Pedido> pedido;
    @ManyToMany
    @JoinTable(name="Cliente_Address",
             joinColumns={@JoinColumn(name="client_id")},
             inverseJoinColumns={@JoinColumn(name="address_id")})
    private List<Address> address;
    @OneToMany(mappedBy = "client")
    private List<Phone> phones;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Login login;

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
}
