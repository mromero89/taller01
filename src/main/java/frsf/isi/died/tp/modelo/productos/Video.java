package frsf.isi.died.tp.modelo.productos;

public class Video extends MaterialCapacitacion{
	public static Double costoSeg;
	public Integer duracion;
	
	//constructores
	public Video(){ super();}
	
	public Video(Integer id, String titulo)
	{
		super(id,titulo);
	}
	
	public Video(Integer id, String titulo, Double costo,Integer duracion)
	{
		this(id,titulo);
		Video.costoSeg=costo; this.duracion=duracion;
	}
	@Override
	public Double precio() {
		return new Double(super.getCosto()+(this.duracion*Video.costoSeg));
	}
	@Override
	public Boolean esLibro() {
		return false;
	}
	@Override
	public Boolean esVideo() {
		if(this instanceof Video) return true;
		return false;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return o instanceof Video && super.equals((MaterialCapacitacion)o);
	}
}
