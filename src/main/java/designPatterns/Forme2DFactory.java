package designPatterns;

public class Forme2DFactory extends FormeAbstractFactory{

	   public Forma getForma(String shapeType){
		   
		      if(shapeType == null){
		         return null;
		      }    
		      
		      if(shapeType.equalsIgnoreCase("Quadrato")){
		         return new Quadrato();
		         
		      }else if(shapeType.equalsIgnoreCase("Triangolo")){
		         return new Triangolo();
		      }
		      
		      return null;
	   }
}
