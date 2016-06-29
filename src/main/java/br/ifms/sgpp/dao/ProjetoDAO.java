package br.ifms.sgpp.dao;

import br.ifms.sgpp.model.Projeto;
import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings("unchecked")
public class ProjetoDAO extends HibernateDAO<Projeto> {

    public ProjetoDAO() {
        super(Projeto.class);
    }

    public List<Projeto> getProjeto() {
        Query q = getSession().createQuery("from Projeto");
        List<Projeto> projetos = q.list();
        return projetos;
    }

    public boolean delete(Long id) {
        Projeto e = get(id);
        delete(e);
        return true;
    }
}
