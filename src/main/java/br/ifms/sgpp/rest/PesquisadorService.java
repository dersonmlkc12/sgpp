
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.PesquisadorDAO;
import br.ifms.sgpp.model.Pesquisador;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;


@Path("/pesquisador")
public class PesquisadorService {

    @Autowired
    private PesquisadorDAO db;

    @GET
    @Produces("application/json")
    public Pesquisador getPesquisador() {
        return db.get(new Long(1));
    }
}
