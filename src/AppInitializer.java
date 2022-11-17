import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Scene scene=new Scene(FXMLLoader
                .load(getClass().getResource("lk/ijse/metropolitan/view/LoginForm.fxml")));
        scene.getStylesheets().add(getClass().getResource("lk/ijse/metropolitan/assets/cssSheets/MetropolitantColourSchema.css").toExternalForm());
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
