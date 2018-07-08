/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "Usuarios")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuario.findByNickNameUsuario", query = "SELECT u FROM Usuario u WHERE u.nickNameUsuario = :nickNameUsuario")
    , @NamedQuery(name = "Usuario.findByClaveUsuario", query = "SELECT u FROM Usuario u WHERE u.claveUsuario = :claveUsuario")
    , @NamedQuery(name = "Usuario.findByCorreoUsuario", query = "SELECT u FROM Usuario u WHERE u.correoUsuario = :correoUsuario")
})
public class Usuario implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    
    @Size(max = 100)
    @Column(name = "NombreUsuario")
    private String nombreUsuario;
    
    @Size(max = 35)
    @Column(name = "NickNameUsuario")
    private String nickNameUsuario;
    
    @Size(max = 35)
    @Column(name = "ClaveUsuario")
    private String claveUsuario;
    
    @Size(max = 60)
    @Column(name = "CorreoUsuario")
    private String correoUsuario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<Publicacion> publicacionesList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<Topico> topicosList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario")
    private List<Comentario> comentariosList;

    public Usuario()
    {
    }

    public Usuario(Integer idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario()
    {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario)
    {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNickNameUsuario()
    {
        return nickNameUsuario;
    }

    public void setNickNameUsuario(String nickNameUsuario)
    {
        this.nickNameUsuario = nickNameUsuario;
    }

    public String getClaveUsuario()
    {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario)
    {
        this.claveUsuario = claveUsuario;
    }

    public String getCorreoUsuario()
    {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario)
    {
        this.correoUsuario = correoUsuario;
    }

    @XmlTransient
    public List<Publicacion> getPublicacionesList()
    {
        return publicacionesList;
    }

    public void setPublicacionesList(List<Publicacion> publicacionesList)
    {
        this.publicacionesList = publicacionesList;
    }

    @XmlTransient
    public List<Topico> getTopicosList()
    {
        return topicosList;
    }

    public void setTopicosList(List<Topico> topicosList)
    {
        this.topicosList = topicosList;
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

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario))
        {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "models.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
