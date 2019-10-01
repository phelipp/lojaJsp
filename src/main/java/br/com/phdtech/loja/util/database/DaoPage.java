/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.util.database;

import br.com.phdtech.loja.model.page.Page;
import br.com.phdtech.loja.model.page.Pagina;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author phelipp
 */
public class DaoPage implements DaoInterface<Page> {

    @Override
    public List<Page> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Page select(int id) {
        Pagina page = new Pagina();
        page.setTitle("estou aqui ");
        return page;
    }
    
}
