package METODOS_CONTROLADORES;

import METODOS_CONTROLADORES.Contacto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-03-12T19:41:58")
@StaticMetamodel(Ubicacion.class)
public class Ubicacion_ { 

    public static volatile SingularAttribute<Ubicacion, Integer> codigoarea;
    public static volatile CollectionAttribute<Ubicacion, Contacto> contactoCollection;
    public static volatile SingularAttribute<Ubicacion, String> pais;

}