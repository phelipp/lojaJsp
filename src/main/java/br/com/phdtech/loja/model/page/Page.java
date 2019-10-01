/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.model.page;

import br.com.phdtech.loja.util.database.ObjectDatabase;

/**
 *
 * @author phelipp
 */
public interface Page extends ObjectDatabase {    
    String getTitle();
}
