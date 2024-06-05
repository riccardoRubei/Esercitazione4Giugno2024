package designPatterns;

public class myDesignMain {

	public static void main(String[] args) {
		
	    FormeAbstractFactory formeFactory = Factory.getFactory(true);
	    
	    Forma forma1 = formeFactory.getForma("Quadrato");
	    forma1.disegna();
	    Forma forma2 = formeFactory.getForma("Triangolo");
	    forma2.disegna();
	    
	    FormeAbstractFactory formeFactory2 = Factory.getFactory(false);
	    
	    Forma forma3 = formeFactory2.getForma("Cubo");
	    forma3.disegna();
	    Forma forma4 = formeFactory2.getForma("Piramide");
	    forma4.disegna();
	  }

	}
