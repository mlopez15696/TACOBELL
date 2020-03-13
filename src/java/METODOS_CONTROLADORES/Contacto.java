/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS_CONTROLADORES;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "contacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c")
    , @NamedQuery(name = "Contacto.findByCodigopersona", query = "SELECT c FROM Contacto c WHERE c.codigopersona = :codigopersona")
    , @NamedQuery(name = "Contacto.findByNombre", query = "SELECT c FROM Contacto c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Contacto.findByApellido", query = "SELECT c FROM Contacto c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Contacto.findByNumerotelefono", query = "SELECT c FROM Contacto c WHERE c.numerotelefono = :numerotelefono")
    , @NamedQuery(name = "Contacto.findByOrganizacion", query = "SELECT c FROM Contacto c WHERE c.organizacion = :organizacion")})
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigopersona")
    private Integer codigopersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numerotelefono")
    private int numerotelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "organizacion")
    private String organizacion;
    @JoinColumn(name = "ubicacion_codigoarea", referencedColumnName = "codigoarea")
    @ManyToOne(optional = false)
    private Ubicacion ubicacionCodigoarea;

    public Contacto() {
    }

    public Contacto(Integer codigopersona) {
        this.codigopersona = codigopersona;
    }

    public Contacto(Integer codigopersona, String nombre, String apellido, int numerotelefono, String organizacion) {
        this.codigopersona = codigopersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerotelefono = numerotelefono;
        this.organizacion = organizacion;
    }

    public Integer getCodigopersona() {
        return codigopersona;
    }

    public void setCodigopersona(Integer codigopersona) {
        this.codigopersona = codigopersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(int numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public Ubicacion getUbicacionCodigoarea() {
        return ubicacionCodigoarea;
    }

    public void setUbicacionCodigoarea(Ubicacion ubicacionCodigoarea) {
        this.ubicacionCodigoarea = ubicacionCodigoarea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigopersona != null ? codigopersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.codigopersona == null && other.codigopersona != null) || (this.codigopersona != null && !this.codigopersona.equals(other.codigopersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "METODOS_CONTROLADORES.Contacto[ codigopersona=" + codigopersona + " ]";
    }
    
}
