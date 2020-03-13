package METODOS_CONTROLADORES;

import METODOS_CONTROLADORES.Ubicacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-03-12T19:41:58")
@StaticMetamodel(Contacto.class)
public class Contacto_ { 

    public static volatile SingularAttribute<Contacto, Integer> codigopersona;
    public static volatile SingularAttribute<Contacto, Integer> numerotelefono;
    public static volatile SingularAttribute<Contacto, Ubicacion> ubicacionCodigoarea;
    public static volatile SingularAttribute<Contacto, String> apellido;
    public static volatile SingularAttribute<Contacto, String> organizacion;
    public static volatile SingularAttribute<Contacto, String> nombre;

}