package models.dev;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Comentarios;
import models.Publicaciones;
import models.Topicos;
import models.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile ListAttribute<Usuarios, Topicos> topicosList;
    public static volatile SingularAttribute<Usuarios, String> nickNameUsuario;
    public static volatile ListAttribute<Usuarios, Publicaciones> publicacionesList;
    public static volatile SingularAttribute<Usuarios, String> correoUsuario;
    public static volatile ListAttribute<Usuarios, Comentarios> comentariosList;
    public static volatile SingularAttribute<Usuarios, String> claveUsuario;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> nombreUsuario;

}