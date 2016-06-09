
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.ProjetoDAO;
import br.ifms.sgpp.model.Projeto;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;


@Path("/projeto")
public class ProjetoService {

    @Autowired
    private ProjetoDAO db;

    @GET
    @Produces("application/json")
    public Projeto getProjeto() {
        return db.get(new Long(1));
    }
}
