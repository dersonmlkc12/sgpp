package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.EstudanteDAO;
import br.ifms.sgpp.model.Estudante;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.ifms.sgpp.rest.Response;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/estudante")
public class EstudanteService {

    @Autowired
    private EstudanteDAO estudanteDAO;

    //Lista todos os estudantes
    @GET
    @Produces("application/json")
    public List<Estudante> getEstudante() {
        List<Estudante> estudantes = estudanteDAO.getEstudante();
        return estudantes;
    }

    @GET
    @Produces("application/json")
    @Path("{id}")
    public Estudante buscarPorId(@PathParam("id") Long id) {
        return estudanteDAO.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Estudante create(Estudante e) {
        estudanteDAO.save(e);
        return e;
    }
//    @POST
//    @Consumes("application/json")
//    public Response inserir(Estudante e) {
//        estudanteDAO.save(e);
//        return Response.Ok("Estudante incluido");
//    }

}
