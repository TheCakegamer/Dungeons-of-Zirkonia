package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Boss {
    boolean bossspawned = false;
    ImageView boss = new ImageView();
    int bosshealth = 20;

    Image bossimg = new Image(getClass().getResource("/image/stonemask.gif").toExternalForm());
    Image suckimg = new Image(getClass().getResource("/image/stonemasklightsuck.gif").toExternalForm());



    public int suckattack(int lightcounter, ImageView boss){
        boss.setImage(suckimg);
        lightcounter = 0;
        bosshealth += 5;
        return lightcounter;
    }




    public void bossmove(ImageView hero, ImageView enemy, Pane background, int[] availablemovement) {
        if (
                !bossspawned) {
            background.getChildren().add(boss);
            boss.setImage(bossimg);
            boss.setX(3 * 64);
            boss.setY(5 * 64);
            boss.setFitWidth(128);
            boss.setFitHeight(128);
            boss.toFront();
            System.out.println("BOSS ADDED");
            bossspawned= true;
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
