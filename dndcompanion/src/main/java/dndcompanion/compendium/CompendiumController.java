package dndcompanion.compendium;

import dndcompanion.compendium.classes.Classes;
import dndcompanion.compendium.feats.Feats;
import dndcompanion.compendium.spells.Spells;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class CompendiumController {
	Scene currentScene;
	
	Classes classes;
	Spells spells;
	Feats feats;

	@FXML
	public Button c;

	@FXML
	public Button spell;

	@FXML
	public Button feat;

	@FXML 
	public Button equip;
	
	@FXML
	public Button back;
	

	@FXML
	public void onButtonClicked(ActionEvent e) {

		if (e.getSource().equals(c)) {
			classes = new Classes();
			currentScene = c.getScene();
			classes.run(currentScene);
		} else if (e.getSource().equals(spell)) {
			spells = new Spells();
			currentScene = spell.getScene();
			spells.run(currentScene);
		} else if (e.getSource().equals(feat)) {

		} else if (e.getSource().equals(equip)) {
			
		} else {
			
		}
	}

}
