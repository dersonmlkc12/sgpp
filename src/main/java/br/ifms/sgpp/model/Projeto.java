package br.ifms.sgpp.model;

import br.ifms.sgpp.enums.StatusProjetoEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
public class Projeto implements Serializable {
    @Id
    @SequenceGenerator(name = "gen_projeto", sequenceName = "seq_projeto", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "gen_projeto", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusProjetoEnum status;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusProjetoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusProjetoEnum status) {
        this.status = status;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
}
