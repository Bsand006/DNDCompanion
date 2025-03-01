package dndcompanion.dndcompanion;

import dndcompanion.compendium.Compendium;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/*
 * Controller class for the menu screen
 */

public class MenuController  {
	Compendium compendium;
	Scene currentScene;

	@FXML
	public Button open;

	@FXML
	public Button create;

	@FXML
	public Button comp;
	

	@FXML
	public void onButtonClicked(ActionEvent e) { // When one of the buttons is clicked
		if (e.getSource().equals(comp)) {
			compendium = new Compendium();
			currentScene = comp.getScene();
			compendium.run(currentScene);
		} else if (e.getSource().equals("create")) {

		} else if (e.getSource().equals("open")) {

		}
	}

	
	
}
