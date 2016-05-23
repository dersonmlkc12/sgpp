/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.Projeto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gustavo
 */
@Component
public class ProjetoDAO extends HibernateDAO<Projeto>{
    public ProjetoDAO() {
        super(Projeto.class);
    }
}
