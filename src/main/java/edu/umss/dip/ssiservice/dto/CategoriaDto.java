package edu.umss.dip.ssiservice.dto;

import edu.umss.dip.ssiservice.model.Categoria;

public class CategoriaDto extends DtoBase<Categoria> {
    private String nombre;
    private String descripcion;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
