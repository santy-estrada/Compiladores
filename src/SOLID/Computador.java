package SOLID;

public class Computador {
	
	public ITeclado tec;
	public IMouse souris;
	
	public void prender() {
		this.tec.conectar();
		this.souris.conectar();
		
		System.out.println("El PC la prendió");
	}

	public Computador(ITeclado tec, IMouse souris) {
		this.tec = tec;
		this.souris = souris;
	}
	
	

}
