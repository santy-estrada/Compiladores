package SOLID;
//Principio de resposabilidad única: La clase se ocupa de él mismo y nada más
//Principio abierto/cerrado: Interfaz abierta a cambios, clase no
//Principio segregación de interfaz: Las interfaces son específicas (heredan y bla bla)
//Principio de inversión de dependencia: Todo se llama con interfaces
public class ain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        IFigura r = new Rectangulo(3,4); //Principio de sustitución: 
        IFigura t = new Triangulo(5,5);
        Presentacion p = new Presentacion();
        p.showFigure(r);
        p.showFigure(t);
        System.out.println("----");
        
        ITeclado k = new Teclado();
        IMouse m = new Mouse();
        
        Computador c = new Computador (k,m);
        c.prender();

	}

}
