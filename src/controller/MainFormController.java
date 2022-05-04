package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

public class MainFormController {
    public JFXTextField txtNic;
    public JFXRadioButton rdOld;
    public ToggleGroup nicType;
    public JFXRadioButton rdNew;
    public Label lblV;
    public Label lblDate;
    public Label lblMonth;
    public Label lblYear;
    public Label lblGender;
    public JFXButton btnRead;

    String nic = null;

    public void initialize(){

        btnRead.setOnMouseClicked(event -> {
            if (validate()) {
                setDob();
            }
        });

    }

    private void setDob() {
        nic.c
    }

    private boolean validate() {
        if (txtNic.getText().equals("")){
            return false;
        }
        nic = txtNic.getText();
        return true;
    }


}
