package SOLID;

public class Presentacion {
	
	public void showFigure(IFigura a) {
		System.out.println(a);
	}
	
	public void area(IFigura a) {
		System.out.println("El area es " + a.area());
	}
	
	public void perimetro(IFigura b) {
		System.out.println("El perimetro es " +  b.perimetro());
	}
}
