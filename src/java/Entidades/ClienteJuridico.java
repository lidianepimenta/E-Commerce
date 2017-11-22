/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 
 */
@Entity
@Table(name = "CLIENTE_JURIDICO")

public class ClienteJuridico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Size(max = 50)
    @Column(name = "NOME_FANTASIA")
    private String nomeFantasia;
    @Column(name = "TELEFONE")
    private Long telefone;
    @Column(name = "CNPJ")
    private BigInteger cnpj;
    @Size(max = 60)
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    @Column(name = "INSCRICAO_ESTADUAL")
    private Long inscricaoEstadual;
    @Size(max = 60)
    @Column(name = "RUA")
    private String rua;
    @Column(name = "CEP")
    private Long cep;
    @Size(max = 15)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 15)
    @Column(name = "CIDADE")
    private String cidade;
    @Size(max = 20)
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "NUMERO")
    private Integer numero;

    public ClienteJuridico() {
    }

    public ClienteJuridico(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public BigInteger getCnpj() {
        return cnpj;
    }

    public void setCnpj(BigInteger cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Long getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(Long inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteJuridico)) {
            return false;
        }
        ClienteJuridico other = (ClienteJuridico) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ClienteJuridico[ idCliente=" + idCliente + " ]";
    }
    
}
