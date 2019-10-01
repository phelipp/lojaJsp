/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.model.negocio;

import br.com.phdtech.loja.model.product.Product;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author phelipp
 */
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne       
    @JoinColumn(name = "id_product")
    private Product product;
    
    private float valueUnit;
    private float amount;
    @Column(name = "amount_value" )
    private float value;

    public Item() {
        product = new Product();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getValueUnit() {
        this.valueUnit = this.product.getValue();
        return valueUnit;
    }

    public void setValueUnit(float valueUnit) {
        this.valueUnit = valueUnit;
        this.product.setValue(this.valueUnit);
    }

    public float getValue() {
        this.value = this.getValueUnit() * this.getAmount();
        return value;
    }
}
