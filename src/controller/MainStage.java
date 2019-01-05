package controller;

import common.NotificationController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainStage implements Initializable {

    @FXML
    private AnchorPane panelLoader;

    @FXML
    void desgination(ActionEvent event) throws Exception {
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/EmpDesignation.fxml"));
        panelLoader.getChildren().setAll(load);
    }

    @FXML
    void employee_onaction(ActionEvent event) throws Exception {
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/Employee.fxml"));
        panelLoader.getChildren().setAll(load);
    }

    @FXML
    void settings(ActionEvent event) throws Exception {
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("/view/Settings.fxml"));
        panelLoader.getChildren().setAll(load);
    }

    @FXML
    void logout_onaction(ActionEvent event) {
        ButtonType configAlert = NotificationController.createConfigAlert();
        if (configAlert == ButtonType.OK){
            System.exit(0);
        }
    }

    @FXML
    void salary(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        AnchorPane load = null;
        try {
            load = FXMLLoader.load(this.getClass().getResource("/view/Employee.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        panelLoader.getChildren().setAll(load);
    }
}
