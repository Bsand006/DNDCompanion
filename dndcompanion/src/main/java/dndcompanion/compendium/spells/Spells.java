package dndcompanion.compendium.spells;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Spells {
	Scene scene;

	public void run(Scene scene) {
		this.scene = scene;

		FXMLLoader loader = new FXMLLoader();

		loader.setLocation(getClass().getResource("spells.fxml"));

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
