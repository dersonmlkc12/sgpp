/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.Pesquisador;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gustavo
 */
@Component
public class PesquisadorDAO extends HibernateDAO<Pesquisador>{
    public PesquisadorDAO() {
        super(Pesquisador.class);
    }
}
