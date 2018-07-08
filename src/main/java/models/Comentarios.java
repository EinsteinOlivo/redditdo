/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "Comentarios")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Comentarios.findAll", query = "SELECT c FROM Comentarios c")
    , @NamedQuery(name = "Comentarios.findByIdComentario", query = "SELECT c FROM Comentarios c WHERE c.idComentario = :idComentario")
    , @NamedQuery(name = "Comentarios.findByContenidoComentario", query = "SELECT c FROM Comentarios c WHERE c.contenidoComentario = :contenidoComentario")
    , @NamedQuery(name = "Comentarios.findByFechaComentario", query = "SELECT c FROM Comentarios c WHERE c.fechaComentario = :fechaComentario")
})
public class Comentarios implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdComentario")
    private Integer idComentario;
    
    @Size(max = 10000)
    @Column(name = "ContenidoComentario")
    private String contenidoComentario;
    
    @Column(name = "FechaComentario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaComentario;
    
    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuarios idUsuario;
    
    @JoinColumn(name = "IdPublicacion", referencedColumnName = "IdPublicacion")
    @ManyToOne(optional = false)
    private Publicaciones idPublicacion;

    public Comentarios()
    {
    }

    public Comentarios(Integer idComentario)
    {
        this.idComentario = idComentario;
    }

    public Integer getIdComentario()
    {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario)
    {
        this.idComentario = idComentario;
    }

    public String getContenidoComentario()
    {
        return contenidoComentario;
    }

    public void setContenidoComentario(String contenidoComentario)
    {
        this.contenidoComentario = contenidoComentario;
    }

    public Date getFechaComentario()
    {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario)
    {
        this.fechaComentario = fechaComentario;
    }

    public Usuarios getIdUsuario()
    {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public Publicaciones getIdPublicacion()
    {
        return idPublicacion;
    }

    public void setIdPublicacion(Publicaciones idPublicacion)
    {
        this.idPublicacion = idPublicacion;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idComentario != null ? idComentario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comentarios))
        {
            return false;
        }
        Comentarios other = (Comentarios) object;
        if ((this.idComentario == null && other.idComentario != null) || (this.idComentario != null && !this.idComentario.equals(other.idComentario)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "models.Comentarios[ idComentario=" + idComentario + " ]";
    }
    
}
