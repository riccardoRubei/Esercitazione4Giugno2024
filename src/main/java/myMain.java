import javafx.application.Application;
import javafx.stage.Stage;

public class myMain extends javafx.application.Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		 // Create a label with the text "Hello World!"
        javafx.scene.text.Text message = new javafx.scene.text.Text("Hello World!");

        // Create a layout (group) to hold the label
        javafx.scene.Group root = new javafx.scene.Group(message);

        // Create the scene with the layout and set its dimensions
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 600, 600);

        // Set the title of the stage
        primaryStage.setTitle("Hello World!");

        // Set the scene on the stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}

}
