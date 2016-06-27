/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.Estudante;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gustavo
 */
@Component
@SuppressWarnings("unchecked")
public class EstudanteDAO extends HibernateDAO<Estudante>{
    public EstudanteDAO() {
        super(Estudante.class);
    }
    
    public List<Estudante> getEstudante() {
        Query q = getSession().createQuery("from Estudante");
        List<Estudante> estudantes = q.list();
        return estudantes;
    }
    
    public boolean delete(Long id){
        Estudante e = get(id);
        delete(e);
        return true;
    }
 
}
