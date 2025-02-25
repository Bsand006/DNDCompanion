package dndcompanion.dndcompanion;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * D&D Companion character creator app developed using Javafx library
 * @author Brian Sand
 */

public class App extends Application {
	Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();

		try {
			VBox root = FXMLLoader.load(getClass().getResource("menu.fxml"));
			Scene scene = new Scene(root, width, height);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Stage getStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch();
	}
}