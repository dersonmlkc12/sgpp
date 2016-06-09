
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.RecursoHumanoDAO;
import br.ifms.sgpp.model.RecursoHumano;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;


@Path("/recursoHumano")
public class RecursoHumanoService {

    @Autowired
    private RecursoHumanoDAO db;

    @GET
    @Produces("application/json")
    public RecursoHumano getRecursoHumano() {
        return db.get(new Long(1));
    }
}
