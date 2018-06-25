/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA.Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jacky
 */
@Entity
@Table(name = "DISTRIBUIDOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distribuidor.findAll", query = "SELECT d FROM Distribuidor d")
    , @NamedQuery(name = "Distribuidor.findByIdDistribuidor", query = "SELECT d FROM Distribuidor d WHERE d.idDistribuidor = :idDistribuidor")
    , @NamedQuery(name = "Distribuidor.findByNombre", query = "SELECT d FROM Distribuidor d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Distribuidor.findByDireccion", query = "SELECT d FROM Distribuidor d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Distribuidor.findByEmail", query = "SELECT d FROM Distribuidor d WHERE d.email = :email")
    , @NamedQuery(name = "Distribuidor.findByTelefono", query = "SELECT d FROM Distribuidor d WHERE d.telefono = :telefono")})
public class Distribuidor implements Serializable {

    @OneToMany(mappedBy = "idDistribuidor")
    private Collection<Compra> compraCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DISTRIBUIDOR")
    private Integer idDistribuidor;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 40)
    @Column(name = "DIRECCION")
    private String direccion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 30)
    @Column(name = "TELEFONO")
    private String telefono;

    public Distribuidor() {
    }

    public Distribuidor(Integer idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public Integer getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(Integer idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDistribuidor != null ? idDistribuidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distribuidor)) {
            return false;
        }
        Distribuidor other = (Distribuidor) object;
        if ((this.idDistribuidor == null && other.idDistribuidor != null) || (this.idDistribuidor != null && !this.idDistribuidor.equals(other.idDistribuidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Entidades.Distribuidor[ idDistribuidor=" + idDistribuidor + " ]";
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }
    
}
