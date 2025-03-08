package dndcompanion.dndcompanion;

import java.awt.Dimension;
import java.awt.Toolkit;

import dndcompanion.compendium.spells.LoadSpellData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * D&D Companion character creator app developed using Javafx library
 * 
 * @author Brian Sand
 * 
 *         This is the main class where the program starts.
 */

public class App extends Application {
	Stage primaryStage;
	static LoadSpellData test;

	@Override
	public void start(Stage primaryStage) {

		// Get the dimensions of the users screen

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();

		// Generate root VBox and load FXML file

		try {
			VBox root = FXMLLoader.load(getClass().getResource("menu.fxml"));
			Scene scene = new Scene(root, width, height);
			scene.getStylesheets().add(getClass().getResource("menu.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch();
	}
}