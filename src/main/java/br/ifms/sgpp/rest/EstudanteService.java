package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.EstudanteDAO;
import br.ifms.sgpp.model.Estudante;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/estudante")
public class EstudanteService {

    @Autowired
    private EstudanteDAO estudanteDAO;

    //Lista todos os registros
    @GET
    @Produces("application/json")
    public List<Estudante> getEstudante() {
        List<Estudante> estudantes = estudanteDAO.getEstudante();
        return estudantes;
    }
    
    //Busca registro pelo id
    @GET
    @Produces("application/json")
    @Path("{id}")
    @Transactional(rollbackFor = Exception.class)
    public Estudante buscarPorId(@PathParam("id") Long id) {
        Estudante c = estudanteDAO.get(id);
        return c;
    }
   
    //Insere novo registro
    @POST
    @Produces("application/json")
    @Transactional(rollbackFor = Exception.class)
    public boolean save(Estudante estu){
        estudanteDAO.saveOrUpdate(estu);
        return true;
    }
    
    //Atualiza registro
    @PUT
    @Produces("application/json")
    @Path("/atualiza")
    @Transactional(rollbackFor = Exception.class)
    public boolean update(Estudante estu){
        estudanteDAO.update(estu);
        return true;
    }
    
    //Deleta o registro pelo id
    @DELETE
    @Produces("application/json")
    @Path("/delete/{id}")
    @Transactional(rollbackFor = Exception.class)
    public boolean delete(@PathParam("id")Long id){
        return estudanteDAO.delete(id);
    }


}
