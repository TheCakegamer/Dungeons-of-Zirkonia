package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;



public class Main extends Application {

    Stage primaryStage = new Stage();
    Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Platform.setImplicitExit(false);
        root  = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("Dungeons of Zirkonia");
        primaryStage.getIcons().add(new Image("image/DoZweblogo_HD.png"));
        primaryStage.setScene(new Scene(root, 1210, 680));
        root.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.show();

    }



    public static void main(String[] args) {

        launch(args);
    }
}
