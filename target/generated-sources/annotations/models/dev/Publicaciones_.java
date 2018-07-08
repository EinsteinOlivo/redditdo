package models.dev;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Comentarios;
import models.Publicacion;
import models.PublicacionTopico;
import models.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Publicaciones.class)
public class Publicaciones_ { 

    public static volatile SingularAttribute<Publicacion, String> imagenPublicacion;
    public static volatile SingularAttribute<Publicacion, String> tituloPublicacion;
    public static volatile ListAttribute<Publicacion, Comentarios> comentariosList;
    public static volatile SingularAttribute<Publicacion, Long> likesPublicacion;
    public static volatile SingularAttribute<Publicacion, Usuario> idUsuario;
    public static volatile SingularAttribute<Publicacion, String> contenidoPublicacion;
    public static volatile SingularAttribute<Publicacion, Date> fechaPublicacion;
    public static volatile SingularAttribute<Publicacion, Integer> idPublicacion;
    public static volatile ListAttribute<Publicacion, PublicacionTopico> publicacionesTopicosList;

}