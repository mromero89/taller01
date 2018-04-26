package frsf.isi.died.tp.modelo;

import java.util.ArrayList;
import java.util.Collection;

import frsf.isi.died.tp.modelo.productos.MaterialCapacitacion;

public class BibliotecaList implements Biblioteca{

	ArrayList<MaterialCapacitacion> materiales;
	
	public BibliotecaList() {
		this.materiales=new ArrayList<MaterialCapacitacion>();
	}
	
	@Override
	public void agregar(MaterialCapacitacion mat) {
		this.materiales.add(mat);
		
	}

	@Override
	public Integer cantidadMateriales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer cantidadLibros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer cantidadVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<MaterialCapacitacion> materiales() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenarPorPrecio(Boolean b) {
		// TODO Auto-generated method stub
		
	}

}
