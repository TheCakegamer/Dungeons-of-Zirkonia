package sample;

import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;


public class Enemy {

    int enemyroom = 2;
    int enemyroomdead = 1;
    private boolean imagesloaded = false;


    private Image enemyindarkimg = new Image(getClass().getResource("/image/enemyinthedark.gif").toExternalForm());

    ImageView slime = new ImageView();
    ImageView floater = new ImageView();
    ImageView blob = new ImageView();

    private ArrayList<Image> slimepics = new ArrayList<>();
    public ArrayList<Image> floatpics = new ArrayList<>();
    public ArrayList<Image> blobpics = new ArrayList<>();

    private boolean enemyspawned = false;

    private void setenemyhealthimg() {

        slimepics.add(new Image(getClass().getResource("/image/Slime.gif").toExternalForm()));
        slimepics.add(new Image(getClass().getResource("/image/Slime1.gif").toExternalForm()));
        slimepics.add(new Image(getClass().getResource("/image/Slime2.gif").toExternalForm()));
        slimepics.add(new Image(getClass().getResource("/image/Slime3.gif").toExternalForm()));
        slimepics.add(new Image(getClass().getResource("/image/Slime4.gif").toExternalForm()));

        floatpics.add(new Image(getClass().getResource("/image/Floater0.gif").toExternalForm()));
        floatpics.add(new Image(getClass().getResource("/image/Floater1.gif").toExternalForm()));
        floatpics.add(new Image(getClass().getResource("/image/Floater2.gif").toExternalForm()));
        floatpics.add(new Image(getClass().getResource("/image/Floater3.gif").toExternalForm()));
        floatpics.add(new Image(getClass().getResource("/image/Floater4.gif").toExternalForm()));

        blobpics.add(new Image(getClass().getResource("/image/Blob0.gif").toExternalForm()));
        blobpics.add(new Image(getClass().getResource("/image/Blob1.gif").toExternalForm()));
        blobpics.add(new Image(getClass().getResource("/image/Blob2.gif").toExternalForm()));
        blobpics.add(new Image(getClass().getResource("/image/Blob3.gif").toExternalForm()));
        blobpics.add(new Image(getClass().getResource("/image/Blob4.gif").toExternalForm()));
        blobpics.add(new Image(getClass().getResource("/image/Blob5.gif").toExternalForm()));
        blobpics.add(new Image(getClass().getResource("/image/Blob6.gif").toExternalForm()));

    }

    public double hurt(ProgressBar healthbar, double health, int damage) {
        health = health - damage;
        healthbar.setProgress((health - damage) / 100);
        return health;
    }

    public int attack(ImageView hero, ImageView enemy, boolean[] freeslots, int selected, int enemyhealth, KeyEvent keyEvent) {


        switch (keyEvent.getCharacter()) {
            case "j":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == (hero.getX() - 64) && enemy.getY() == hero.getY()) {
                        enemyhealth--;
                    }
                }
                break;
            case "k":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == hero.getX() && enemy.getY() == (hero.getY() + 64)) {
                        enemyhealth--;

                    }
                }

                break;
            case "i":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == hero.getX() && enemy.getY() == (hero.getY() - 64)) {
                        enemyhealth--;

                    }
                }
                break;
            case "l":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == (hero.getX() + 64) && enemy.getY() == hero.getY()) {
                        enemyhealth--;

                    }
                }
                break;
        }
        return enemyhealth;

    }


    public void enemymove(ImageView hero, ImageView enemy, Pane background, int[] availablemovement) {
        if (
                !enemyspawned) {
            background.getChildren().add(slime);
            background.getChildren().add(floater);
            background.getChildren().add(blob);
            enemy.setX(3 * 64);
            enemy.setY(5 * 64);
            enemy.setImage(enemyindarkimg);
            slime.setFitWidth(64);
            slime.setFitHeight(64);
            floater.setFitWidth(64);
            floater.setFitHeight(64);
            blob.setFitWidth(64);
            blob.setFitHeight(64);
            slime.toFront();
            floater.toFront();
            blob.toFront();
            enemyspawned = true;
        }


        enemy.setFocusTraversable(true);

        setenemydirection(hero, enemy, availablemovement);


        enemy.setTranslateX(128);
        enemy.setTranslateY(128);
    }

    public void setenemydirection(ImageView hero, ImageView enemy, int[] availablemovement) {
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
    }

    public void enemyvision(ImageView enemy, ImageView hero, int lightcounter, int enemyhealth, String enemykind) {
        if (!imagesloaded) {
            setenemyhealthimg();
            imagesloaded = true;
        }
        if (lightcounter >= 50 && (enemy.getX() > (hero.getX() + 320) ^ enemy.getX() < (hero.getX() - 320) || enemy.getY() > (hero.getY() + 320) ^ enemy.getY() < (hero.getY() - 320))) {
            enemy.toFront();
            enemy.setImage(enemyindarkimg);


        } else if (lightcounter < 50 && lightcounter > 20 && (enemy.getX() > (hero.getX() + 256) ^ enemy.getX() < (hero.getX() - 256) || enemy.getY() > (hero.getY() + 256) ^ enemy.getY() < (hero.getY() - 256))) {
            enemy.toFront();
            enemy.setImage(enemyindarkimg);
        } else if (lightcounter <= 20 && lightcounter > 10 && (enemy.getX() > (hero.getX() + 192) ^ enemy.getX() < (hero.getX() - 192) || enemy.getY() > (hero.getY() + 192) ^ enemy.getY() < (hero.getY() - 192))) {
            enemy.toFront();
            enemy.setImage(enemyindarkimg);
        } else if (lightcounter <= 10 && (enemy.getX() > (hero.getX() + 128) ^ enemy.getX() < (hero.getX() - 128) || enemy.getY() > (hero.getY() + 128) ^ enemy.getY() < (hero.getY() - 128))) {
            enemy.toFront();
            enemy.setImage(enemyindarkimg);
        } else if (lightcounter == 0) {
            enemy.toFront();
            enemy.setImage(enemyindarkimg);
        } else {
            enemy.toBack();


            switch (enemykind) {
                case "Slime":
                    enemy.setImage(slimepics.get(enemyhealth));
                    break;
                case "Floater":
                    enemy.setImage(floatpics.get(enemyhealth));
                    break;
                case "Blob":
                    enemy.setImage(blobpics.get(enemyhealth));
                    break;
            }

        }
    }
}



