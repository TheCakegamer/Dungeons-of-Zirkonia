package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Boss {
    public boolean bossspawned = false;
    ImageView boss = new ImageView();
    ImageView bosshealthbar = new ImageView();
    int bosshealth = 20;
    private Enemy enemyclass = new Enemy();

    Image bossimg = new Image(getClass().getResource("/image/stonemask.gif").toExternalForm());
    Image suckimg = new Image(getClass().getResource("/image/stonemasklightsuck.gif").toExternalForm());


    private ArrayList<Image> bhealthimg = new ArrayList<>();

    private void addbosspics() {
        bhealthimg.add(new Image(getClass().getResource("/image/bossh00.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh01.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh02.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh03.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh04.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh05.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh06.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh07.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh08.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh09.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh10.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh11.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh12.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh13.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh14.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh15.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh16.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh17.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh18.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh19.png").toExternalForm()));
        bhealthimg.add(new Image(getClass().getResource("/image/bossh20.png").toExternalForm()));
    }


    public int suckattack(ImageView boss) {
        boss.setImage(suckimg);
        if (bosshealth <= 15) {
            bosshealth += 5;
        } else {
            bosshealth = 20;
        }

        return 0;
    }

    public void updatehealthbar(int bosshealth) {
        addbosspics();
        bosshealthbar.setImage(bhealthimg.get(bosshealth));
    }

    public void endgame() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("End.fxml"));

        Parent GO;
        GO = fxmlLoader.load();
        GO.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
        Stage stage = new Stage();
        stage.setTitle("The End");
        stage.getIcons().add(new Image("image/DoZweblogo_HD.png"));
        stage.setScene(new Scene(GO));
        Stage gamestage = (Stage) boss.getScene().getWindow();
        stage.setResizable(false);

        stage.show();
        gamestage.close();

    }




    public void bossmove(ImageView hero, ImageView enemy, Pane background, int[] availablemovement) {
        if (
                !bossspawned) {
            addbosspics();
            background.getChildren().add(boss);
            background.getChildren().add(bosshealthbar);
            boss.setImage(bossimg);
            boss.setX(3 * 64);
            boss.setY(5 * 64);
            boss.setFitWidth(128);
            boss.setFitHeight(128);
            boss.toFront();


            bosshealthbar.setImage(bhealthimg.get(20));
            bosshealthbar.setX(0);
            bosshealthbar.setY(0);
            bosshealthbar.toFront();
            bosshealthbar.setFitWidth(704);
            bosshealthbar.setFitHeight(141);
            bossspawned = true;
        }


        enemy.setFocusTraversable(true);

        enemyclass.setenemydirection(hero, enemy, availablemovement);


        enemy.setTranslateX(128);
        enemy.setTranslateY(128);
    }
}
