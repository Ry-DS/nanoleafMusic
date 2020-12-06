package dev.jaxcksn.nanoleafMusic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/connectToDevice.fxml"));
        Scene scene = new Scene(root, 400, 300);
        //TODO: Change to montserrat
        Font.loadFont(getClass().getResourceAsStream("/fonts/Montserrat-Regular.ttf"),12);
        Font.loadFont(getClass().getResourceAsStream("/fonts/Montserrat-Bold.ttf"),12);
        Font.loadFont(getClass().getResourceAsStream("/fonts/Montserrat-Medium.ttf"),12);
        Font.loadFont(getClass().getResourceAsStream("/fonts/Montserrat-SemiBold.ttf"),12);
        root.getStylesheets().add("/gui.css");
        stage.setTitle("nanoleafMusic");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.exit(0);
    }
}
