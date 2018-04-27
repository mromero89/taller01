package frsf.isi.died.tp.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
	return new Integer(this.materiales.size());
	}

	@Override
	public Integer cantidadLibros() {
	int sum=0;
	for(MaterialCapacitacion mc: materiales)
	   if(mc.esLibro()) sum++;
    return new Integer(sum);
	}

	@Override
	public Integer cantidadVideos() {
		int sum=0;
		for(MaterialCapacitacion mc: materiales)
		   if(mc.esVideo()) sum++;
	    return new Integer(sum);
	}

	@Override
	public Collection<MaterialCapacitacion> materiales() {
		return this.materiales;
	}

	@Override
	public void imprimir() {
		for(MaterialCapacitacion mc: materiales)
			System.out.println(mc);
	}

	@Override
	public void ordenarPorPrecio(Boolean b) {
		if(b)
			Collections.sort(this.materiales);
		else
		{
			Collections.sort(this.materiales, (m1,m2)->m1.precio().intValue()-m2.precio().intValue());
		}
		
	}
	
	@Override
	public MaterialCapacitacion buscar(Integer precio) {
	Collections.sort(this.materiales, (m1, m2) -> m1.getCosto()-m2.getCosto());
	return buscadorBinario(…., ….., precio);
	}
	private MaterialCapacitacion buscadorBinario(Integer i,Integer f, Integer c){
		return null;
	}

}
