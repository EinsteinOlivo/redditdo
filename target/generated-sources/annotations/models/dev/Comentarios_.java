package models.dev;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Comentarios;
import models.Publicaciones;
import models.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Comentarios.class)
public class Comentarios_ { 

    public static volatile SingularAttribute<Comentarios, Date> fechaComentario;
    public static volatile SingularAttribute<Comentarios, Usuarios> idUsuario;
    public static volatile SingularAttribute<Comentarios, String> contenidoComentario;
    public static volatile SingularAttribute<Comentarios, Publicaciones> idPublicacion;
    public static volatile SingularAttribute<Comentarios, Integer> idComentario;

}