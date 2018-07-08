/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "PublicacionesTopicos")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "PublicacionTopico.findAll", query = "SELECT p FROM PublicacionTopico p")
    , @NamedQuery(name = "PublicacionTopico.findByIdPublicacionTopico", query = "SELECT p FROM PublicacionTopico p WHERE p.idPublicacionTopico = :idPublicacionTopico")
})
public class PublicacionTopico implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPublicacionTopico")
    private Integer idPublicacionTopico;
    
    @JoinColumn(name = "IdPublicacion", referencedColumnName = "IdPublicacion")
    @ManyToOne(optional = false)
    private Publicacion idPublicacion;
    
    @JoinColumn(name = "IdTopico", referencedColumnName = "IdTopico")
    @ManyToOne(optional = false)
    private Topico idTopico;

    public PublicacionTopico()
    {
    }

    public PublicacionTopico(Integer idPublicacionTopico)
    {
        this.idPublicacionTopico = idPublicacionTopico;
    }

    public Integer getIdPublicacionTopico()
    {
        return idPublicacionTopico;
    }

    public void setIdPublicacionTopico(Integer idPublicacionTopico)
    {
        this.idPublicacionTopico = idPublicacionTopico;
    }

    public Publicacion getIdPublicacion()
    {
        return idPublicacion;
    }

    public void setIdPublicacion(Publicacion idPublicacion)
    {
        this.idPublicacion = idPublicacion;
    }

    public Topico getIdTopico()
    {
        return idTopico;
    }

    public void setIdTopico(Topico idTopico)
    {
        this.idTopico = idTopico;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idPublicacionTopico != null ? idPublicacionTopico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PublicacionTopico))
        {
            return false;
        }
        PublicacionTopico other = (PublicacionTopico) object;
        if ((this.idPublicacionTopico == null && other.idPublicacionTopico != null) || (this.idPublicacionTopico != null && !this.idPublicacionTopico.equals(other.idPublicacionTopico)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "models.PublicacionesTopicos[ idPublicacionTopico=" + idPublicacionTopico + " ]";
    }
    
}