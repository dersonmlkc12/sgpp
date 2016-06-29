
package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.Estudante;
import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Component;


@Component
@SuppressWarnings("unchecked")
public class EstudanteDAO extends HibernateDAO<Estudante>{
    public EstudanteDAO() {
        super(Estudante.class);
    }
    
    public List<Estudante> getEstudante() {
        Query q = getSession().createQuery("from Estudante order by nome asc");
        List<Estudante> estudantes = q.list();
        return estudantes;
    }
    
    public boolean delete(Long id){
        Estudante e = get(id);
        delete(e);
        return true;
    }
 
}
