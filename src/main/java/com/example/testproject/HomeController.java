package com.example.testproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HomeController {
    public void initialize() {
    }

    public AnchorPane edit;
    @FXML
    private AnchorPane home;

    @FXML
    void st_manager(ActionEvent event) throws IOException {
    }

    @FXML
    void sub_manager(ActionEvent event) {
        System.out.println("sub_manager");
    }

    @FXML
    public void edit_student(ActionEvent event) throws IOException {
        ToolFXML.openFXML("editStudent.fxml");
    }

    public void st_infor(ActionEvent event) {
        System.out.println("st infor");
    }

    public void filter_points(ActionEvent event) {
        System.out.println("filter points");
    }

    public void edit_subjects(ActionEvent event) {
    }

    public void look_up_regist_result(ActionEvent event) {
    }


    public void edit(ActionEvent event) throws IOException {

    }

    void show(AnchorPane paneToShow) {
        List<AnchorPane> allPanes = Arrays.asList(home, edit);
        for (AnchorPane pane : allPanes) {
            if (pane != paneToShow) {
                pane.setVisible(false);
            } else {
                pane.setVisible(true);
            }
        }
    }
}
