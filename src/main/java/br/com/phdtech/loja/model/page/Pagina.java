/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.model.page;

import java.util.List;


/**
 *
 * @author phelipp
 */
public class Pagina implements Page {
       private int id;
       private String title;
       private Conteudo conteudo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public void setConteudo(Conteudo conteudos) {
        this.conteudo = conteudos;
    }
    
}
