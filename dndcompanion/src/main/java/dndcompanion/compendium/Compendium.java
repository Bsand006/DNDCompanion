package dndcompanion.compendium;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Compendium {
	Scene scene;

	public void run(Scene scene) {
		this.scene = scene;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("comp.fxml"));

		try {
			Parent par = loader.load();
			Scene mainscene = new Scene(par);
			Stage stage = (Stage) scene.getWindow();

			stage.setScene(mainscene);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
