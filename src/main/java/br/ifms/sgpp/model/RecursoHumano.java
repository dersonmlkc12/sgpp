
package br.ifms.sgpp.model;

import br.ifms.sgpp.enums.TipoParticipacaoEnum;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
public class RecursoHumano implements Serializable {
    @Id
    @SequenceGenerator(name = "gen_recursos", sequenceName = "seq_recursos", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "gen_recursos", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Projeto projeto;
    @ManyToOne
    private Pesquisador pesquisador;
    @Enumerated
    private TipoParticipacaoEnum tipoParticipacao;
    @ManyToOne
    private Estudante estudante; 
    private int cargaHoraria;
    private String atribuicoes;

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    
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

    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }

    public TipoParticipacaoEnum getTipoParticipacao() {
        return tipoParticipacao;
    }

    public void setTipoParticipacao(TipoParticipacaoEnum tipoParticipacao) {
        this.tipoParticipacao = tipoParticipacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getAtribuicoes() {
        return atribuicoes;
    }

    public void setAtribuicoes(String atribuicoes) {
        this.atribuicoes = atribuicoes;
    }    
}
