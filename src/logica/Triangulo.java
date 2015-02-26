package logica;

public class Triangulo implements FiguraInterface{

	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float area() {
		
		return (base * altura)/2;
	}
}
