package lk.ijse.metropolitan.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;
    public static void navigate(Routes routes,AnchorPane pane) throws IOException {
        Navigation.pane=pane;
        Navigation.pane.getChildren().clear();

        Stage window = (Stage) Navigation.pane.getScene().getWindow();

        switch(routes){
            case LOGIN:
                window.setTitle("Login Form");
                initUI("LoginForm.fxml");
            case DASHBOARD:
                window.setTitle("Login Form");
                initUI("DashboardForm.fxml");
        }
    }

    private static void initUI(String location) throws IOException {
        Navigation.pane.getChildren().add(FXMLLoader
                .load(Navigation.class.getResource("lk/ijse/metropolitan/view/"+location)));
    }
}
