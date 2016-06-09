
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.EstudanteDAO;
import br.ifms.sgpp.model.Estudante;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;


@Path("/estudante")
public class EstudanteService {

    @Autowired
    private EstudanteDAO estudanteDAO;
    
    @GET
    @Produces("application/json") 
    public List<Estudante> getEstudante() {
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("{id}")
    public Estudante buscarPorId(@PathParam("id")Long id) {
        return estudanteDAO.get(id);
    }
    
    @POST
    public Response inserir(Estudante e) {
        estudanteDAO.save(e);
        return Response.ok("Estudante incluido").build();
    }
    
    
}
