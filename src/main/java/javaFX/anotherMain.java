package javaFX;

import javaFX.person;
import javafx.scene.Node;

public class anotherMain extends javafx.application.Application {

	public static void main(String[] args) {
		launch(args);
	}
	public void start(javafx.stage.Stage stage) {
        // Person object with initial values
        person person = new person("John", "Doe");

        // Labels and TextFields
        //javafx.scene.text.Label nameLabel = new javafx.scene.text.Label("Name:");
        javafx.scene.control.TextField nameField = new javafx.scene.control.TextField(person.getFirstName());
        //javafx.scene.text.Label surnameLabel = new javafx.scene.text.Label("Surname:");
        javafx.scene.control.TextField surnameField = new javafx.scene.control.TextField(person.getLastName());

        // Button to modify
        javafx.scene.control.Button modifyButton = new javafx.scene.control.Button("Modify");

        // Text to display the full name
        javafx.scene.text.Text fullName = new javafx.scene.text.Text(person.getFullName());

        // Layout (HBox) for name
        javafx.scene.layout.HBox nameBox = new javafx.scene.layout.HBox(5);
        Node nameLabel = null;
        nameBox.getChildren().add(nameField);
		//nameBox.getChildren().addAll(nameLabel, nameField);

        // Layout (HBox) for surname and button
        javafx.scene.layout.HBox surnameBox = new javafx.scene.layout.HBox(5);
        Node surnameLabel = null;
		surnameBox.getChildren().addAll(surnameField, modifyButton);

        // Layout (VBox) for all elements
        javafx.scene.layout.VBox root = new javafx.scene.layout.VBox(10);
        root.getChildren().addAll(nameBox, surnameBox, fullName);

        // Set action for the modify button
        modifyButton.setOnAction(event -> {
            person.setFirstName(nameField.getText());
            person.setLastName(surnameField.getText());
            fullName.setText(person.getFullName());
        });

        // Scene setup and stage display
        javafx.scene.Scene scene = new javafx.scene.Scene(root, 350, 150);
        stage.setTitle("Modify Person");
        stage.setScene(scene);
        stage.show();
    }

}
