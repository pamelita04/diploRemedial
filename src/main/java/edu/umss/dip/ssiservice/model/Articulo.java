package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.ArticuloDto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Articulo  extends ModelBase<ArticuloDto> {
    @OneToMany(fetch = FetchType.EAGER)
    private Categoria categoria;
    private String marca;
    private String modelo;
    private String imagen0;
    private String imagen1;
    private String imagen2;
    private String capacidad;
    @OneToOne(optional = false)
    private Gasto gasto;
    private int cantidad;
    @Column(columnDefinition = "char(1)")
    private String estado;

    @ManyToMany(mappedBy = "articulos", fetch = FetchType.EAGER)
    private Set<Compra> compras = new HashSet<>();

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getImagen0() {
        return imagen0;
    }

    public void setImagen0(String imagen0) {
        this.imagen0 = imagen0;
    }
    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Gasto getGasto() {
        return gasto;
    }

    public void setGasto(Gasto gasto) {
        this.gasto = gasto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }
}
