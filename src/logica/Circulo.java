package logica;

public class Circulo implements FiguraInterface{
	private float radio;

	public Circulo(float radio){
		this.radio = radio;
	}
	
	@Override
	public float area() {
		
		return (float) (PI * radio * Math.exp(2));
	}
	
}
