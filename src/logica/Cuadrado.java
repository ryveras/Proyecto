package logica;

public class Cuadrado implements FiguraInterface{
	private float lado;

	public Cuadrado(float lado){
		this.lado = lado;
	}	
	
	@Override
	public float area() {
		
		return lado * lado;
	}
	
	
	
}
