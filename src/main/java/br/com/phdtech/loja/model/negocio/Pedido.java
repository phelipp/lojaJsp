/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.model.negocio;

import br.com.phdtech.loja.model.product.Product;
import br.com.phdtech.loja.model.user.Client;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author phelipp
 */
@Entity

public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDay;
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    /*
    @ManyToOne
    @JoinColumn(name="client")    
    private Client client;
    @OneToMany(mappedBy = "pedido")
    @JoinColumn (name = "id_pedido")
    private List<Item> itens;
    private float amount;
    @OneToOne
    private Status status;*/

    public Pedido() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /* public LocalDateTime getOrderDay() {
        return orderDay;
    }

    public void setOrderDay(LocalDateTime orderDay) {
        this.orderDay = orderDay;
    }*/
/*
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public float getAmount() {
        this.amount = 0;
        itens.forEach((item) -> {
            this.amount += item.getValue();
        });
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }*/

}
