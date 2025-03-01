package dndcompanion.compendium.spells;

import java.io.IOException;

import dndcompanion.data.SpellData;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableView;

public class SpellsController {

	LoadSpellData getSpellData;

	SpellData[] spells;

	@SuppressWarnings("exports")
	@FXML
	public TextField searchbar;

	@SuppressWarnings("exports")
	@FXML
	public TreeTableView table;

	@FXML
	public void onSearch() {
		searchbar.setOnAction(e -> {

			getSpellData = new LoadSpellData();
			try {
				spells = getSpellData.getSpells(searchbar.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			searchbar.clear();
		});

	}
	
	

}
