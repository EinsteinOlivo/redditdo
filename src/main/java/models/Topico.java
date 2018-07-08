/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "Topicos")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Topico.findAll", query = "SELECT t FROM Topico t")
    , @NamedQuery(name = "Topico.findByIdTopico", query = "SELECT t FROM Topico t WHERE t.idTopico = :idTopico")
    , @NamedQuery(name = "Topico.findByNombreTopico", query = "SELECT t FROM Topico t WHERE t.nombreTopico = :nombreTopico")
    , @NamedQuery(name = "Topico.findByFechaCreacionTopico", query = "SELECT t FROM Topico t WHERE t.fechaCreacionTopico = :fechaCreacionTopico")
    , @NamedQuery(name = "Topico.findByEstadoTopico", query = "SELECT t FROM Topico t WHERE t.estadoTopico = :estadoTopico")
})
public class Topico implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTopico")
    private Integer idTopico;
    
    @Size(max = 200)
    @Column(name = "NombreTopico")
    private String nombreTopico;
    
    @Column(name = "FechaCreacionTopico")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacionTopico;
    
    @Column(name = "EstadoTopico")
    private Boolean estadoTopico;
    
    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTopico")
    private List<PublicacionTopico> publicacionesTopicosList;

    public Topico()
    {
    }

    public Topico(Integer idTopico)
    {
        this.idTopico = idTopico;
    }

    public Integer getIdTopico()
    {
        return idTopico;
    }

    public void setIdTopico(Integer idTopico)
    {
        this.idTopico = idTopico;
    }

    public String getNombreTopico()
    {
        return nombreTopico;
    }

    public void setNombreTopico(String nombreTopico)
    {
        this.nombreTopico = nombreTopico;
    }

    public Date getFechaCreacionTopico()
    {
        return fechaCreacionTopico;
    }

    public void setFechaCreacionTopico(Date fechaCreacionTopico)
    {
        this.fechaCreacionTopico = fechaCreacionTopico;
    }

    public Boolean getEstadoTopico()
    {
        return estadoTopico;
    }

    public void setEstadoTopico(Boolean estadoTopico)
    {
        this.estadoTopico = estadoTopico;
    }

    public Usuario getIdUsuario()
    {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    @XmlTransient
    public List<PublicacionTopico> getPublicacionesTopicosList()
    {
        return publicacionesTopicosList;
    }

    public void setPublicacionesTopicosList(List<PublicacionTopico> publicacionesTopicosList)
    {
        this.publicacionesTopicosList = publicacionesTopicosList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idTopico != null ? idTopico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Topico))
        {
            return false;
        }
        Topico other = (Topico) object;
        if ((this.idTopico == null && other.idTopico != null) || (this.idTopico != null && !this.idTopico.equals(other.idTopico)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "models.Topicos[ idTopico=" + idTopico + " ]";
    }
}