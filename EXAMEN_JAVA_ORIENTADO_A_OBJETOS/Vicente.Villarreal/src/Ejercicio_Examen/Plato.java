package Ejercicio_Examen;
/**
 * Ejericio de plato y vino,
 * orientacion a objetos, primera clase, clase Plato
 * @author estudiante
 *
 */
public class Plato {
	
	//atributos//
	private String nombre;
	private Double precio;
	public static Double iva=0.21;
	private Double precioVentaPublico;
	private Vino vinoRecomendado;
	private Integer GradosRecomendados;
	private String vino;
	private Integer graduacion;
	
	
	//constructores//
	public Plato(String nombre) {
		this.nombre = nombre;
	}


	public Plato(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
		if (precio>0.0) {
			System.out.println("Plato creado con exito");
		}else {
			throw new PlatoExceptions("Error de precio, imposible crear el plato");
		}
	}

	//metodos//
	
	public Double incrementaPrecio(Double incremento) {
		Double preciofinal=0.0;
		
		preciofinal=this.precio+incremento;
		
		return preciofinal;
		

		
	}
	
	public Double precioVentaAlPublico() {
		Double precioVentaAlPublico=0.0;
		
		precioVentaAlPublico= this.precio+(this.precio*this.iva);
		
		
		
		return precioVentaAlPublico;
	}
	
	
	
//getter y setter//
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public static Double getIva() {
		return iva;
	}


	public static void setIva(Double iva) {
		Plato.iva = iva;
	}


	public Double getPrecioVentaPublico() {
		return precioVentaPublico;
	}


	public void setPrecioVentaPublico(Double precioVentaPublico) {
		this.precioVentaPublico = precioVentaPublico;
	}


	public Vino getVinoRecomendado() {
		return vinoRecomendado;
	}


	public void setVinoRecomendado(Vino vinoRecomendado) {
		this.vinoRecomendado = vinoRecomendado;
	}
	
	public void setVinoRecomendado2(String vino, Integer graduacion) {
		this.vino=vino;
		this.graduacion=graduacion;
	}
	



	public Integer getGradosRecomendados() {
		return GradosRecomendados;
	}


	public void setGradosRecomendados(Integer gradosRecomendados) {
		GradosRecomendados = gradosRecomendados;
	}
	
	
	public String getVino() {
		return vino;
	}


	public void setVino(String vino) {
		this.vino = vino;
	}


	public Integer getGraduacion() {
		return graduacion;
	}


	public void setGraduacion(Integer graduacion) {
		this.graduacion = graduacion;
	}


	public boolean equals(Plato platonuevo) {
		boolean sonLoMismo = false;
		
		platonuevo = (Plato) platonuevo;
		
		sonLoMismo = this.nombre.equals(platonuevo.getNombre());
		
		return sonLoMismo;
	
	
}
	public String toString () {
		StringBuilder sb= new StringBuilder();
		sb.append("\n el nombre del plato es:\n");
		sb.append(getNombre());
		sb.append("\n el precio sin iva es:\n");
		sb.append(getPrecio());
		sb.append("\n el nombre del vino es:\n");
		sb.append(getVinoRecomendado());
		sb.append("\n la graduacion del vino es:\n");
		sb.append(getGradosRecomendados());
		sb.append("\n el iva del plato es:\n");
		sb.append(getIva());
		sb.append("\n el precio de venta del vino es:\n");
		sb.append(getPrecioVentaPublico());
		
		return sb.toString();
	}
}
