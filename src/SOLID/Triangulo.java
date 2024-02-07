package SOLID;

public class Triangulo implements IFigura{
	private float base;
	private float altura;
	
	private float lado1;
	private float lado2;
	private float lado3;
	
	
	public Triangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(float lado1, float lado2, float lado3) throws ETriangulo {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		if(!valid()) {
			throw new ETriangulo();
		}
	}
	
	private boolean valid() {
		
		return (lado1+ lado2) <= lado3 && (lado3+ lado2) <= lado1 && (lado1+ lado3) > lado2;
	}
	
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


}
