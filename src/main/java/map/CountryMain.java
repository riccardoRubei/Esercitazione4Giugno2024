package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.batik.swing.JSVGCanvas;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Text;

public class CountryMain extends javafx.application.Application {

	public static void main(String[] args) {
		launch(args);

	}
	
    public void start(javafx.stage.Stage stage) throws FileNotFoundException {

    	String basePath = "C:\\\\Users\\\\Rick\\\\Desktop\\\\workshopEsercitazioni\\\\Esercitazioni4Giugno2024\\\\assets\\\\";
        Country italy = new Country("Italy", "Rome", basePath+"italy.png");
        Country france = new Country("France", "Paris", "C:\\Users\\Rick\\Desktop\\workshopEsercitazioni\\Esercitazioni4Giugno2024\\assets\\italy.png");
        List<Country> Countries = List.of(italy,france);
        List<ImageView> countryMaps = new ArrayList();
        List<Text> countryNames = new ArrayList();
        List<Text> countryCapitals = new ArrayList();
        
        javafx.scene.image.ImageView countryMap = new javafx.scene.image.ImageView();
        
        int positionVar = 1;
        for(Country c:Countries) {
        	countryMap = new javafx.scene.image.ImageView();
        	String var = c.getImagePath();
        	FileInputStream var2 = new FileInputStream(var);
        	
            countryMap.setImage(new javafx.scene.image.Image(var2));
            countryMap.setX(100*positionVar);
            countryMap.setY(100*positionVar);
            countryMaps.add(countryMap);
            javafx.scene.text.Text countryName = new javafx.scene.text.Text(c.getName());
            javafx.scene.text.Text capitalName = new javafx.scene.text.Text(c.getCapital());
            countryName.setX(300*positionVar);
            countryName.setY(300*positionVar);
            capitalName.setX(250*positionVar);
            capitalName.setY(250*positionVar);
            countryNames.add(countryName);
            countryCapitals.add(capitalName);

            countryMap.setOnMouseMoved( event-> {
                System.out.println(c.getName());
            });
            countryMap.setOnMouseClicked(event -> {
                System.out.println(c.getName());
            });
            
            positionVar+=2;
        }

        javafx.scene.layout.Pane root = new javafx.scene.layout.Pane();


        for(int i=0; i<Countries.size(); i++) {
        	
        	root.getChildren().addAll(countryMaps.get(i), countryNames.get(i), countryCapitals.get(i));
        }
        

        javafx.scene.Scene scene = new javafx.scene.Scene(root, 1000, 1000);
        stage.setTitle("Country Display");
        stage.setScene(scene);
        stage.show();
    }

}
