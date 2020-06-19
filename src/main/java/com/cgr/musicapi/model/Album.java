package com.cgr.musicapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Album")
public class Album {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private double precio;
	private String genero;
	
	
	public Album() {}


	public Album(int id, String titulo, Date lanzado, double precio, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.genero = genero;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Albums [id=" + id + ", titulo=" + titulo + ", precio=" + precio + ", genero="
				+ genero + "]";
	}
	
	
	

}
