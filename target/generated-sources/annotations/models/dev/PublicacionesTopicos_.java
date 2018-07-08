package models.dev;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Publicaciones;
import models.PublicacionesTopicos;
import models.Topicos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-08T12:39:47")
@StaticMetamodel(PublicacionesTopicos.class)
public class PublicacionesTopicos_ { 

    public static volatile SingularAttribute<PublicacionesTopicos, Integer> idPublicacionTopico;
    public static volatile SingularAttribute<PublicacionesTopicos, Topicos> idTopico;
    public static volatile SingularAttribute<PublicacionesTopicos, Publicaciones> idPublicacion;

}