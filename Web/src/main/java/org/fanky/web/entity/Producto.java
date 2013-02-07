package org.fanky.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
/**
 * entidad de productos
 * @author fanky
 *
 */
@Entity
@Table(name="PRODUCTOS")
public class Producto {
	public Producto(){
		this.id = -1;
		this.nombre = "Nombre";
		this.precio = 0f;
	}
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
 
    @Column(name="NOMBRE")
    private String nombre;
 
    @Column(name="PRECIO")
    private float precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
    
    
}