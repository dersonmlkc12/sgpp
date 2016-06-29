
package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.Pesquisador;
import java.util.List;
import org.hibernate.Query;
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
     
    public List<Pesquisador> getPesquisador() {
        Query q = getSession().createQuery("from Pesquisador  order by nome asc");
        List<Pesquisador> pesquisador = q.list();
        return pesquisador;
    }
    
    public boolean delete(Long id){
        Pesquisador e = get(id);
        delete(e);
        return true;
    }
}
