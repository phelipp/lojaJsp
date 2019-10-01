/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.util.database.dao;

import br.com.phdtech.loja.model.user.Client;
import br.com.phdtech.loja.util.database.DaoInterface;
import java.util.List;

/**
 *
 * @author phelipp
 */
public class DaoClient implements DaoInterface<Client>{

    public DaoClient() {
    factory();
    }

    
    @Override
    public List<Client> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client select(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
