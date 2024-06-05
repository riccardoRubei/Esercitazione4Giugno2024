package designPatterns;

public class Forme3DFactory extends FormeAbstractFactory{
	
	   public Forma getForma(String shapeType){
		   
		      if(shapeType == null){
		         return null;
		      }    
		      
		      if(shapeType.equalsIgnoreCase("Cubo")){
		         return new Cubo();
		         
		      }else if(shapeType.equalsIgnoreCase("Piramide")){
		         return new Piramide();
		      }
		      
		      return null;
	   }
}
