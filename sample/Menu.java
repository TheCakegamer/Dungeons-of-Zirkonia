package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Menu {


    @FXML
    Button Start;
    @FXML
    Button Exit;

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


    private void requestExit() {
        System.exit(1);
    }
}
