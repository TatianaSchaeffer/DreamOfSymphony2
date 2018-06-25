/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA.Entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByNombreP", query = "SELECT p FROM Producto p WHERE p.nombreP = :nombreP")
    , @NamedQuery(name = "Producto.findByMarcaP", query = "SELECT p FROM Producto p WHERE p.marcaP = :marcaP")
    , @NamedQuery(name = "Producto.findByPrecioBruto", query = "SELECT p FROM Producto p WHERE p.precioBruto = :precioBruto")
    , @NamedQuery(name = "Producto.findByDescripcionP", query = "SELECT p FROM Producto p WHERE p.descripcionP = :descripcionP")
    , @NamedQuery(name = "Producto.findByStock", query = "SELECT p FROM Producto p WHERE p.stock = :stock")
    , @NamedQuery(name = "Producto.findByCategoriaP", query = "SELECT p FROM Producto p WHERE p.categoriaP = :categoriaP")})
public class Producto implements Serializable {

    @OneToMany(mappedBy = "idProducto")
    private Collection<Compra> compraCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;
    @Size(max = 50)
    @Column(name = "NOMBRE_P")
    private String nombreP;
    @Size(max = 30)
    @Column(name = "MARCA_P")
    private String marcaP;
    @Column(name = "PRECIO_BRUTO")
    private BigInteger precioBruto;
    @Size(max = 120)
    @Column(name = "DESCRIPCION_P")
    private String descripcionP;
    @Column(name = "STOCK")
    private BigInteger stock;
    @Size(max = 40)
    @Column(name = "CATEGORIA_P")
    private String categoriaP;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getMarcaP() {
        return marcaP;
    }

    public void setMarcaP(String marcaP) {
        this.marcaP = marcaP;
    }

    public BigInteger getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(BigInteger precioBruto) {
        this.precioBruto = precioBruto;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public BigInteger getStock() {
        return stock;
    }

    public void setStock(BigInteger stock) {
        this.stock = stock;
    }

    public String getCategoriaP() {
        return categoriaP;
    }

    public void setCategoriaP(String categoriaP) {
        this.categoriaP = categoriaP;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Entidades.Producto[ idProducto=" + idProducto + " ]";
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }
    
}
