package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pers_sec")
	@SequenceGenerator(name = "pers_sec", sequenceName = "pers_sec", allocationSize = 1)
	@Column(name="pers_id")
	private Integer id;
	@Column(name="pers_nombre")
	private String nombre;
	@Column(name="pers_cedula")
	private String cedula;
	@Column(name="pers_apellido")
	private String apellido;
	@Column(name="pers_genero")
	private String genero;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", apellido=" + apellido
				+ ", genero=" + genero + "]";
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
	
		
	
}
