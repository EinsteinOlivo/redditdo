package models.dev;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Comentarios;
import models.Publicaciones;
import models.PublicacionesTopicos;
import models.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Publicaciones.class)
public class Publicaciones_ { 

    public static volatile SingularAttribute<Publicaciones, String> imagenPublicacion;
    public static volatile SingularAttribute<Publicaciones, String> tituloPublicacion;
    public static volatile ListAttribute<Publicaciones, Comentarios> comentariosList;
    public static volatile SingularAttribute<Publicaciones, Long> likesPublicacion;
    public static volatile SingularAttribute<Publicaciones, Usuarios> idUsuario;
    public static volatile SingularAttribute<Publicaciones, String> contenidoPublicacion;
    public static volatile SingularAttribute<Publicaciones, Date> fechaPublicacion;
    public static volatile SingularAttribute<Publicaciones, Integer> idPublicacion;
    public static volatile ListAttribute<Publicaciones, PublicacionesTopicos> publicacionesTopicosList;

}