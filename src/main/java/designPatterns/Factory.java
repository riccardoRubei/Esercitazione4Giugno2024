package designPatterns;

public class Factory {
	   public static FormeAbstractFactory getFactory(boolean bidimensionale){   
		      if(bidimensionale){
		         return new Forme2DFactory();         
		      }
		      else{
		         return new Forme3DFactory();
		      }
		   }
}
