package br.ifms.sgpp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author derson
 */
@Entity
public class PlanoDeTrabalho implements Serializable {
    @Id
    @SequenceGenerator(name = "gen_plano", sequenceName = "seq_plano", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "gen_plano", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Projeto projeto;
    @ManyToOne
    private Pesquisador orientador;
    @ManyToOne
    private Estudante estudante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Pesquisador getOrientador() {
        return orientador;
    }

    public void setOrientador(Pesquisador orientador) {
        this.orientador = orientador;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
    
    
    
    
    
    
}
