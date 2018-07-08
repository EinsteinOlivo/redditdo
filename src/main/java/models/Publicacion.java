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
@Table(name = "Publicaciones")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Publicacion.findAll", query = "SELECT p FROM Publicacion p")
    , @NamedQuery(name = "Publicacion.findByIdPublicacion", query = "SELECT p FROM Publicacion p WHERE p.idPublicacion = :idPublicacion")
    , @NamedQuery(name = "Publicacion.findByTituloPublicacion", query = "SELECT p FROM Publicacion p WHERE p.tituloPublicacion = :tituloPublicacion")
    , @NamedQuery(name = "Publicacion.findByContenidoPublicacion", query = "SELECT p FROM Publicacion p WHERE p.contenidoPublicacion = :contenidoPublicacion")
    , @NamedQuery(name = "Publicacion.findByImagenPublicacion", query = "SELECT p FROM Publicacion p WHERE p.imagenPublicacion = :imagenPublicacion")
    , @NamedQuery(name = "Publicacion.findByFechaPublicacion", query = "SELECT p FROM Publicacion p WHERE p.fechaPublicacion = :fechaPublicacion")
    , @NamedQuery(name = "Publicacion.findByLikesPublicacion", query = "SELECT p FROM Publicacion p WHERE p.likesPublicacion = :likesPublicacion")
})
public class Publicacion implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPublicacion")
    private Integer idPublicacion;
    
    @Size(max = 100)
    @Column(name = "TituloPublicacion")
    private String tituloPublicacion;
    
    @Size(max = 10000)
    @Column(name = "ContenidoPublicacion")
    private String contenidoPublicacion;
    
    @Size(max = 10000)
    @Column(name = "ImagenPublicacion")
    private String imagenPublicacion;
    
    @Column(name = "FechaPublicacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPublicacion;
    
    @Column(name = "LikesPublicacion")
    private Long likesPublicacion;
    
    @JoinColumn(name = "IdUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPublicacion")
    private List<Comentario> comentariosList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPublicacion")
    private List<PublicacionTopico> publicacionesTopicosList;

    public Publicacion()
    {
    }

    public Publicacion(Integer idPublicacion)
    {
        this.idPublicacion = idPublicacion;
    }

    public Integer getIdPublicacion()
    {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion)
    {
        this.idPublicacion = idPublicacion;
    }

    public String getTituloPublicacion()
    {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion)
    {
        this.tituloPublicacion = tituloPublicacion;
    }

    public String getContenidoPublicacion()
    {
        return contenidoPublicacion;
    }

    public void setContenidoPublicacion(String contenidoPublicacion)
    {
        this.contenidoPublicacion = contenidoPublicacion;
    }

    public String getImagenPublicacion()
    {
        return imagenPublicacion;
    }

    public void setImagenPublicacion(String imagenPublicacion)
    {
        this.imagenPublicacion = imagenPublicacion;
    }

    public Date getFechaPublicacion()
    {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion)
    {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Long getLikesPublicacion()
    {
        return likesPublicacion;
    }

    public void setLikesPublicacion(Long likesPublicacion)
    {
        this.likesPublicacion = likesPublicacion;
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
    public List<Comentario> getComentariosList()
    {
        return comentariosList;
    }

    public void setComentariosList(List<Comentario> comentariosList)
    {
        this.comentariosList = comentariosList;
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
        hash += (idPublicacion != null ? idPublicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publicacion))
        {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.idPublicacion == null && other.idPublicacion != null) || (this.idPublicacion != null && !this.idPublicacion.equals(other.idPublicacion)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "models.Publicaciones[ idPublicacion=" + idPublicacion + " ]";
    }
    
}
