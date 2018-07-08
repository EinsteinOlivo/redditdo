package models.dev;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Comentarios;
import models.Publicaciones;
import models.Topicos;
import models.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile ListAttribute<Usuario, Topicos> topicosList;
    public static volatile SingularAttribute<Usuario, String> nickNameUsuario;
    public static volatile ListAttribute<Usuario, Publicaciones> publicacionesList;
    public static volatile SingularAttribute<Usuario, String> correoUsuario;
    public static volatile ListAttribute<Usuario, Comentarios> comentariosList;
    public static volatile SingularAttribute<Usuario, String> claveUsuario;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;

}