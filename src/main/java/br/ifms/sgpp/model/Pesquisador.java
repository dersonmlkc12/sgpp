package br.ifms.sgpp.model;

import br.ifms.sgpp.enums.SexoEnum;
import br.ifms.sgpp.enums.TitulacaoEnum;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

@Entity
public class Pesquisador implements Serializable {
    @Id
    @SequenceGenerator(name = "gen_pesquisador", sequenceName = "seq_pesquisador", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "gen_pesquisador", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private SexoEnum sexo;
    private String rg;
    private String rgOrgaoEmissor;
    private String rgUF;
    private String rgDataEmissao;
    private String matricula;
    private String lotacao;
    private String nacionalidade;
    private String pais;
    private String passaporte;
    private String visto;
    private String periodoVigencia;
    private String endereco;
    private String enderecoCEP;
    private String enderecoCidade;
    private String enderecoUF;
    private String telefone;
    private String celular;
    private String email;
    private TitulacaoEnum titulacao;
    private String curriculoLattesLink_;
    private String curriculoLattesDtAtualizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgOrgaoEmissor() {
        return rgOrgaoEmissor;
    }

    public void setRgOrgaoEmissor(String rgOrgaoEmissor) {
        this.rgOrgaoEmissor = rgOrgaoEmissor;
    }

    public String getRgUF() {
        return rgUF;
    }

    public void setRgUF(String rgUF) {
        this.rgUF = rgUF;
    }

    public String getRgDataEmissao() {
        return rgDataEmissao;
    }

    public void setRgDataEmissao(String rgDataEmissao) {
        this.rgDataEmissao = rgDataEmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }

    public String getPeriodoVigencia() {
        return periodoVigencia;
    }

    public void setPeriodoVigencia(String periodoVigencia) {
        this.periodoVigencia = periodoVigencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoCEP() {
        return enderecoCEP;
    }

    public void setEnderecoCEP(String enderecoCEP) {
        this.enderecoCEP = enderecoCEP;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoUF() {
        return enderecoUF;
    }

    public void setEnderecoUF(String enderecoUF) {
        this.enderecoUF = enderecoUF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TitulacaoEnum getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(TitulacaoEnum titulacao) {
        this.titulacao = titulacao;
    }

    public String getCurriculoLattesLink_() {
        return curriculoLattesLink_;
    }

    public void setCurriculoLattesLink_(String curriculoLattesLink_) {
        this.curriculoLattesLink_ = curriculoLattesLink_;
    }

    public String getCurriculoLattesDtAtualizacao() {
        return curriculoLattesDtAtualizacao;
    }

    public void setCurriculoLattesDtAtualizacao(String curriculoLattesDtAtualizacao) {
        this.curriculoLattesDtAtualizacao = curriculoLattesDtAtualizacao;
    }
    
    
    
    
}
