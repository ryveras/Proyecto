package logica;

public class Rectangulo implements FiguraInterface{

	private float base;
	private float altura;
	
	public Rectangulo(float base, float altura) {
		
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float area() {
		
		return base * altura;
	}
}
