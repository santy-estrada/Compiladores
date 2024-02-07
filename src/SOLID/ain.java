package SOLID;
//Principio de resposabilidad �nica: La clase se ocupa de �l mismo y nada m�s
//Principio abierto/cerrado: Interfaz abierta a cambios, clase no
//Principio segregaci�n de interfaz: Las interfaces son espec�ficas (heredan y bla bla)
//Principio de inversi�n de dependencia: Todo se llama con interfaces
public class ain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        IFigura r = new Rectangulo(3,4); //Principio de sustituci�n: 
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
