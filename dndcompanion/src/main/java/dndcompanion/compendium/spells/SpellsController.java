package dndcompanion.compendium.spells;

import java.io.IOException;

import dndcompanion.data.SpellData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.stage.Popup;

/*
 * Controller class for the spell lookup book. Contains two methods, onSearch and onMouseClicked. onSearch executes
 *  when the player enters a search query
 */

public class SpellsController {

	LoadSpellData getSpellData;

	Label text;

	SpellData[] spells;

	ObservableList<SpellData> spelldata;

	@SuppressWarnings("exports")
	@FXML
	public TextField searchbar;

	@FXML
	public TableView<SpellData> table;

	@FXML
	public TableColumn<SpellData, String> nameCol;

	@FXML
	public TableColumn<SpellData, Integer> levelCol;

	@FXML
	public TableColumn<SpellData, String> sourceCol;

	@FXML
	public TableColumn<SpellData, String> schoolCol;

	@FXML
	public TableColumn<SpellData, String> rangeCol;

	@FXML
	public TableColumn<SpellData, String> durationCol;

	@FXML
	public TableColumn<SpellData, String> descCol;

	@FXML
	public void onSearch() {
		searchbar.setOnAction(e -> {

			getSpellData = new LoadSpellData();
			try {
				spells = getSpellData.getSpells(searchbar.getText());

				spelldata = FXCollections.observableArrayList(spells);

				nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
				levelCol.setCellValueFactory(new PropertyValueFactory<>("level"));
				sourceCol.setCellValueFactory(new PropertyValueFactory<>("source"));
				schoolCol.setCellValueFactory(new PropertyValueFactory<>("school"));
				rangeCol.setCellValueFactory(new PropertyValueFactory<>("range"));

				table.setItems(spelldata);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			searchbar.clear();
		});

	}

	@FXML
	public void onMouseClicked() {
		table.setOnMouseClicked(e -> {
			if (e.getButton().equals(MouseButton.PRIMARY)) {
				if (e.getClickCount() == 2) {

					try {

						Popup popup = new Popup();

						if (text == null) {
							text = new Label();
						}

						popup.hide();
						text.setText(" ");

						TablePosition focusedCell = table.getFocusModel().getFocusedCell();

						int row = focusedCell.getRow();

						System.out.println(focusedCell.getTableColumn().getCellData(row).toString());

						text.setText(focusedCell.getTableColumn().getCellData(row).toString());

						popup.getContent().add(text);

						text.setMinWidth(80);
						text.setMinHeight(80);

						popup.show(table.getScene().getWindow());

					} catch (NullPointerException e1) {
						e1.printStackTrace();
					}
				}
			}

		});
	}

}
