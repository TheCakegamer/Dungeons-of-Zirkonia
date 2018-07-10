package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Controller {

    @FXML
    ImageView hero;
    @FXML
    ImageView fieldn;
    @FXML
    ImageView fieldo;
    @FXML
    ImageView fields;
    @FXML
    ImageView fieldw;
    @FXML
    ImageView chest;
    @FXML
    ImageView actioncloud;
    @FXML
    Pane background;
    @FXML
    ImageView fearmeter;
    @FXML
    ImageView selection;
    @FXML
    ImageView lightmeter;
    @FXML
    ProgressBar healthbar;
    @FXML
    ImageView controlls;
    @FXML
    ImageView nrdec;
    @FXML
    ImageView nrzif;
    @FXML
    ImageView firstlightimgv;
    private ArrayList<ImageView> walls = new ArrayList<>();
    private double health = 100;
    private int turn = 0;
    private int fearturn = 0;
    private int l = 0;
    private int charge = 0;
    private int bossarmor = 1;
    private ArrayList<ImageView> slots = new ArrayList<>();
    private boolean[] freeslots = {false, false, false, false, false, false, false, false, false};
    private boolean[] potionslots = {false, false, false, false, false, false, false, false, false};
    private int lightcounter = 70;
    private int fear = 80;
    private int selected = 1;
    private boolean cancelsuck = false;

    private int slimehealth = 4;
    private int floaterhealth = 4;
    private int blobhealth = 6;
    private Image imagenotava = new Image(getClass().getResource("/image/notavailable.png").toExternalForm());
    private Image imageavailable = new Image(getClass().getResource("/image/available.png").toExternalForm());
    private Image chestopening = new Image(getClass().getResource("/image/chestopenanimation.gif").toExternalForm());
    private Image darknessimage = new Image(getClass().getResource("/image/darkness.png").toExternalForm());
    private Image fineimg = new Image(getClass().getResource("/image/fine.gif").toExternalForm());
    private Image worriedimg = new Image(getClass().getResource("/image/worried.gif").toExternalForm());
    private Image stressedimg = new Image(getClass().getResource("/image/stressed.gif").toExternalForm());
    private Image horroredimg = new Image(getClass().getResource("/image/horrored.gif").toExternalForm());
    private Image light4 = new Image(getClass().getResource("/image/light4.png").toExternalForm());
    private Image light3 = new Image(getClass().getResource("/image/light3.png").toExternalForm());
    private Image light2 = new Image(getClass().getResource("/image/light2.png").toExternalForm());
    private Image light1 = new Image(getClass().getResource("/image/light1.png").toExternalForm());
    private Image light0 = new Image(getClass().getResource("/image/light0.png").toExternalForm());
    private Image swordimg = new Image(getClass().getResource("/image/sword.png").toExternalForm());
    private Image potionimg = new Image(getClass().getResource("/image/potion.gif").toExternalForm());
    private Image playerswordimg = new Image(getClass().getResource("/image/PlayerS.gif").toExternalForm());
    private Image playerimg = new Image(getClass().getResource("/image/Player.gif").toExternalForm());
    private Image chestclosedimg = new Image(getClass().getResource("/image/chest.png").toExternalForm());
    private Image attackableimg = new Image(getClass().getResource("/image/attackable.png").toExternalForm());
    private Image enemyindarkimg = new Image(getClass().getResource("/image/enemyinthedark.gif").toExternalForm());
    private Image playerpotion = new Image(getClass().getResource("/image/PlayerPotion.png").toExternalForm());
    private Image playerhealimg = new Image(getClass().getResource("/image/playerhealed_new.gif").toExternalForm());
    private Image wallimg = new Image(getClass().getResource("/image/dungeonwall.png").toExternalForm());
    private ArrayList<Image> Roomimgs = new ArrayList<>();
    private Rooms roomclass = new Rooms();
    private Enemy enemyclass = new Enemy();
    private Boss bossclass = new Boss();
    private ArrayList<ImageView> enemies = new ArrayList<>();

    private boolean chestopened = false;
    private ArrayList<ImageView> fearenemylist = new ArrayList<>();
    private ArrayList<ImageView> darkness = new ArrayList<>();

    public void initialize() {
        lightup(hero.getX(), hero.getY(), 4);
        //  chest.setFocusTraversable(true);
        hero.setFocusTraversable(true);

        enemies.add(enemyclass.slime);
        enemies.add(enemyclass.floater);
        enemies.add(enemyclass.blob);

        Roomimgs.add(new Image(getClass().getResource("/image/0.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/1.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/2.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/3.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/4.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/5.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/6.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/7.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/8.png").toExternalForm()));
        Roomimgs.add(new Image(getClass().getResource("/image/9.png").toExternalForm()));

        for (int i = 0; i < 121; i++) {
            walls.add(new ImageView());
            background.getChildren().add(walls.get(i));
            walls.get(i).toBack();
            walls.get(i).setImage(wallimg);
            walls.get(i).setFitHeight(64.0);
            walls.get(i).setFitWidth(64.0);
            walls.get(i).setPreserveRatio(true);
            walls.get(i).setPickOnBounds(true);
        }


        double darkx = -128;
        double darky = -128;
        double darkxadd = 0;
        double darkyadd = 0;

        for (ImageView enemy : enemies) {
            enemy.setX(770);
        }

        for (int m = 1; m <= 9; m++) {
            ImageView slot = new ImageView();

            slot.setLayoutX(0);
            slot.setLayoutY(0);
            slot.setPickOnBounds(true);
            slot.setPreserveRatio(true);
            slot.setFitHeight(52);
            slot.setFitWidth(52);
            slot.setId("slot" + m);
            slot.setY(762.0);
            slots.add(slot);

            background.getChildren().add(slot);

            switch (m) {
                case 1:
                    slot.setX(115.0);

                    break;
                case 2:
                    slot.setX(167.0);
                    break;
                case 3:
                    slot.setX(220.0);
                    break;
                case 4:
                    slot.setX(271.0);
                    break;
                case 5:
                    slot.setX(323.0);
                    break;
                case 6:
                    slot.setX(376.0);
                    break;
                case 7:
                    slot.setX(427.0);
                    break;
                case 8:
                    slot.setX(480.0);
                    break;
                case 9:
                    slot.setX(532.0);
                    break;
            }

        }

        int k = 1;
        for (int j = 1; k <= 121; j++) {
            for (int i = 1; i <= 11; i++) {
                ImageView darknessunit = new ImageView(darknessimage);


                darknessunit.setLayoutX(128);
                darknessunit.setLayoutY(128);
                darknessunit.setX(darkx + darkxadd);
                darknessunit.setY(darky + darkyadd);
                darknessunit.toFront();
                darknessunit.setVisible(true);

                darknessunit.setPickOnBounds(true);
                darknessunit.setPreserveRatio(true);


                darknessunit.setFitHeight(64);
                darknessunit.setFitWidth(64);

                darknessunit.setId("darkness" + k);
                darkness.add(darknessunit);
                background.getChildren().add(darknessunit);
                darkxadd += 64;
                darknessunit.setOpacity(0.8);
                k++;
            }
            darkxadd = 0;
            darkyadd += 64;
        }


    }

    private void burn(KeyEvent keyEvent, int selected) {
        if (keyEvent.getCharacter().equals("q") || keyEvent.getCharacter().equals("Q")) {
            if (freeslots[selected - 1]) {
                freeslots[selected - 1] = false;
                slots.get(selected - 1).setImage(null);
                hero.setImage(playerimg);
                lightcounter = 70;
            } else if (potionslots[selected - 1]) {
                if (health != 100) {
                    hero.setImage(playerhealimg);
                    potionslots[selected - 1] = false;
                    slots.get(selected - 1).setImage(null);
                    if (health >= 80) {
                        health = 100;
                    } else {
                        health += 20;
                    }
                }
            }
        }
    }

    public void select(KeyEvent keyEvent) {

        switch (keyEvent.getCharacter()) {
            case "1":
                selection.setX(115.0);
                selected = 1;
                if (freeslots[0]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "2":
                selection.setX(167.0);
                selected = 2;
                if (freeslots[1]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "3":
                selection.setX(220.0);
                selected = 3;
                if (freeslots[2]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "4":
                selection.setX(271.0);
                selected = 4;
                if (freeslots[3]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "5":
                selection.setX(323.0);
                selected = 5;
                if (freeslots[4]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "6":
                selection.setX(376.0);
                selected = 6;
                if (freeslots[5]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "7":
                selection.setX(427.0);
                selected = 7;
                if (freeslots[6]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "8":
                selection.setX(480.0);
                selected = 8;
                if (freeslots[7]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;
            case "9":
                selection.setX(532.0);
                selected = 9;
                if (freeslots[8]) {
                    hero.setImage(playerswordimg);
                } else {
                    hero.setImage(playerimg);
                }
                break;

        }
    }


    public void move(KeyEvent keyEvent) throws IOException {



        if (roomclass.roomnr == 1) {
            roomclass.setstartroom(walls);
        }

        System.out.println("Room Number:" + roomclass.roomnr + "   ENEMY ROOM   " + enemyclass.enemyroom + "     ENEMY DEAD   " + enemyclass.enemyroomdead);
        slimehealth = enemyclass.attack(hero, enemyclass.slime, freeslots, selected, slimehealth, keyEvent);
        floaterhealth = enemyclass.attack(hero, enemyclass.floater, freeslots, selected, floaterhealth, keyEvent);
        blobhealth = enemyclass.attack(hero, enemyclass.blob, freeslots, selected, blobhealth, keyEvent);


        enemykilled();


        select(keyEvent);
        lightup(hero.getX(), hero.getY(), 0);
        actionable(hero.getX(), hero.getY(), chest.getX(), chest.getY());

        if (chestopened) {
            chest.setX(770);
            chest.setImage(chestclosedimg);
            chestopened = false;
        }

        if (keyEvent.getCharacter().equals("x") || keyEvent.getCharacter().equals("X")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Quit.fxml"));

            Parent GO;
            GO = fxmlLoader.load();
            GO.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Quit");
            stage.getIcons().add(new Image("image/DoZweblogo_HD.png"));
            stage.setScene(new Scene(GO));
            stage.setResizable(false);

            stage.show();
        }

        if (keyEvent.getCharacter().equals("e") || keyEvent.getCharacter().equals("E")) {
            if (chest.getX() == hero.getX() && chest.getY() == hero.getY()) {
                for (int i = 0; i < 9; i++) {
                    if (turn % 5 == 0 && !freeslots[i] && !potionslots[i] && roomclass.roomnr != 1) {
                        openChest(hero.getX(), hero.getY(), chest.getX(), chest.getY(), slots.get(i), true);
                        potionslots[i] = true;
                        chestopened = true;
                        break;
                    } else {
                        if (!freeslots[i] && !potionslots[i]) {
                            openChest(hero.getX(), hero.getY(), chest.getX(), chest.getY(), slots.get(i), false);
                            freeslots[i] = true;
                            chestopened = true;
                            break;
                        }
                    }
                }
            }


        }

        if (potionslots[selected - 1]) {

            hero.setImage(playerpotion);
        } else if (!freeslots[selected - 1]) {
            hero.setImage(playerimg);
        } else {
            hero.setImage(playerswordimg);
        }


        burn(keyEvent, selected);


        movement(wallcollision(walls, hero), keyEvent);
        roomclass.newroom = false;
        roomclass.changeroom(hero, walls, controlls);

        //BOSS OR NORMAL ROOM
        if (roomclass.roomnr != 50) {
            enemyspawner();
        } else {
            bossroom(keyEvent);
        }

        //CHEST SPAWNING
        if (roomclass.roomnr != 1 && roomclass.newroom) {
            chestspawner();
        }


        //hero
        hero.setTranslateX(hero.getX());
        hero.setTranslateY(hero.getY());
        //North Field
        fieldn.setTranslateX(hero.getX());
        fieldn.setTranslateY(hero.getY());
        //East Field
        fieldo.setTranslateX(hero.getX());
        fieldo.setTranslateY(hero.getY());
        //South Field
        fields.setTranslateX(hero.getX());
        fields.setTranslateY(hero.getY());
        //West Field
        fieldw.setTranslateX(hero.getX());
        fieldw.setTranslateY(hero.getY());
        //Actioncloud
        actioncloud.setTranslateX(hero.getX());
        actioncloud.setTranslateY(hero.getY());

        System.out.println("Hero X: " + hero.getX());
        System.out.println("Hero Y: " + hero.getY());
        System.out.println("Enemy X: " + enemyclass.slime.getX());
        System.out.println("Enemy Y: " + enemyclass.slime.getY());
        System.out.println("Enemy F X: " + enemyclass.floater.getX());
        System.out.println("Enemy F Y: " + enemyclass.floater.getY());
        System.out.println("Enemy B X: " + enemyclass.blob.getX());
        System.out.println("Enemy B Y: " + enemyclass.blob.getY());


        fear = fearwhenlight(lightcounter, fear);

        // LIGHT ON FIRST ROOM
        if (roomclass.roomnr == 2) {
            background.getChildren().remove(firstlightimgv);
        } else if (roomclass.roomnr == 1) {
            firstlightimgv.toFront();
            lightup(0, 0, 2);
        }


        fearmetercheck(fear);
        actionable(hero.getX(), hero.getY(), chest.getX(), chest.getY());


        if (roomclass.slimeinroom) {
            enemyclass.slime.setFocusTraversable(true);
            enemyclass.enemyvision(enemyclass.slime, hero, lightcounter, slimehealth, "Slime");
            if (turn % 2 == 0) {
                enemyclass.enemymove(hero, enemyclass.slime, background, wallcollision(walls, enemyclass.slime));
            }

        }
        if (roomclass.floaterinroom && roomclass.roomnr % 2 == 0) {
            enemyclass.floater.setFocusTraversable(true);
            enemyclass.enemyvision(enemyclass.floater, hero, lightcounter, floaterhealth, "Floater");
            if (turn % 3 == 0) {
                enemyclass.enemymove(hero, enemyclass.floater, background, wallcollision(walls, enemyclass.floater));
            }

        }

        if (roomclass.blobinroom && roomclass.roomnr % 5 == 0) {

            enemyclass.blob.setFocusTraversable(true);
            enemyclass.enemyvision(enemyclass.blob, hero, lightcounter, blobhealth, "Blob");
            if (turn % 5 == 0) {
                enemyclass.enemymove(hero, enemyclass.blob, background, wallcollision(walls, enemyclass.blob));
            }
        }

        if (enemyclass.slime.getX() == hero.getX() && enemyclass.slime.getY() == hero.getY()) {
            health = enemyclass.hurt(healthbar, health, 1);
        }
        if (enemyclass.floater.getX() == hero.getX() && enemyclass.floater.getY() == hero.getY()) {
            health = enemyclass.hurt(healthbar, health, 5);
        }

        if (enemyclass.blob.getX() == hero.getX() && enemyclass.blob.getY() == hero.getY()) {
            health = enemyclass.hurt(healthbar, health, 10);
        }

        if (roomclass.slimeinroom) {
            enemyclass.enemyvision(enemyclass.slime, hero, lightcounter, slimehealth, "Slime");


        }
        if (roomclass.floaterinroom) {
            enemyclass.enemyvision(enemyclass.floater, hero, lightcounter, floaterhealth, "Floater");
        }

        if (roomclass.blobinroom) {
            enemyclass.enemyvision(enemyclass.blob, hero, lightcounter, blobhealth, "Blob");
        }
        predfields(wallcollision(walls, hero), enemies);

        if (roomclass.roomnr == 50) {
            predfieldsboss(wallcollision(walls, hero), bossclass.boss);
        }


        //GAME OVER
        if (health <= 0) {
            healthbar.setProgress(2 / 100);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameOver.fxml"));

            Parent GO = fxmlLoader.load();
            GO.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Game Over");
            stage.getIcons().add(new Image("image/Skull.png"));
            stage.setScene(new Scene(GO));
            Stage gamestage = (Stage) hero.getScene().getWindow();
            stage.setResizable(false);

            stage.show();
            gamestage.close();
            background.getChildren().clear();
            background.getChildren().remove(healthbar);

        }
        //FEARENEMY
        if (fear <= 10) {
            if (fearturn % 3 == 0) {


                ImageView fearenemy = new ImageView();
                background.getChildren().add(fearenemy);

                fearenemy.setImage(enemyindarkimg);
                fearenemy.setFitHeight(64.0);
                fearenemy.setFitWidth(64.0);
                spawn(fearenemy, walls, turn);
                fearenemy.toFront();
                fearenemylist.add(fearenemy);
                fearturn++;


            } else {
                fearturn++;
                for (int i = 0; i < fearenemylist.size(); i++) {
                    enemyclass.enemymove(hero, fearenemylist.get(i), background, wallcollision(walls, fearenemylist.get(i)));
                    if (fearenemylist.get(i).getX() == hero.getX() && fearenemylist.get(i).getY() == hero.getY()) {
                        background.getChildren().remove(fearenemylist.get(i));
                    }
                }
            }
        }
        if (lightcounter > 0 && fearenemylist.size() > 0) {

            for (int i = 0; i < fearenemylist.size(); i++) {
                fearenemylist.get(i).setOpacity(0.3);
            }


            if (l < fearenemylist.size()) {
                fearenemylist.get(l).setVisible(false);
                background.getChildren().remove(fearenemylist.get(l));
                l++;
            }
        }

        //ROOM NRs
        nrdec.setImage(Roomimgs.get((roomclass.roomnr - roomclass.roomnr % 10) / 10));
        nrzif.setImage(Roomimgs.get(roomclass.roomnr % 10));
        nrdec.setOpacity(0.5);
        nrzif.setOpacity(0.5);
        nrdec.toFront();
        nrzif.toFront();

        for (int slotcount = 0; slotcount < freeslots.length; slotcount++) {
            if (freeslots[slotcount]) {
                potionslots[slotcount] = false;
            } else if (potionslots[slotcount]) {
                freeslots[slotcount] = false;
            }
        }

        turn++;
        System.out.println(turn);
        healthbar.setProgress(health / 100);
    }


    private int fearwhenlight(int lightcounter, int fear) {
        if (lightcounter >= 50) {
            lightup(hero.getX(), hero.getY(), 4);
            lightmeter.setImage(light4);

            if (fear < 80) {
                fear += 2;
            }
        }
        if (lightcounter < 50 && lightcounter > 20) {
            lightup(hero.getX(), hero.getY(), 3);
            lightmeter.setImage(light3);

            if (fear < 80) {
                fear++;
            }
        }
        if (lightcounter <= 20 && lightcounter > 10) {
            lightup(hero.getX(), hero.getY(), 2);
            lightmeter.setImage(light2);

            if (fear < 80) {
                fear++;
            }
        }
        if (lightcounter <= 10) {
            lightup(hero.getX(), hero.getY(), 1);
            lightmeter.setImage(light1);
            if (lightcounter != 0) {

                if (fear < 80) {
                    fear++;
                }
            }

        }
        if (lightcounter == 0) {
            lightup(hero.getX(), hero.getY(), 0);
            lightmeter.setImage(light0);

        }

        return fear;
    }

    private void bossroom(KeyEvent keyEvent) throws IOException {

        nrdec.setVisible(false);
        nrzif.setVisible(false);
        enemyclass.floater.setX(770);
        enemyclass.slime.setX(770);
        enemyclass.blob.setX(770);


        if (turn % 5 == 0) {
            if (!cancelsuck && (turn % 100 == 20 || turn % 100 == 25 || turn % 100 == 30) && charge != 3) {
                if (charge == 0) {
                    bossarmor = 3;
                }
                bossclass.boss.setImage(bossclass.suckimg);
                charge++;

            } else {

                bossclass.boss.setImage(bossclass.bossimg);
                bossclass.bossmove(hero, bossclass.boss, background, wallcollision(walls, bossclass.boss));
                if (charge == 0) {
                    cancelsuck = false;
                }
            }
            if (charge == 3 && !cancelsuck) {
                lightcounter = bossclass.suckattack(bossclass.boss);
                health -= 5;
                bossclass.boss.setImage(bossclass.bossimg);
                charge = 0;
                cancelsuck = false;
            } else if (cancelsuck) {
                charge = 0;
            }
        }
        if (fieldn.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("i") || keyEvent.getCharacter().equals("I") ||
                fieldo.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("l") || keyEvent.getCharacter().equals("L")||
                fields.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("k") || keyEvent.getCharacter().equals("K")||
                fieldw.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("j")|| keyEvent.getCharacter().equals("J")) {
            if (bossarmor == 0) {
                if (freeslots[selected - 1] && bossclass.bosshealth != 0) {
                    bossclass.bosshealth--;
                    cancelsuck = true;

                    if (lightcounter <= 10) {
                        bossarmor = 2;
                    } else {
                        bossarmor = 1;
                    }
                }
            } else {
                bossarmor--;
            }
        }


        if (bossclass.bosshealth == 0) {
            bossclass.endgame();
        }


        for (int i = 0; i < darkness.size(); i++) {
            darkness.get(i).toFront();
            bossclass.bosshealthbar.toFront();
        }

        if (turn % 50 == 0) {
            chestspawner();
        }


        if (bosshurt(hero)) {
            if (lightcounter <= 10) {
                health = enemyclass.hurt(healthbar, health, 10);
            } else {
                health = enemyclass.hurt(healthbar, health, 5);
            }
        }

        bossclass.updatehealthbar(bossclass.bosshealth);
    }

    private void chestspawner() {
        chest.setX(770);
        turn++;
        spawn(chest, walls, turn);
        boolean chestgenerated = true;
        chestopened = false;
        roomclass.newroom = false;

    }

    private void enemykilled() {

        if (slimehealth == 0) {
            enemyclass.slime.setX(6400);
            enemyclass.enemyroomdead = roomclass.roomnr;

            if (lightcounter <= 69) {
                lightcounter += 1;
            } else {
                lightcounter = 70;
            }

            if (!(enemyclass.enemyroom == roomclass.roomnr)) {
                slimehealth = 4;
            }
        }
        if (floaterhealth == 0) {
            enemyclass.floater.setImage(enemyclass.floatpics.get(0));
            enemyclass.floater.setX(6400);
            enemyclass.enemyroomdead = roomclass.roomnr;

            if (lightcounter <= 65) {
                lightcounter += 5;
            } else {
                lightcounter = 70;
            }

            if (!(enemyclass.enemyroom == roomclass.roomnr)) {
                floaterhealth = 4;
            }
        }
        if (blobhealth == 0) {
            enemyclass.blob.setImage(enemyclass.blobpics.get(0));
            enemyclass.blob.setX(6400);
            enemyclass.enemyroomdead = roomclass.roomnr;


            if (lightcounter <= 60) {
                lightcounter += 10;
            } else {
                lightcounter = 70;
            }

            if (!(enemyclass.enemyroom == roomclass.roomnr)) {
                blobhealth = 6;
            }
        }

    }

    private void fearmetercheck(int fear) {
        if (fear > 60) {
            fearmeter.setImage(fineimg);
        }
        if (fear <= 60) {
            fearmeter.setImage(stressedimg);
        }
        if (fear <= 40) {
            fearmeter.setImage(worriedimg);
        }
        if (fear <= 20) {
            fearmeter.setImage(horroredimg);
        }

    }

    private boolean bosshurt(ImageView hero) {
        return (hero.getX() == bossclass.boss.getX() && hero.getY() == bossclass.boss.getY()) ||
                (hero.getX() == bossclass.boss.getX() + 64 && hero.getY() == bossclass.boss.getY()) ||
                (hero.getX() == bossclass.boss.getX() && hero.getY() == bossclass.boss.getY() + 64) ||
                (hero.getX() == bossclass.boss.getX() + 64 && hero.getY() == bossclass.boss.getY() + 64);

    }

    private void openChest(double x, double y, double cx, double cy, ImageView slot, boolean potion) {
        if (potion) {
            if (x == cx && y == cy) {
                chest.setImage(chestopening);
                slot.setImage(potionimg);


            }
        } else {
            if (x == cx && y == cy) {
                chest.setImage(chestopening);
                slot.setImage(swordimg);


            }
        }
    }

    private void actionable(double x, double y, double ax, double ay) {
        if (x == ax && y == ay) {
            actioncloud.setVisible(true);
        } else {
            actioncloud.setVisible(false);
        }
    }

    public void predfields(int[] available, ArrayList<ImageView> enemy) {

        boolean[] attackablefields = new boolean[4];

        for (int i = 0; i < enemy.size(); i++) {

            if (available[0] == 0) {
                fieldn.setImage(imagenotava);
            } else {
                if (hero.getX() == enemy.get(i).getX() && (hero.getY() - 64) == enemy.get(i).getY()) {
                    fieldn.setImage(attackableimg);
                    attackablefields[0] = true;
                } else {
                    if (attackablefields[0]) {
                        fieldn.setImage(attackableimg);
                    } else {
                        fieldn.setImage(imageavailable);
                    }
                }
            }
            if (available[1] == 0) {
                fieldw.setImage(imagenotava);
            } else {
                if ((hero.getX() - 64) == enemy.get(i).getX() && hero.getY() == enemy.get(i).getY()) {
                    fieldw.setImage(attackableimg);
                    attackablefields[1] = true;
                } else {
                    if (attackablefields[1]) {
                        fieldw.setImage(attackableimg);
                    } else {
                        fieldw.setImage(imageavailable);
                    }
                }
            }
            if (available[2] == 0) {
                fields.setImage(imagenotava);
            } else {
                if (hero.getX() == enemy.get(i).getX() && (hero.getY() + 64) == enemy.get(i).getY()) {
                    fields.setImage(attackableimg);
                    attackablefields[2] = true;
                } else {
                    if (attackablefields[2]) {
                        fields.setImage(attackableimg);
                    } else {
                        fields.setImage(imageavailable);
                    }
                }
            }
            if (available[3] == 0) {
                fieldo.setImage(imagenotava);
            } else {
                if ((hero.getX() + 64) == enemy.get(i).getX() && hero.getY() == enemy.get(i).getY()) {
                    fieldo.setImage(attackableimg);
                    attackablefields[3] = true;
                } else {
                    if (attackablefields[3]) {
                        fieldo.setImage(attackableimg);
                    } else {
                        fieldo.setImage(imageavailable);
                    }
                }
            }
        }

    }


    private void predfieldsboss(int[] available, ImageView boss) {

        boolean[] attackablefields = new boolean[4];

        for (int x = 0; x < 128; x += 64) {
            for (int y = 0; y < 128; y += 64) {

                if (available[0] == 0) {
                    fieldn.setImage(imagenotava);
                } else {
                    if (hero.getX() == boss.getX() + x && (hero.getY() - 64) == boss.getY() + y && !attackablefields[0]) {
                        fieldn.setImage(attackableimg);
                        attackablefields[0] = true;
                    } else {
                        if (attackablefields[0]) {
                            fieldn.setImage(attackableimg);
                        } else {
                            fieldn.setImage(imageavailable);
                        }
                    }
                }
                if (available[1] == 0) {
                    fieldw.setImage(imagenotava);
                } else {
                    if ((hero.getX() - 64) == boss.getX() + x && hero.getY() == boss.getY() + y && !attackablefields[1]) {
                        fieldw.setImage(attackableimg);
                        attackablefields[1] = true;
                    } else {
                        if (attackablefields[1]) {
                            fieldw.setImage(attackableimg);
                        } else {
                            fieldw.setImage(imageavailable);
                        }
                    }
                }
                if (available[2] == 0) {
                    fields.setImage(imagenotava);
                } else {
                    if (hero.getX() == boss.getX() + x && (hero.getY() + 64) == boss.getY() + y && !attackablefields[2]) {
                        fields.setImage(attackableimg);
                        attackablefields[2] = true;
                    } else {
                        if (attackablefields[2]) {
                            fields.setImage(attackableimg);
                        } else {
                            fields.setImage(imageavailable);
                        }
                    }
                }
                if (available[3] == 0) {
                    fieldo.setImage(imagenotava);
                } else {
                    if ((hero.getX() + 64) == boss.getX() + x && hero.getY() == boss.getY() + y && !attackablefields[3]) {
                        fieldo.setImage(attackableimg);
                        attackablefields[3] = true;
                    } else {
                        if (attackablefields[3]) {
                            fieldo.setImage(attackableimg);
                        } else {
                            fieldo.setImage(imageavailable);
                        }
                    }
                }
            }
        }
    }


    public int[] wallcollision(ArrayList<ImageView> wall, ImageView hero) {

        int[] walltot = new int[4];
        walltot[0] = 1;
        walltot[1] = 1;
        walltot[2] = 1;
        walltot[3] = 1;
        for (int i = 0; i < wall.size(); i++) {
            if (walltot[0] != 0) {
                if (!(hero.getY() != wall.get(i).getY() + 64 || hero.getX() != wall.get(i).getX())) {
                    walltot[0] = 0;
                }
            }

            if (walltot[1] != 0) {
                if (!(hero.getY() != wall.get(i).getY() || hero.getX() != wall.get(i).getX() + 64)) {
                    walltot[1] = 0;
                }
            }
            if (walltot[2] != 0) {
                if (!(hero.getY() + 64 != wall.get(i).getY() || hero.getX() != wall.get(i).getX())) {
                    walltot[2] = 0;
                }
            }
            if (walltot[3] != 0) {
                if (!(hero.getY() != wall.get(i).getY() || hero.getX() != wall.get(i).getX() - 64)) {
                    walltot[3] = 0;
                }
            }
        }
        return walltot;
    }

    public void lightup(double herox, double heroy, int lightlevel) {
        switch (lightlevel) {
            case 0:
                for (int i = 0; i < darkness.size(); i++) {
                    darkness.get(i).setOpacity(0.8);
                }
                break;
            case 1:
                for (int i = 0; i < darkness.size(); i++) {

                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }


                }

                break;
            case 2:
                for (int i = 0; i < darkness.size(); i++) {

                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.05);
                    }


                }

                break;
            case 3:
                for (int i = 0; i < darkness.size(); i++) {
                    if (herox + 256 > darkness.get(i).getX() && herox - 256 < darkness.get(i).getX() && heroy + 256 > darkness.get(i).getY() && heroy - 256 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.2);
                    }
                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                }

                break;
            case 4:
                for (int i = 0; i < darkness.size(); i++) {
                    if (herox + 320 > darkness.get(i).getX() && herox - 320 < darkness.get(i).getX() && heroy + 320 > darkness.get(i).getY() && heroy - 320 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.2);
                    }
                    if (herox + 256 > darkness.get(i).getX() && herox - 256 < darkness.get(i).getX() && heroy + 256 > darkness.get(i).getY() && heroy - 256 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.2);
                    }
                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(darkness.get(i).getOpacity() - 0.1);
                    }
                }

                break;


        }
    }


    public void spawn(ImageView entity, ArrayList<ImageView> walls, int turn) {

        Random rand = new Random();
        boolean wallfound;
        boolean locationavailable;
        double entityX;
        double entityY;

        do {
            wallfound = false;
            locationavailable = false;
            entityX = ((rand.nextInt(8) - 1) * 64);
            entityY = ((rand.nextInt(8) - 1) * 64);

            for (int i = 0; i < walls.size(); i++) {
                if (entityY == walls.get(i).getY() && entityX == walls.get(i).getX()) {
                    wallfound = true;
                } else if (entityY != walls.get(i).getY() && entityX != walls.get(i).getX() && !wallfound) {
                    locationavailable = true;
                } else if (wallfound) {
                    locationavailable = false;
                }
            }


        } while (!locationavailable);

        entity.setX(entityX);
        entity.setY(entityY);


    }

    private void enemyspawner() {
        if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && slimehealth == 4) {

            turn++;
            if (roomclass.newroom) {
                spawn(enemyclass.slime, walls, turn);
            }
            if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && floaterhealth == 4 && roomclass.roomnr % 2 == 0) {
                turn += 2;
                if (roomclass.newroom) {
                    spawn(enemyclass.floater, walls, turn);
                }

            } else {
                enemyclass.floater.setX(770);
                floaterhealth = 4;
            }
            if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && blobhealth == 6 && roomclass.roomnr % 5 == 0) {
                turn += 4;
                if (roomclass.newroom) {
                    spawn(enemyclass.blob, walls, turn);
                }

            } else {
                enemyclass.blob.setX(770);
                blobhealth = 6;
            }
            enemyclass.enemyroom++;
        } else {
            if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && slimehealth != 4) {
                turn++;
                slimehealth = 4;
                spawn(enemyclass.slime, walls, turn);
            }
        }
    }


    public void movement(int[] availablemovement, KeyEvent keyEvent) {


        if (keyEvent.getCharacter().equals("w")|| keyEvent.getCharacter().equals("W")) {
            if (availablemovement[0] != 0) {

                hero.setY(hero.getY() - 64);

                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }

            }

        }
        if (keyEvent.getCharacter().equals("a")|| keyEvent.getCharacter().equals("A")) {
            if (availablemovement[1] != 0) {
                hero.setX(hero.getX() - 64);


                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }
            }

        }
        if (keyEvent.getCharacter().equals("s") || keyEvent.getCharacter().equals("S")) {
            if (availablemovement[2] != 0) {
                hero.setY(hero.getY() + 64);

                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }
            }
        }
        if (keyEvent.getCharacter().equals("d") || keyEvent.getCharacter().equals("D")) {
            if (availablemovement[3] != 0) {
                hero.setX(hero.getX() + 64);


                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }
            }
        }

    }

}
