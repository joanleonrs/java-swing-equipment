package com.cibertec.edu.model;

/**
 *
 * @author joanleonrs
 */

public class Equipo {
    private int codigo;
    private String modelo;
    private String marca;
    private String categoria;
    private boolean disponible;
    
    public Equipo(){
        
    };

    public Equipo(int codigo, String modelo, String marca, String categoria, boolean disponible) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.categoria = categoria;
        this.disponible = disponible;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
