
package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.RecursoHumano;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gustavo
 */
@Component
public class RecursoHumanoDAO extends HibernateDAO<RecursoHumano>{
    public RecursoHumanoDAO() {
        super(RecursoHumano.class);
    }
}
