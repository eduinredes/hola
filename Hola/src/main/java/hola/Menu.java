package hola;

import java.io.Serializable;

public class Menu implements Serializable{
	private int id;
	private String nombre;
	private String tipo;
	private String receta;
	
	
	public Menu(){
		
	}
	
	public Menu(int id, String nombre, String tipo, String receta){
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.receta = receta;
	}

	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getReceta(){
		return receta;
	}
	
	public void setReceta(String receta){
		this.receta = receta;
	}
	
	
}

