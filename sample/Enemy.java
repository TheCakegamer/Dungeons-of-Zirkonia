package sample;

import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.ArrayList;


public class Enemy {

    int enemyroom = 2;
    int enemyroomdead = 1;


    Image slimeimg = new Image(getClass().getResource("/image/Slime.gif").toExternalForm());
    Image slime1img = new Image(getClass().getResource("/image/Slime1.gif").toExternalForm());
    Image slime2img = new Image(getClass().getResource("/image/Slime2.gif").toExternalForm());
    Image slime3img = new Image(getClass().getResource("/image/Slime3.gif").toExternalForm());
    Image slime4img = new Image(getClass().getResource("/image/Slime4.gif").toExternalForm());

    Image floaterimg = new Image(getClass().getResource("/image/Floater0.gif").toExternalForm());
    Image floater1img = new Image(getClass().getResource("/image/Floater1.gif").toExternalForm());
    Image floater2img = new Image(getClass().getResource("/image/Floater2.gif").toExternalForm());
    Image floater3img = new Image(getClass().getResource("/image/Floater3.gif").toExternalForm());
    Image floater4img = new Image(getClass().getResource("/image/Floater4.gif").toExternalForm());


    Image blobimg = new Image(getClass().getResource("/image/Blob0.gif").toExternalForm());
    Image blob1img = new Image(getClass().getResource("/image/Blob1.gif").toExternalForm());
    Image blob2img = new Image(getClass().getResource("/image/Blob2.gif").toExternalForm());
    Image blob3img = new Image(getClass().getResource("/image/Blob3.gif").toExternalForm());
    Image blob4img = new Image(getClass().getResource("/image/Blob4.gif").toExternalForm());
    Image blob5img = new Image(getClass().getResource("/image/Blob5.gif").toExternalForm());
    Image blob6img = new Image(getClass().getResource("/image/Blob6.gif").toExternalForm());

    Image enemyindarkimg = new Image(getClass().getResource("/image/enemyinthedark.gif").toExternalForm());

    ImageView slime = new ImageView();
    ImageView floater = new ImageView();
    ImageView blob = new ImageView();

    ArrayList<Image> slimepics = new ArrayList<>();
    ArrayList<Image> floatpics = new ArrayList<>();
    ArrayList<Image> blobpics = new ArrayList<>();

    boolean enemyspawned = false;

    public void setenemyhealthimg() {

        slimepics.add(slimeimg);
        slimepics.add(slime1img);
        slimepics.add(slime2img);
        slimepics.add(slime3img);
        slimepics.add(slime4img);

        floatpics.add(floaterimg);
        floatpics.add(floater1img);
        floatpics.add(floater2img);
        floatpics.add(floater3img);
        floatpics.add(floater4img);

        blobpics.add(blobimg);
        blobpics.add(blob1img);
        blobpics.add(blob2img);
        blobpics.add(blob3img);
        blobpics.add(blob4img);
        blobpics.add(blob5img);
        blobpics.add(blob6img);

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
                        System.out.println("hit");
                    }
                }
                break;
            case "k":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == hero.getX() && enemy.getY() == (hero.getY() + 64)) {
                        enemyhealth--;
                        System.out.println("hit");

                    }
                }

                break;
            case "i":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == hero.getX() && enemy.getY() == (hero.getY() - 64)) {
                        enemyhealth--;
                        System.out.println("hit");

                    }
                }
                break;
            case "l":
                if (freeslots[selected - 1]) {
                    if (enemy.getX() == (hero.getX() + 64) && enemy.getY() == hero.getY()) {
                        enemyhealth--;
                        System.out.println("hit");

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
            System.out.println("CHILD ADDED");
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
        setenemyhealthimg();
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


            if (enemykind.equals("Slime")) {
                enemy.setImage(slimepics.get(enemyhealth));
            } else if (enemykind.equals("Floater")) {
                enemy.setImage(floatpics.get(enemyhealth));
            } else if (enemykind.equals("Blob")) {
                enemy.setImage(blobpics.get(enemyhealth));
            }

        }
    }
}



