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
			Collections.sort(this.materiales, (m1,m2)->(int)(m1.precio()-m2.precio()));
		}
		
	}
	
	@Override
	public MaterialCapacitacion buscar(Integer costo){
	Collections.sort(this.materiales, (m1, m2) -> (int)(m1.getCosto()-m2.getCosto()));
	
	try {
	return buscadorBinario(0,this.cantidadMateriales(), costo);
	}catch(RuntimeException ex) {throw ex;}
	
	}
	
	private MaterialCapacitacion buscadorBinario(Integer i,Integer f, Integer c) throws RuntimeException{
		
		if(f < i) throw new RuntimeException("Material de precio" + c +" no encontrado");
		
		int medio = (i + f)/2;
		if (c < this.materiales.get(medio).getCosto())
			return buscadorBinario(i,medio-1,c);
		if (c > this.materiales.get(medio).getCosto())
			return buscadorBinario(medio + 1,f,c);
		if (c==this.materiales.get(medio).getCosto().intValue())
			{
			//System.out.println("encontrado");
			return this.materiales.get(medio);
			}
		
		throw new RuntimeException("Material de precio" + c +" no encontrado");
	}

}
