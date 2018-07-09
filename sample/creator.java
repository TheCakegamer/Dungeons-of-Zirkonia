package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class creator {

    public void openeditor(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample/creatorwindow.fxml"));
        primaryStage.setTitle("Dungeons of Zirkonia  -  Room-Creator");
        Scene scene = new Scene(root, 704, 768);
        root.getStylesheets().addAll(this.getClass().getResource("css.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }



}
