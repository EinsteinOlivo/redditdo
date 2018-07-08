package models.dev;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.PublicacionesTopicos;
import models.Topicos;
import models.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(Topicos.class)
public class Topicos_ { 

    public static volatile SingularAttribute<Topicos, String> nombreTopico;
    public static volatile SingularAttribute<Topicos, Date> fechaCreacionTopico;
    public static volatile SingularAttribute<Topicos, Usuarios> idUsuario;
    public static volatile SingularAttribute<Topicos, Integer> idTopico;
    public static volatile ListAttribute<Topicos, PublicacionesTopicos> publicacionesTopicosList;
    public static volatile SingularAttribute<Topicos, Boolean> estadoTopico;

}