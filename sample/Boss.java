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
    boolean bossspawned = false;
    ImageView boss = new ImageView();
    ImageView bosshealthbar = new ImageView();
    int bosshealth = 20;

    Image bossimg = new Image(getClass().getResource("/image/stonemask.gif").toExternalForm());
    Image suckimg = new Image(getClass().getResource("/image/stonemasklightsuck.gif").toExternalForm());
    Image bossh20 = new Image(getClass().getResource("/image/bossh20.png").toExternalForm());
    Image bossh19 = new Image(getClass().getResource("/image/bossh19.png").toExternalForm());
    Image bossh18 = new Image(getClass().getResource("/image/bossh18.png").toExternalForm());
    Image bossh17 = new Image(getClass().getResource("/image/bossh17.png").toExternalForm());
    Image bossh16 = new Image(getClass().getResource("/image/bossh16.png").toExternalForm());
    Image bossh15 = new Image(getClass().getResource("/image/bossh15.png").toExternalForm());
    Image bossh14 = new Image(getClass().getResource("/image/bossh14.png").toExternalForm());
    Image bossh13 = new Image(getClass().getResource("/image/bossh13.png").toExternalForm());
    Image bossh12 = new Image(getClass().getResource("/image/bossh12.png").toExternalForm());
    Image bossh11 = new Image(getClass().getResource("/image/bossh11.png").toExternalForm());
    Image bossh10 = new Image(getClass().getResource("/image/bossh10.png").toExternalForm());
    Image bossh09 = new Image(getClass().getResource("/image/bossh09.png").toExternalForm());
    Image bossh08 = new Image(getClass().getResource("/image/bossh08.png").toExternalForm());
    Image bossh07 = new Image(getClass().getResource("/image/bossh07.png").toExternalForm());
    Image bossh06 = new Image(getClass().getResource("/image/bossh06.png").toExternalForm());
    Image bossh05 = new Image(getClass().getResource("/image/bossh05.png").toExternalForm());
    Image bossh04 = new Image(getClass().getResource("/image/bossh04.png").toExternalForm());
    Image bossh03 = new Image(getClass().getResource("/image/bossh03.png").toExternalForm());
    Image bossh02 = new Image(getClass().getResource("/image/bossh02.png").toExternalForm());
    Image bossh01 = new Image(getClass().getResource("/image/bossh01.png").toExternalForm());
    Image bossh00 = new Image(getClass().getResource("/image/bossh00.png").toExternalForm());

    ArrayList<Image> bhealthimg = new ArrayList<>();

    public void initialize() {
        bhealthimg.add(bossh00);
        bhealthimg.add(bossh01);
        bhealthimg.add(bossh02);
        bhealthimg.add(bossh03);
        bhealthimg.add(bossh04);
        bhealthimg.add(bossh05);
        bhealthimg.add(bossh06);
        bhealthimg.add(bossh07);
        bhealthimg.add(bossh08);
        bhealthimg.add(bossh09);
        bhealthimg.add(bossh10);
        bhealthimg.add(bossh11);
        bhealthimg.add(bossh12);
        bhealthimg.add(bossh13);
        bhealthimg.add(bossh14);
        bhealthimg.add(bossh15);
        bhealthimg.add(bossh16);
        bhealthimg.add(bossh17);
        bhealthimg.add(bossh18);
        bhealthimg.add(bossh19);
        bhealthimg.add(bossh20);
    }


    public int suckattack(int lightcounter, ImageView boss) {
        boss.setImage(suckimg);
        lightcounter = 0;
        if (bosshealth <= 15) {
            bosshealth += 5;
        } else {
            bosshealth = 20;
        }

        return lightcounter;
    }

    public void updatehealthbar(int bosshealth) {
        initialize();
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

        stage.show();
        gamestage.close();

    }


    public void bossmove(ImageView hero, ImageView enemy, Pane background, int[] availablemovement) {
        if (
                !bossspawned) {
            initialize();
            background.getChildren().add(boss);
            background.getChildren().add(bosshealthbar);
            boss.setImage(bossimg);
            boss.setX(3 * 64);
            boss.setY(5 * 64);
            boss.setFitWidth(128);
            boss.setFitHeight(128);
            boss.toFront();
            System.out.println("BOSS ADDED");

            bosshealthbar.setImage(bhealthimg.get(20));
            bosshealthbar.setX(0);
            bosshealthbar.setY(0);
            bosshealthbar.toFront();
            bosshealthbar.setFitWidth(704);
            bosshealthbar.setFitHeight(141);
            bossspawned = true;
        }


        enemy.setFocusTraversable(true);
        if (Math.abs(hero.getX() - enemy.getX()) > Math.abs(hero.getY() - enemy.getY())) {
            if (hero.getX() > enemy.getX()) {
                if (availablemovement[3] != 0) {
                    enemy.setX(enemy.getX() + 64);
                }
            } else if (hero.getX() < enemy.getX()) {
                if (availablemovement[1] != 0) {
                    enemy.setX(enemy.getX() - 64);
                }

            }
        } else if (Math.abs(hero.getX() - enemy.getX()) <= Math.abs(hero.getY() - enemy.getY())) {
            if (hero.getY() > enemy.getY()) {
                if (availablemovement[2] != 0) {
                    enemy.setY(enemy.getY() + 64);
                }

            } else if (hero.getY() < enemy.getY()) {
                if (availablemovement[0] != 0) {
                    enemy.setY(enemy.getY() - 64);
                }

            }
        }


        enemy.setTranslateX(128);
        enemy.setTranslateY(128);
    }
}
