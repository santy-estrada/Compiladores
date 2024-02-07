package SOLID;

public class Rectangulo implements IFigura{
	
	private float base;
	
	private float height;
	
	@Override
	public float area() {
		return base*height;
	}

	public float getBase() {
		return base;
	}
	
	

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", height=" + height + "]";
	}

	public void setBase(float base) {
		this.base = base;
	}



	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}


	
	public Rectangulo(float base, float height) {
		this.base = base;
		this.height = height;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public float perimetro() {
		
		return base*2+height*2;
	}



}
