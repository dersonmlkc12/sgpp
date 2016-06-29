
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.ProjetoDAO;
import br.ifms.sgpp.model.Projeto;
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
@Path("/projeto")
public class ProjetoService {

    @Autowired
    private ProjetoDAO projetoDAO;
//Lista todos os registros
    @GET
    @Produces("application/json")
    public List<Projeto> getProjeto() {
        List<Projeto> projetos = projetoDAO.getProjeto();
        return projetos;
    }
    
    //Busca registro pelo id
    @GET
    @Produces("application/json")
    @Path("{id}")
    @Transactional(rollbackFor = Exception.class)
    public Projeto buscarPorId(@PathParam("id") Long id) {
        Projeto c = projetoDAO.get(id);
        return c;
    }
   
    //Insere novo registro
    @POST
    @Produces("application/json")
    @Transactional(rollbackFor = Exception.class)
    public boolean save(Projeto estu){
        projetoDAO.saveOrUpdate(estu);
        return true;
    }
    
    //Atualiza registro
    @PUT
    @Produces("application/json")
     @Path("/atualiza")
    @Transactional(rollbackFor = Exception.class)
    public boolean update(Projeto estu){
        projetoDAO.update(estu);
        return true;
    }
    
    //Deleta o registro pelo id
    @DELETE
    @Produces("application/json")
    @Path("/delete/{id}")
    @Transactional(rollbackFor = Exception.class)
    public boolean delete(@PathParam("id")Long id){
        return projetoDAO.delete(id);
    }

}
