package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu {


    @FXML
    Button Start;
    @FXML
    Button Exit;
    @FXML
    Button Create;

    Main main = new Main();

    public void closegame(ActionEvent actionEvent) {

        System.exit(1);
    }

    public void startgame(ActionEvent actionEvent) throws Exception {

        Stage menustage = (Stage) Exit.getScene().getWindow();

        Stage primaryStage = new Stage();
        main.root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Dungeons of Zirkonia");
        primaryStage.getIcons().add(new Image("image/DoZweblogo_HD.png"));
        primaryStage.setScene(new Scene(main.root, 704, 832));
        main.root.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        primaryStage.setResizable(false);

        primaryStage.show();

        primaryStage.setOnCloseRequest(event -> {
            requestExit();
            event.consume();
        });


        menustage.close();
    }

    public void opencreator() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("creatorwindow.fxml"));

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/creatorwindow.fxml"));
        primaryStage.setTitle("Dungeons of Zirkonia  -  Room-Creator");
        Scene scene = new Scene(root, 704, 768);
        root.getStylesheets().addAll(this.getClass()
                .getResource("/sample/css.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void requestExit() {
        System.exit(1);
    }
}
