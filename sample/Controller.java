package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Controller {

    ArrayList<ImageView> walls = new ArrayList<ImageView>();
    boolean firstroom = true;
    int freeslot = 0;
    double health = 100;
    int turn = 0;
    int fearturn = 0;
    int l = 0;
    int charge = 0;
    int bossarmor = 1;


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
    ImageView wall;
    @FXML
    ImageView wall2;
    @FXML
    ImageView wall3;
    @FXML
    ImageView wall4;
    @FXML
    ImageView wall5;
    @FXML
    ImageView wall6;
    @FXML
    ImageView wall7;
    @FXML
    ImageView wall8;
    @FXML
    ImageView wall9;
    @FXML
    ImageView wall10;
    @FXML
    ImageView wall11;
    @FXML
    ImageView wall12;
    @FXML
    ImageView wall13;
    @FXML
    ImageView wall14;
    @FXML
    ImageView wall15;
    @FXML
    ImageView wall16;
    @FXML
    ImageView wall17;
    @FXML
    ImageView wall18;
    @FXML
    ImageView wall19;
    @FXML
    ImageView wall20;
    @FXML
    ImageView wall21;
    @FXML
    ImageView wall22;
    @FXML
    ImageView wall23;
    @FXML
    ImageView wall24;
    @FXML
    ImageView wall25;
    @FXML
    ImageView wall26;
    @FXML
    ImageView wall27;
    @FXML
    ImageView wall28;
    @FXML
    ImageView wall29;
    @FXML
    ImageView wall30;
    @FXML
    ImageView wall31;
    @FXML
    ImageView wall32;
    @FXML
    ImageView wall33;
    @FXML
    ImageView wall34;
    @FXML
    ImageView wall35;
    @FXML
    ImageView wall36;
    @FXML
    ImageView wall37;
    @FXML
    ImageView wall38;
    @FXML
    ImageView wall39;
    @FXML
    ImageView wall40;
    @FXML
    ImageView wall41;
    @FXML
    ImageView wall42;
    @FXML
    ImageView wall43;
    @FXML
    ImageView wall44;
    @FXML
    ImageView wall45;
    @FXML
    ImageView wall46;
    @FXML
    ImageView wall47;
    @FXML
    ImageView wall48;
    @FXML
    ImageView wall49;
    @FXML
    ImageView wall50;
    @FXML
    ImageView wall51;
    @FXML
    ImageView wall52;
    @FXML
    ImageView wall53;
    @FXML
    ImageView wall54;
    @FXML
    ImageView wall55;
    @FXML
    ImageView wall56;
    @FXML
    ImageView wall57;
    @FXML
    ImageView wall58;
    @FXML
    ImageView wall59;
    @FXML
    ImageView wall60;
    @FXML
    ImageView wall61;
    @FXML
    ImageView wall62;
    @FXML
    ImageView wall63;
    @FXML
    ImageView wall64;
    @FXML
    ImageView wall65;
    @FXML
    ImageView wall66;
    @FXML
    ImageView wall67;
    @FXML
    ImageView wall68;
    @FXML
    ImageView wall69;
    @FXML
    ImageView wall70;
    @FXML
    ImageView wall71;
    @FXML
    ImageView wall72;
    @FXML
    ImageView wall73;
    @FXML
    ImageView wall74;
    @FXML
    ImageView wall75;
    @FXML
    ImageView wall76;
    @FXML
    ImageView wall77;
    @FXML
    ImageView wall78;
    @FXML
    ImageView wall79;
    @FXML
    ImageView wall80;
    @FXML
    ImageView wall81;
    @FXML
    ImageView wall82;
    @FXML
    ImageView wall83;
    @FXML
    ImageView wall84;
    @FXML
    ImageView wall85;
    @FXML
    ImageView wall86;
    @FXML
    ImageView wall87;
    @FXML
    ImageView wall88;
    @FXML
    ImageView wall89;
    @FXML
    ImageView wall90;
    @FXML
    ImageView wall91;
    @FXML
    ImageView wall92;
    @FXML
    ImageView wall93;
    @FXML
    ImageView wall94;
    @FXML
    ImageView wall95;
    @FXML
    ImageView wall96;
    @FXML
    ImageView wall97;
    @FXML
    ImageView wall98;
    @FXML
    ImageView wall99;
    @FXML
    ImageView wall100;
    @FXML
    ImageView wall101;
    @FXML
    ImageView wall102;
    @FXML
    ImageView wall103;
    @FXML
    ImageView wall104;
    @FXML
    ImageView wall105;
    @FXML
    ImageView wall106;
    @FXML
    ImageView wall107;
    @FXML
    ImageView wall108;
    @FXML
    ImageView wall109;
    @FXML
    ImageView wall110;
    @FXML
    ImageView wall111;
    @FXML
    ImageView wall112;
    @FXML
    ImageView wall113;
    @FXML
    ImageView wall114;
    @FXML
    ImageView wall115;
    @FXML
    ImageView wall116;
    @FXML
    ImageView wall117;
    @FXML
    ImageView wall118;
    @FXML
    ImageView wall119;
    @FXML
    ImageView wall120;
    @FXML
    ImageView wall121;

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
    ArrayList<ImageView> slots = new ArrayList<>();
    boolean[] freeslots = {false, false, false, false, false, false, false, false, false};
    boolean[] potionslots = {false, false, false, false, false, false, false, false, false};
    double x = 0;
    double y = 0;
    int lightcounter = 70;
    int fear = 80;
    int selected = 1;
    boolean cancelsuck = false;

    int slimehealth = 4;
    int floaterhealth = 4;
    int blobhealth = 6;
    Image imagenotava = new Image(getClass().getResource("/image/notavailable.png").toExternalForm());
    Image imageavailable = new Image(getClass().getResource("/image/available.png").toExternalForm());
    Image chestopening = new Image(getClass().getResource("/image/chestopenanimation.gif").toExternalForm());
    Image darknessimage = new Image(getClass().getResource("/image/darkness.png").toExternalForm());
    Image fineimg = new Image(getClass().getResource("/image/fine.gif").toExternalForm());
    Image worriedimg = new Image(getClass().getResource("/image/worried.gif").toExternalForm());
    Image stressedimg = new Image(getClass().getResource("/image/stressed.gif").toExternalForm());
    Image horroredimg = new Image(getClass().getResource("/image/horrored.gif").toExternalForm());
    Image light4 = new Image(getClass().getResource("/image/light4.png").toExternalForm());
    Image light3 = new Image(getClass().getResource("/image/light3.png").toExternalForm());
    Image light2 = new Image(getClass().getResource("/image/light2.png").toExternalForm());
    Image light1 = new Image(getClass().getResource("/image/light1.png").toExternalForm());
    Image light0 = new Image(getClass().getResource("/image/light0.png").toExternalForm());
    Image swordimg = new Image(getClass().getResource("/image/sword.png").toExternalForm());
    Image potionimg = new Image(getClass().getResource("/image/potion.gif").toExternalForm());
    Image playerswordimg = new Image(getClass().getResource("/image/PlayerS.gif").toExternalForm());
    Image playerimg = new Image(getClass().getResource("/image/Player.gif").toExternalForm());
    Image chestclosedimg = new Image(getClass().getResource("/image/chest.png").toExternalForm());
    Image attackableimg = new Image(getClass().getResource("/image/attackable.png").toExternalForm());
    Image enemyindarkimg = new Image(getClass().getResource("/image/enemyinthedark.gif").toExternalForm());
    Image roomimg1 = new Image(getClass().getResource("/image/1.png").toExternalForm());
    Image roomimg2 = new Image(getClass().getResource("/image/2.png").toExternalForm());
    Image roomimg3 = new Image(getClass().getResource("/image/3.png").toExternalForm());
    Image roomimg4 = new Image(getClass().getResource("/image/4.png").toExternalForm());
    Image roomimg5 = new Image(getClass().getResource("/image/5.png").toExternalForm());
    Image roomimg6 = new Image(getClass().getResource("/image/6.png").toExternalForm());
    Image roomimg7 = new Image(getClass().getResource("/image/7.png").toExternalForm());
    Image roomimg8 = new Image(getClass().getResource("/image/8.png").toExternalForm());
    Image roomimg9 = new Image(getClass().getResource("/image/9.png").toExternalForm());
    Image roomimg0 = new Image(getClass().getResource("/image/0.png").toExternalForm());
    Image playerhealimg = new Image(getClass().getResource("/image/playerhealed_new.gif").toExternalForm());
    ArrayList<Image> Roomimgs = new ArrayList<>();
    Rooms roomclass = new Rooms();
    Enemy enemyclass = new Enemy();
    Boss bossclass = new Boss();
    ArrayList<ImageView> enemies = new ArrayList<>();

    ArrayList<Double> roomORX = null;
    ArrayList<Double> roomORY = null;
    boolean chestopened = false;
    boolean chestgenerated = false;
    ArrayList<ImageView> fearenemylist = new ArrayList<>();
    private ArrayList<ImageView> darkness = new ArrayList<ImageView>();

    public void initialize() {
        lightup(hero.getX(), hero.getY(), 4);
        //  chest.setFocusTraversable(true);
        hero.setFocusTraversable(true);

        enemies.add(enemyclass.slime);
        enemies.add(enemyclass.floater);
        enemies.add(enemyclass.blob);

        Roomimgs.add(roomimg0);
        Roomimgs.add(roomimg1);
        Roomimgs.add(roomimg2);
        Roomimgs.add(roomimg3);
        Roomimgs.add(roomimg4);
        Roomimgs.add(roomimg5);
        Roomimgs.add(roomimg6);
        Roomimgs.add(roomimg7);
        Roomimgs.add(roomimg8);
        Roomimgs.add(roomimg9);

        walls.add(wall);
        walls.add(wall2);
        walls.add(wall3);
        walls.add(wall4);
        walls.add(wall5);
        walls.add(wall6);
        walls.add(wall7);
        walls.add(wall8);
        walls.add(wall9);
        walls.add(wall10);
        walls.add(wall11);
        walls.add(wall12);
        walls.add(wall13);
        walls.add(wall14);
        walls.add(wall15);
        walls.add(wall16);
        walls.add(wall17);
        walls.add(wall18);
        walls.add(wall19);
        walls.add(wall20);
        walls.add(wall21);
        walls.add(wall22);
        walls.add(wall23);
        walls.add(wall24);
        walls.add(wall25);
        walls.add(wall26);
        walls.add(wall27);
        walls.add(wall28);
        walls.add(wall29);
        walls.add(wall30);
        walls.add(wall31);
        walls.add(wall32);
        walls.add(wall33);
        walls.add(wall34);
        walls.add(wall35);
        walls.add(wall36);
        walls.add(wall37);
        walls.add(wall38);
        walls.add(wall39);
        walls.add(wall40);
        walls.add(wall41);
        walls.add(wall42);
        walls.add(wall43);
        walls.add(wall44);
        walls.add(wall45);
        walls.add(wall46);
        walls.add(wall47);
        walls.add(wall48);
        walls.add(wall49);
        walls.add(wall50);
        walls.add(wall51);
        walls.add(wall52);
        walls.add(wall53);
        walls.add(wall54);
        walls.add(wall55);
        walls.add(wall56);
        walls.add(wall57);
        walls.add(wall58);
        walls.add(wall59);
        walls.add(wall60);
        walls.add(wall61);
        walls.add(wall62);
        walls.add(wall63);
        walls.add(wall64);
        walls.add(wall65);
        walls.add(wall66);
        walls.add(wall67);
        walls.add(wall68);
        walls.add(wall69);
        walls.add(wall70);
        walls.add(wall71);
        walls.add(wall72);
        walls.add(wall73);
        walls.add(wall74);
        walls.add(wall75);
        walls.add(wall76);
        walls.add(wall77);
        walls.add(wall78);
        walls.add(wall79);
        walls.add(wall80);
        walls.add(wall81);
        walls.add(wall82);
        walls.add(wall83);
        walls.add(wall84);
        walls.add(wall85);
        walls.add(wall86);
        walls.add(wall87);
        walls.add(wall88);
        walls.add(wall89);
        walls.add(wall90);
        walls.add(wall91);
        walls.add(wall92);
        walls.add(wall93);
        walls.add(wall94);
        walls.add(wall95);
        walls.add(wall96);
        walls.add(wall97);
        walls.add(wall98);
        walls.add(wall99);
        walls.add(wall100);
        walls.add(wall101);
        walls.add(wall102);
        walls.add(wall103);
        walls.add(wall104);
        walls.add(wall105);
        walls.add(wall106);
        walls.add(wall107);
        walls.add(wall108);
        walls.add(wall109);
        walls.add(wall110);
        walls.add(wall111);
        walls.add(wall112);
        walls.add(wall113);
        walls.add(wall114);
        walls.add(wall115);
        walls.add(wall116);
        walls.add(wall117);
        walls.add(wall118);
        walls.add(wall119);
        walls.add(wall120);
        walls.add(wall121);


        double darkx = -128;
        double darky = -128;
        double darkxadd = 0;
        double darkyadd = 0;
        enemyclass.slime.setX(770);
        enemyclass.floater.setX(770);
        enemyclass.blob.setX(770);


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

                System.out.println(darkx + darkxadd);
                System.out.println(darky + darkyadd);
                darknessunit.setId("darkness" + k);
                darkness.add(darknessunit);
                background.getChildren().add(darknessunit);
                darkxadd += 64;
                darknessunit.setOpacity(0.8);
                k++;
            }
            darkxadd = 0;
            darkyadd += 64;
            System.out.println();
        }

    }

    public void burn(KeyEvent keyEvent, int selected) {
        if (keyEvent.getCharacter().equals("q")) {
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

    public void move(KeyEvent keyEvent) throws IOException, InterruptedException {


        System.out.println("Room Number:" + roomclass.roomnr + "   ENEMY ROOM   " + enemyclass.enemyroom + "     ENEMY DEAD   " + enemyclass.enemyroomdead);
        slimehealth = enemyclass.attack(hero, enemyclass.slime, freeslots, selected, slimehealth, keyEvent);
        floaterhealth = enemyclass.attack(hero, enemyclass.floater, freeslots, selected, floaterhealth, keyEvent);
        blobhealth = enemyclass.attack(hero, enemyclass.blob, freeslots, selected, blobhealth, keyEvent);
        if (slimehealth == 0) {
            enemyclass.slime.setX(6400);
            // background.getChildren().remove(enemyclass.slime);
            enemyclass.enemyroomdead = roomclass.roomnr;

            if (lightcounter <= 69) {
                lightcounter += 1;
            } else {
                lightcounter = 70;
            }

            if (!(enemyclass.enemyroom == roomclass.roomnr)) {
                slimehealth = 4;
                System.out.println("ENEMY FULL HEALTH");
            }
        }
        if (floaterhealth == 0) {
            enemyclass.floater.setImage(enemyclass.floater0img);
            enemyclass.floater.setX(6400);
            enemyclass.enemyroomdead = roomclass.roomnr;

            if (lightcounter <= 65) {
                lightcounter += 5;
            } else {
                lightcounter = 70;
            }

            if (!(enemyclass.enemyroom == roomclass.roomnr)) {
                floaterhealth = 4;
                System.out.println("ENEMY FULL HEALTH");
            }
        }
        if (blobhealth == 0) {
            enemyclass.blob.setImage(enemyclass.blob0img);
            enemyclass.blob.setX(6400);
            enemyclass.enemyroomdead = roomclass.roomnr;


            if (lightcounter <= 60) {
                lightcounter += 10;
            } else {
                lightcounter = 70;
            }

            if (!(enemyclass.enemyroom == roomclass.roomnr)) {
                blobhealth = 6;
                System.out.println("ENEMY FULL HEALTH");
            }
        }


        if (chestopened) {
            chest.setX(770);
            chest.setImage(chestclosedimg);
            chestopened = false;
        }



        if (firstroom) {
            roomORX = new ArrayList<>();
            roomORY = new ArrayList<>();
            for (int i = 0; i < walls.size(); i++) {
                roomORX.add(walls.get(i).getX());
                roomORY.add(walls.get(i).getY());
            }
            firstroom = false;
        }

        System.out.println(lightcounter);
        select(keyEvent);
        lightup(hero.getX(), hero.getY(), 0);


        actionable(hero.getX(), hero.getY(), chest.getX(), chest.getY());

        if (keyEvent.getCharacter().equals("e")) {
            if (chest.getX() == hero.getX() && chest.getY() == hero.getY()) {
                for (int i = 0; i < 9; i++) {
                    if (turn % 5 == 0 && !freeslots[i] && !potionslots[i]) {
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

        if (!freeslots[selected - 1]) {
            hero.setImage(playerimg);
        }else {
            hero.setImage(playerswordimg);
        }



        burn(keyEvent, selected);


        movement(wallcollision(walls, hero), keyEvent);


        roomclass.changeroom(hero, walls, roomORX, roomORY, background, controlls);

        if (roomclass.roomnr < 50) {
            if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && slimehealth == 4) {

                turn++;
                spawn(enemyclass.slime, walls, turn);

                System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && floaterhealth == 4 && roomclass.roomnr % 2 == 0) {
                    turn++;
                    spawn(enemyclass.floater, walls, turn);
                    System.out.println("FLOATER");

                } else {
                    enemyclass.floater.setX(770);
                    floaterhealth = 4;
                }
                if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && blobhealth == 6 && roomclass.roomnr % 5 == 0) {
                    turn++;
                    spawn(enemyclass.blob, walls, turn);
                    System.out.println("BLOB");

                } else {
                    enemyclass.blob.setX(770);
                    blobhealth = 6;
                }
                enemyclass.enemyroom++;
            } else {
                if (enemyclass.enemyroom == roomclass.roomnr && enemyclass.enemyroom != enemyclass.enemyroomdead && slimehealth != 4) {
                    slimehealth = 4;
                    spawn(enemyclass.slime, walls, turn);
                }
            }
        } else {
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
                    lightcounter = bossclass.suckattack(lightcounter, bossclass.boss);
                    health -= 5;
                    bossclass.boss.setImage(bossclass.bossimg);
                    charge = 0;
                    cancelsuck = false;
                } else if (cancelsuck) {
                    charge = 0;
                }
            }
            if (fieldn.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("i") ||
                    fieldo.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("l") ||
                    fields.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("k") ||
                    fieldw.getImage().equals(attackableimg) && keyEvent.getCharacter().equals("j")) {
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
                chest.setX(770);
                turn++;
                spawn(chest, walls, turn);
                chestgenerated = true;
                chestopened = false;
                roomclass.newroom = false;
            }


            System.out.println("BOSS:  " + bossclass.boss.getX() + "    " + bossclass.boss.getY());
            System.out.println("HERO:  " + hero.getX() + "    " + hero.getY());
            if (bosshurt(hero, bossclass.boss)) {
                if (lightcounter <= 10) {
                    health = enemyclass.hurt(healthbar, health, 10);
                } else {
                    health = enemyclass.hurt(healthbar, health, 5);
                }
            }

            bossclass.updatehealthbar(bossclass.bosshealth);

        }


        if (roomclass.roomnr != 1 && roomclass.newroom) {
            chest.setX(770);
            turn++;
            spawn(chest, walls, turn);
            chestgenerated = true;
            chestopened = false;
            roomclass.newroom = false;

            System.out.println(chest.getX() + "CHEST" + chest.getY());
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


        System.out.println("Enemy X: " + enemyclass.slime.getX());
        System.out.println("Enemy Y: " + enemyclass.slime.getY());
        System.out.println("Enemy F X: " + enemyclass.floater.getX());
        System.out.println("Enemy F Y: " + enemyclass.floater.getY());
        System.out.println("Enemy B X: " + enemyclass.blob.getX());
        System.out.println("Enemy B Y: " + enemyclass.blob.getY());


        if (lightcounter >= 50) {
            lightup(hero.getX(), hero.getY(), 4);
            lightmeter.setImage(light4);
            if (lightcounter != 0) {

                if (fear < 80) {
                    fear += 2;
                }
            }
        }
        if (lightcounter < 50 && lightcounter > 20) {
            lightup(hero.getX(), hero.getY(), 3);
            lightmeter.setImage(light3);
            if (lightcounter != 0) {

                if (fear < 80) {
                    fear++;
                }
            }
        }
        if (lightcounter <= 20 && lightcounter > 10) {
            lightup(hero.getX(), hero.getY(), 2);
            lightmeter.setImage(light2);
            if (lightcounter != 0) {

                if (fear < 80) {
                    fear++;
                }
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
                System.out.println(Arrays.toString(wallcollision(walls, enemyclass.blob)));
                enemyclass.enemymove(hero, enemyclass.blob, background, wallcollision(walls, enemyclass.blob));

            }

        }

        if (enemyclass.slime.getX() == hero.getX() && enemyclass.slime.getY() == hero.getY()) {
            health = enemyclass.hurt(healthbar, health, 1);
            System.out.println(health);
        }
        if (enemyclass.floater.getX() == hero.getX() && enemyclass.floater.getY() == hero.getY()) {
            health = enemyclass.hurt(healthbar, health, 5);
            System.out.println(health);
        }

        if (enemyclass.blob.getX() == hero.getX() && enemyclass.blob.getY() == hero.getY()) {
            health = enemyclass.hurt(healthbar, health, 10);
            System.out.println(health);
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

        if (health <= 0) {
            healthbar.setProgress(2 / 100);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameOver.fxml"));

            Parent GO = null;
            GO = (Parent) fxmlLoader.load();
            GO.getStylesheets().addAll(this.getClass().getResource("styles.css").toExternalForm());
            Stage stage = new Stage();
            stage.setTitle("Game Over");
            stage.getIcons().add(new Image("image/Skull.png"));
            stage.setScene(new Scene(GO));
            Stage gamestage = (Stage) hero.getScene().getWindow();

            stage.show();
            gamestage.close();
            background.getChildren().clear();
            background.getChildren().remove(healthbar);

        }
        if (fear <= 10) {
            if (fearturn % 3 == 0) {


                ImageView fearenemy = new ImageView();
                background.getChildren().add(fearenemy);

                fearenemy.setImage(enemyindarkimg);
                fearenemy.setFitHeight(64.0);
                fearenemy.setFitWidth(64.0);
                spawn(fearenemy, walls, turn);
                fearenemy.toFront();
                System.out.println("FEAR ENEMY SPAWNED" + fearenemy.getX() + fearenemy.getY());
                fearenemylist.add(fearenemy);
                fearturn++;


            } else {
                fearturn++;
            }
        }
        if (lightcounter > 0 && fearenemylist.size() > 0) {

            if (l < fearenemylist.size()) {
                fearenemylist.get(l).setVisible(false);
                background.getChildren().remove(fearenemylist.get(l));
                l++;
                System.out.println("ENEMY REMOVED!!!!!");
            }
        }

        if (keyEvent.getCharacter().equals("P")) {
            roomclass.roomnr = 48;
        }

        //INSERT ROOM NR AIKA

        nrdec.setImage(Roomimgs.get((roomclass.roomnr - roomclass.roomnr % 10) / 10));
        nrzif.setImage(Roomimgs.get(roomclass.roomnr % 10));
        System.out.println((roomclass.roomnr - (roomclass.roomnr % 10)) / 10);
        System.out.println(roomclass.roomnr % 10);


        for (int slotcount = 0; slotcount < freeslots.length; slotcount++) {
            if (freeslots[slotcount]) {
                potionslots[slotcount] = false;
            } else if (potionslots[slotcount]) {
                freeslots[slotcount] = false;
            }
            System.out.println(freeslots[slotcount] + " " + potionslots[slotcount]);
        }

        turn++;
        System.out.println(turn);
        healthbar.setProgress(health / 100);
    }

    public void fearmetercheck(int fear) {
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

    public boolean bosshurt(ImageView hero, ImageView boss) {
        return (hero.getX() == bossclass.boss.getX() && hero.getY() == bossclass.boss.getY()) ||
                (hero.getX() == bossclass.boss.getX() + 64 && hero.getY() == bossclass.boss.getY()) ||
                (hero.getX() == bossclass.boss.getX() && hero.getY() == bossclass.boss.getY() + 64) ||
                (hero.getX() == bossclass.boss.getX() + 64 && hero.getY() == bossclass.boss.getY() + 64);

    }

    public void openChest(double x, double y, double cx, double cy, ImageView slot, boolean potion) {
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
                        System.out.println("MONSTER IN N");
                    } else {
                        fieldn.setImage(imageavailable);
                        System.out.println("SET AVAILABLE N");
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
                        System.out.println("MONSTER IN W");
                    } else {
                        fieldw.setImage(imageavailable);
                        System.out.println("SET AVAILABLE W");
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
                        System.out.println("MONSTER IN S");
                    } else {
                        fields.setImage(imageavailable);
                        System.out.println("SET AVAILABLE S");
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
                        System.out.println("MONSTER IN O");
                    } else {
                        fieldo.setImage(imageavailable);
                        System.out.println("SET AVAILABLE O");
                    }
                }
            }
        }

    }


    public void predfieldsboss(int[] available, ImageView boss) {

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
                            System.out.println("MONSTER IN N");
                        } else {
                            fieldn.setImage(imageavailable);
                            System.out.println("SET AVAILABLE N");
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
                            System.out.println("MONSTER IN W");
                        } else {
                            fieldw.setImage(imageavailable);
                            System.out.println("SET AVAILABLE W");
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
                            System.out.println("MONSTER IN S");
                        } else {
                            fields.setImage(imageavailable);
                            System.out.println("SET AVAILABLE S");
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
                            System.out.println("MONSTER IN O");
                        } else {
                            fieldo.setImage(imageavailable);
                            System.out.println("SET AVAILABLE O");
                        }
                    }
                }
            }
        }
    }


    public int[] wallcollision(ArrayList<ImageView> wall, ImageView hero) {

        int[] availablemovement = new int[4];
        int[] walltot = new int[4];
        walltot[0] = 1;
        walltot[1] = 1;
        walltot[2] = 1;
        walltot[3] = 1;
        for (int i = 0; i < wall.size(); i++) {
            if (walltot[0] != 0) {
                if (hero.getY() != wall.get(i).getY() + 64 || hero.getX() != wall.get(i).getX()) {
                    availablemovement[0] = 1;

                } else {
                    availablemovement[0] = 0;
                    walltot[0] = 0;
                }
            }

            if (walltot[1] != 0) {
                if (hero.getY() != wall.get(i).getY() || hero.getX() != wall.get(i).getX() + 64) {
                    availablemovement[1] = 2;

                } else {
                    availablemovement[1] = 0;
                    walltot[1] = 0;
                }
            }

            if (walltot[2] != 0) {
                if (hero.getY() + 64 != wall.get(i).getY() || hero.getX() != wall.get(i).getX()) {
                    availablemovement[2] = 3;

                } else {
                    availablemovement[2] = 0;
                    walltot[2] = 0;
                }
            }
            if (walltot[3] != 0) {
                if (hero.getY() != wall.get(i).getY() || hero.getX() != wall.get(i).getX() - 64) {
                    availablemovement[3] = 4;
                } else {
                    availablemovement[3] = 0;
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
                        darkness.get(i).setOpacity(0.8);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.7);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.5);
                    }


                }

                break;
            case 2:
                for (int i = 0; i < darkness.size(); i++) {

                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.7);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.5);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.35);
                    }


                }

                break;
            case 3:
                for (int i = 0; i < darkness.size(); i++) {
                    if (herox + 256 > darkness.get(i).getX() && herox - 256 < darkness.get(i).getX() && heroy + 256 > darkness.get(i).getY() && heroy - 256 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.7);
                    }
                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.5);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.35);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.2);
                    }
                }

                break;
            case 4:
                for (int i = 0; i < darkness.size(); i++) {
                    if (herox + 320 > darkness.get(i).getX() && herox - 320 < darkness.get(i).getX() && heroy + 320 > darkness.get(i).getY() && heroy - 320 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.7);
                    }
                    if (herox + 256 > darkness.get(i).getX() && herox - 256 < darkness.get(i).getX() && heroy + 256 > darkness.get(i).getY() && heroy - 256 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.5);
                    }
                    if (herox + 192 > darkness.get(i).getX() && herox - 192 < darkness.get(i).getX() && heroy + 192 > darkness.get(i).getY() && heroy - 192 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.35);
                    }
                    if (herox + 128 > darkness.get(i).getX() && herox - 128 < darkness.get(i).getX() && heroy + 128 > darkness.get(i).getY() && heroy - 128 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.2);
                    }
                    if (herox + 64 > darkness.get(i).getX() && herox - 64 < darkness.get(i).getX() && heroy + 64 > darkness.get(i).getY() && heroy - 64 < darkness.get(i).getY()) {
                        darkness.get(i).setOpacity(0.05);
                    }
                }

                break;


        }
    }


    public void spawn(ImageView entity, ArrayList<ImageView> walls, int turn) {
        Random rand = new Random();
        System.out.println(turn + "TUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUURRRRRRRNNNNN!!!!");

        if (turn % 3 == 0) {
            for (int i = -1; i <= 7; i++) {
                int k = 0;
                entity.setY(turn % 7 * 64.0);
                for (int j = -1; j <= 7; j++) {
                    entity.setX(j * 64.0);

                    if (entity.getX() != walls.get(k).getX() && entity.getY() != walls.get(k).getY() && entity.getY() != -128 && entity.getY() != 512 && entity.getX() != -128 && entity.getX() != 512) {
                        System.out.println("NOT IN WALL NR " + k + " AT " + walls.get(k).getX() + " " + walls.get(k).getY());
                        System.out.println("ENEMY NEW X" + entity.getX() + "  ENEMY NEW Y " + entity.getY() + "FINAL!!!!");
                        int generatednumb = rand.nextInt((100 - 1) + 1) + 1;
                        if (generatednumb % 2 != 0) {
                            return;
                        } else {
                            k++;
                            i++;

                        }
                    } else {
                        System.out.println("ENEMY NEW X" + entity.getX() + "  ENEMY NEW Y " + entity.getY());
                        k++;
                        i++;
                    }

                }


            }
        } else {
            for (int i = 7; i >= -1; i--) {
                int k = 120;
                entity.setY(turn % 7 * 64.0);
                for (int j = 7; j >= -1; j--) {
                    entity.setX(j * 64.0);
                    if (entity.getX() != walls.get(k).getX() && entity.getY() != walls.get(k).getY() && entity.getY() != -128 && entity.getY() != 512 && entity.getX() != -128 && entity.getX() != 512) {
                        int generatednumb = rand.nextInt((100 - 1) + 1) + 1;
                        if (generatednumb % 2 == 0) {
                            return;
                        } else {
                            k--;

                        }
                    } else {
                        System.out.println("ENEMY NEW X" + entity.getX() + "  ENEMY NEW Y " + entity.getY());
                        k--;
                        i--;
                    }

                }


            }
        }
    }


    public void movement(int[] availablemovement, KeyEvent keyEvent) {


        if (keyEvent.getCharacter().equals("w")) {
            if (availablemovement[0] != 0) {

                hero.setY(hero.getY() - 64);
                y -= 64;

                System.out.println("up");
                System.out.println("Y: " + hero.getY());
                System.out.println("X: " + hero.getX());
                System.out.println();


                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }

            }

        }
        if (keyEvent.getCharacter().equals("a")) {
            if (availablemovement[1] != 0) {
                hero.setX(hero.getX() - 64);
                x -= 64;

                System.out.println("left");
                System.out.println("Y: " + hero.getY());
                System.out.println("X: " + hero.getX());
                System.out.println();

                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }
            }

        }
        if (keyEvent.getCharacter().equals("s")) {
            if (availablemovement[2] != 0) {
                hero.setY(hero.getY() + 64);
                y += 64;

                System.out.println("down");
                System.out.println("Y: " + hero.getY());
                System.out.println("X: " + hero.getX());
                System.out.println();

                if (lightcounter > 0) {
                    lightcounter--;
                } else {
                    if (fear != 0) {
                        fear--;
                    }
                }
            }
        }
        if (keyEvent.getCharacter().equals("d")) {
            if (availablemovement[3] != 0) {
                hero.setX(hero.getX() + 64);
                x += 64;
                System.out.println("right");
                System.out.println("Y: " + hero.getY());
                System.out.println("X: " + hero.getX());
                System.out.println();


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
