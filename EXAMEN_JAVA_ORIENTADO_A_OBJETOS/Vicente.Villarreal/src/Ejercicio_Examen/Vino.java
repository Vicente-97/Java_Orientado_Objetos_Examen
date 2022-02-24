package Ejercicio_Examen;
/**
 * Clase Vino del ejercicio Examen
 * @author estudiante
 *
 */

public class Vino {
//atributos//
	private String vino;
	private Integer graduacion;
	private String descripcion;
	
	
	
	//constructores//
	
	
	public Vino(String descripcion) {
		
		this.descripcion = descripcion;
	}



	public Vino(String vino, Integer graduacion, String descripcion) {
		this.vino = vino;
		this.graduacion = graduacion;
		this.descripcion = descripcion;
		
		if (graduacion>0) {
			System.out.println("Vino creado con éxito");
		}else {
			throw new VinoExceptions("Error de graduacion, imposible crear el vino");
		}
	}

	//metodos//
	
	
	
	
	
	
	
//getter y setter//
	
	
	

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



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean equals(Vino vinoNuevo) {
		boolean sonLoMismo = false;
		
		vinoNuevo = (Vino) vinoNuevo;
		
		sonLoMismo = this.vino.equals(vinoNuevo.getVino());
		
		return sonLoMismo;
	
	
}
	
	public String toString () {
		StringBuilder sb= new StringBuilder();
		sb.append("\n el nombre del vino es:\n");
		sb.append(getVino());
		sb.append("\n la graduacion es:\n");
		sb.append(getGraduacion());
		sb.append("\n la descripcion es:\n");
		sb.append(getDescripcion());
	
		return sb.toString();
	}
	
}
