package dndcompanion.dndcompanion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

	@FXML
	public Button open;

	@FXML
	public Button create;

	@FXML
	public Button comp;

	@FXML
	public void onButtonClicked(ActionEvent e) {
		if (e.getSource().equals(comp)) {
			System.out.println("aahah");
		} else if (e.getSource().equals("create")) {

		} else if (e.getSource().equals("open")) {

		}
	}

}
