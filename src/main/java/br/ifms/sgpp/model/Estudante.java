
package br.ifms.sgpp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudante implements Serializable {
@Id
private Long id;
private String nome;
private String data_Nascimento;
private String sexo;
private String rg;
private String rg_orgao_Emissor;
private String rg_UF;
private String rg_data_Emissao;
private String matricula;
private String nacionalidade;
private String pais;
private String passaporte;
private String visto;
private String periodo_Vigencia;
private String endereco;
private String endereco_CEP;
private String endereco_cidade;
private String endereco_UF;
private String Telefone;
private String Celular;
private String email;
private String curriculo_Lattes_Link_;
private String curriculo_Lattes_dt_Atualizacao;
//private String programa;
//private String categoria;
private String curso;
private String curso_semestre;
private String curso_conclusao_mes_ano;
private String curso_campus;
private String curso_coordenacao;

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

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg_orgao_Emissor() {
        return rg_orgao_Emissor;
    }

    public void setRg_orgao_Emissor(String rg_orgao_Emissor) {
        this.rg_orgao_Emissor = rg_orgao_Emissor;
    }

    public String getRg_UF() {
        return rg_UF;
    }

    public void setRg_UF(String rg_UF) {
        this.rg_UF = rg_UF;
    }

    public String getRg_data_Emissao() {
        return rg_data_Emissao;
    }

    public void setRg_data_Emissao(String rg_data_Emissao) {
        this.rg_data_Emissao = rg_data_Emissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getPeriodo_Vigencia() {
        return periodo_Vigencia;
    }

    public void setPeriodo_Vigencia(String periodo_Vigencia) {
        this.periodo_Vigencia = periodo_Vigencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco_CEP() {
        return endereco_CEP;
    }

    public void setEndereco_CEP(String endereco_CEP) {
        this.endereco_CEP = endereco_CEP;
    }

    public String getEndereco_cidade() {
        return endereco_cidade;
    }

    public void setEndereco_cidade(String endereco_cidade) {
        this.endereco_cidade = endereco_cidade;
    }

    public String getEndereco_UF() {
        return endereco_UF;
    }

    public void setEndereco_UF(String endereco_UF) {
        this.endereco_UF = endereco_UF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurriculo_Lattes_Link_() {
        return curriculo_Lattes_Link_;
    }

    public void setCurriculo_Lattes_Link_(String curriculo_Lattes_Link_) {
        this.curriculo_Lattes_Link_ = curriculo_Lattes_Link_;
    }

    public String getCurriculo_Lattes_dt_Atualizacao() {
        return curriculo_Lattes_dt_Atualizacao;
    }

    public void setCurriculo_Lattes_dt_Atualizacao(String curriculo_Lattes_dt_Atualizacao) {
        this.curriculo_Lattes_dt_Atualizacao = curriculo_Lattes_dt_Atualizacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso_semestre() {
        return curso_semestre;
    }

    public void setCurso_semestre(String curso_semestre) {
        this.curso_semestre = curso_semestre;
    }

    public String getCurso_conclusao_mes_ano() {
        return curso_conclusao_mes_ano;
    }

    public void setCurso_conclusao_mes_ano(String curso_conclusao_mes_ano) {
        this.curso_conclusao_mes_ano = curso_conclusao_mes_ano;
    }

    public String getCurso_campus() {
        return curso_campus;
    }

    public void setCurso_campus(String curso_campus) {
        this.curso_campus = curso_campus;
    }

    public String getCurso_coordenacao() {
        return curso_coordenacao;
    }

    public void setCurso_coordenacao(String curso_coordenacao) {
        this.curso_coordenacao = curso_coordenacao;
    }

    
}
