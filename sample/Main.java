package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {

    Stage primaryStage = new Stage();
    Parent root;
    private Image finger = new Image("image/Finger.png");

    @Override
    public void start(Stage primaryStage) throws Exception {
        Platform.setImplicitExit(false);
        root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("Dungeons of Zirkonia");
        primaryStage.getIcons().add(new Image("image/DoZweblogo_HD.png"));
        Scene mainmenu = new Scene(root, 1210, 680);
        mainmenu.setCursor(new ImageCursor(finger));
        primaryStage.setScene(mainmenu);
        root.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        primaryStage.setResizable(false);

        primaryStage.setOnCloseRequest(event -> {
            System.exit(1);
            event.consume();
        });
        primaryStage.show();

    }


    public static void main(String[] args) {

        launch(args);
    }
}
