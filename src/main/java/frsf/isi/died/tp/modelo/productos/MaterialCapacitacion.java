/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frsf.isi.died.tp.modelo.productos;

import java.util.ArrayList;

import frsf.isi.died.tp.util.Ordenable;

/**
 * Representa de manera abstracta los materiales de capacitaciÃ³n
 * 
 * @author mdominguez
 */
public abstract class MaterialCapacitacion implements Ordenable{
	protected Integer id;
	/**
	 * Titulo del material
	 */
	protected String titulo;

	/**
	 * Costo bÃ¡sico que debe sumarse al precio por el mero hecho de publicarlo en el
	 * portal
	 */
	protected Double costo;
	

	

	/**
	 * Constructor por defecto
	 */
	public MaterialCapacitacion() {
		this(0,"en desarrollo",0.0);
	}

	/**
	 * Constructor que recibe como argumento un ID y un Titulo
	 * 
	 * @param id
	 * @param titulo
	 */
	public MaterialCapacitacion(Integer id, String titulo) {
		this(id,titulo,0.0);
	}

	/**
	 * Constructor que recibe como argumento un ID y un costo
	 * 
	 * @param id
	 * @param titulo
	 */
	public MaterialCapacitacion(Integer id,String titulo, Double costo) {
		this.id =id;
		this.titulo = titulo;
		this.costo = costo;
	}


	//TODO 01 implementar los metodos getters y setters y escribir el javadoc
	// AYUDA: para implementar estos metodos usar un atajo del IDE 
	// elegir el menu "Source" --> "Generate getters y setters" y elegir alli que metodos generar.
	
	/**@return retorna el id del material de la capacitación*/
	public Integer getId() {
		return id;
	}
	
	/**@param id del material de la capacitación*/
	public void setId(Integer id) {
		this.id = id;
	}

	/**@return retorna el titulo del material de la capacitación*/
	public String getTitulo() {
		return titulo;
	}

	/**@param titulo del material de la capacitación*/
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**@return retorna el costo del material de la capacitación*/
	public Double getCosto() {
		return this.costo;
	}

	/**@param costo del material de la capacitación*/
	public void setCosto(Double costo) {
		this.costo = costo;
	}

	/**
	 * El precio de un material se define segÃºn el tipo del material y toma como
	 * base el costo del mismo
	 * 
	 * @return
	 */
	public abstract Double precio();
	
	/**
	 * Retorna verdadero si es una instancia de libro, falso en caso contrario
	 * @return
	 */
	public abstract Boolean esLibro();

	/**
	 * Retorna verdadero si es una instancia de video, falso en caso contrario
	 * @return
	 */
	public abstract Boolean esVideo();
	
	//TODO 02: sobrescribir el metodo toString de la clase "Object"
	//	el mÃ©todo toString retorna un string que representa el material actual
	//  retornando el titulo, y el precio 	 * usando el formato : 
	// [Titulo: <titulo> ; Precio: <precio> ]
	
	public String toString(){return "[Titulo: "+this.titulo+" ; Precio: "+this.precio()+"]";}
	
	
	// TODO 10: implementar Ordenable
	//La primera clase concreta que herede una clase abstracta, 
	//que a su ve implementa una interface, 
	//proporciona la implementación de los métodos abstractos heredados.
	
	public final int valor() { return this.precio().intValue();}
}
