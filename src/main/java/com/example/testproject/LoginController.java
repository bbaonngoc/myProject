package com.example.testproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoginController {

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void forgotPassword(ActionEvent event) {

    }


    @FXML
    void login(ActionEvent event) throws IOException {
        // thêm dữ liệu vào list User (template)
        addUserData();

        // Lấy username và password từ text UI
        String username = this.username.getText();
        String password = this.password.getText();

        if (checkLogin(username, password)) {

            ToolFXML.openFXML("home.fxml");

        } else {
            System.out.println("Invalid username or password");

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Invalid username or password");
            alert.setContentText("Please try again!");
            alert.showAndWait();
        }
    }

    // add data user template to file
    public void addUserData() {
        User user = new User();
        String  defaultUsername = "admin";
        String defaultPassword = "admin123";

        user.setUsername(defaultUsername);
        user.setPassword(defaultPassword);

        List<User> users = new ArrayList<>();
        users.add(user);

        for (User u: users) {
            try {
                FileWriter fileWriter = new FileWriter("BanGhiDangNhap.txt", true);
                // explained in the next section
                // BufferedWriter is used to write text to a file
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(u.getUsername() + "," + u.getPassword());
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }
    }
    private boolean checkLogin(String username, String password) {
        try {
            FileReader fileReader = new FileReader("BanGhiDangNhap.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                // Check if the retrieved username and password match the input
                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    bufferedReader.close();
                    return true; // Credentials matched
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error reading credentials: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false; // No matching credentials found
    }

}

