package com.example.testproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EditStudent {
    public TextField tfName;
    public TextField tfId;
    public DatePicker datePicker;
    public TextField tfGpa;
    @FXML
    private TableView<Student> tableViewStudent;
    @FXML
    private Button add;

    @FXML
    private Button edit;

    @FXML
    private TextField gpa;

    @FXML
    private ComboBox<String> major;

    @FXML
    private Button remove;
    public void initialize(){
        major.getItems().addAll("Science Computer", "Software Engineering", "Artificial Intelligence");
    }

    @FXML
    void add(ActionEvent event) {
        addStudentData();
    }

    @FXML
    void edit(ActionEvent event) {
    }

    @FXML
    void gpa(ActionEvent event) {
    }

    @FXML
    void major(ActionEvent event) {
    }

    @FXML
    void remove(ActionEvent event) {

    }
    ObservableList<Student> students = FXCollections.observableArrayList();
    public void addStudentData() {

        int id = Integer.parseInt(tfId.getText());
        String name = tfName.getText();
        // Lấy ngày được chọn
        LocalDate dateOfBirth = datePicker.getValue();
        float gpa = Float.parseFloat(tfGpa.getText());

        Student student = new Student();
        student.setId(id);
        student.setStudentName(name);
        student.setDateOfBirth(dateOfBirth);
        student.setMajor("Software Engineering");
        student.setGpa(gpa);

        students.add(student);

        tableViewStudent.setItems(students);

        for (Student u : students) {
            try {
                FileWriter fileWriter = new FileWriter("BanGhiThongTinSinhVien.txt", true);
                // explained in the next section
                // BufferedWriter is used to write text to a file
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(u.getStudentName() + "," + u.getId() + "," + u.getDateOfBirth() + "," + u.getMajor() + "," + u.getGpa());
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
    }

//    public void initialize() {
//        tableViewStudent.setItems(students);
//    }


}
