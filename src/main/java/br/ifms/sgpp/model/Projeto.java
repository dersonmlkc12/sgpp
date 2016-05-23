package br.ifms.sgpp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Projeto implements Serializable {
    @Id
    @SequenceGenerator(name = "gen_projeto", sequenceName = "seq_projeto", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "gen_projeto", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
