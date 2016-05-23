/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.sgpp.rest;

import br.ifms.sgpp.dao.ProjetoDAO;
import br.ifms.sgpp.model.Projeto;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Gustavo
 */
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
