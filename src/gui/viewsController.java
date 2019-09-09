package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class viewsController implements Initializable {

	@FXML
	private TextField txtLabelNumber1;
	@FXML
	private TextField txtLabelNumber2;
	@FXML
	private Label labelResult;
	@FXML
	private Button btSum;

	@FXML
	public void onBtSumAction() {
		try {
		double number1 = Double.parseDouble(txtLabelNumber1.getText());
		double number2 = Double.parseDouble(txtLabelNumber2.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
		}catch (NumberFormatException e) {
				Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldDouble(txtLabelNumber1);
		Constraints.setTextFieldDouble(txtLabelNumber2);
		Constraints.setTextFieldMaxLength(txtLabelNumber1, 3);
		Constraints.setTextFieldMaxLength(txtLabelNumber2, 3);
		
	}

}
