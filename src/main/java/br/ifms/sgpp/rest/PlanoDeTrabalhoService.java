
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.PlanoDeTrabalhoDAO;
import br.ifms.sgpp.model.PlanoDeTrabalho;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;


@Path("/planoDeTrabalho")
public class PlanoDeTrabalhoService {

    @Autowired
    private PlanoDeTrabalhoDAO db;

    @GET
    @Produces("application/json")
    public PlanoDeTrabalho getPlanoDeTrabalho() {
        return db.get(new Long(1));
    }
}
