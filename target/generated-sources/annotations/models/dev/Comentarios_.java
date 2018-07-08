package models.dev;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Comentario;
import models.Publicacion;
import models.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Comentarios.class)
public class Comentarios_ { 

    public static volatile SingularAttribute<Comentario, Date> fechaComentario;
    public static volatile SingularAttribute<Comentario, Usuario> idUsuario;
    public static volatile SingularAttribute<Comentario, String> contenidoComentario;
    public static volatile SingularAttribute<Comentario, Publicacion> idPublicacion;
    public static volatile SingularAttribute<Comentario, Integer> idComentario;

}