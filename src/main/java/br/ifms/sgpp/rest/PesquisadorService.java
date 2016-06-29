
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.EstudanteDAO;
import br.ifms.sgpp.dao.PesquisadorDAO;
import br.ifms.sgpp.model.Estudante;
import br.ifms.sgpp.model.Pesquisador;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Path("/pesquisador")
public class PesquisadorService {

    @Autowired
    private PesquisadorDAO pesquisadorDAO;

    //Lista todos os registros
    @GET
    @Produces("application/json")
    public List<Pesquisador> getEstudante() {
        List<Pesquisador> pesquisadores = pesquisadorDAO.getPesquisador();
        return pesquisadores;
    }
    
    //Busca registro pelo id
    @GET
    @Produces("application/json")
    @Path("{id}")
    @Transactional(rollbackFor = Exception.class)
    public Pesquisador buscarPorId(@PathParam("id") Long id) {
        Pesquisador c = pesquisadorDAO.get(id);
        return c;
    }
   
    //Insere novo registro
    @POST
    @Produces("application/json")
    @Transactional(rollbackFor = Exception.class)
    public boolean save(Pesquisador estu){
        pesquisadorDAO.saveOrUpdate(estu);
        return true;
    }
    
    //Atualiza registro
    @PUT
    @Produces("application/json")
     @Path("/atualiza")
    @Transactional(rollbackFor = Exception.class)
    public boolean update(Pesquisador estu){
        pesquisadorDAO.update(estu);
        return true;
    }
    
    //Deleta o registro pelo id
    @DELETE
    @Produces("application/json")
    @Path("/delete/{id}")
    @Transactional(rollbackFor = Exception.class)
    public boolean delete(@PathParam("id")Long id){
        return pesquisadorDAO.delete(id);
    }


}