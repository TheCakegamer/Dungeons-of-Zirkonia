package sample;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Random;

public class Rooms {

    int roomnr = 1;
    boolean newroom = false;

    Enemy enemyclass = new Enemy();
    boolean slimeinroom = false;
    boolean floaterinroom = false;
    boolean blobinroom = false;
    String lastroom = "ST";
    RoomList r = new RoomList();


    public void changeroom(javafx.scene.image.ImageView hero, ArrayList<javafx.scene.image.ImageView> walls, Pane background, ImageView controlls) {


        //North to South
        if (hero.getX() == (3 * 64) && hero.getY() == (-3 * 64)) {

            hero.setY(512);
            hero.setLayoutY(0);
            changeroomfromS(walls);
            if (!lastroom.equals("N")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr - 1;
            enemyclass.enemyroomdead = roomnr;
           /* if(roomnr == enemyclass.enemyroom){
                enemyclass.slime.setX(320);
            }
            background.getChildren().remove(enemyclass.slime);*/

            slimeinroom = true;
            floaterinroom = true;
            blobinroom = true;
            newroom = true;
            lastroom = "S";


        }
        //South to North
        else if (hero.getX() == (3 * 64) && hero.getY() == (9 * 64)) {


            hero.setY(-128);
            hero.setLayoutY(0);
            changeroomfromN(walls);
            controlls.setX(200000);
            enemyclass.slime.setX(770);
            if (!lastroom.equals("S")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr - 1;
            enemyclass.enemyroomdead = roomnr;
            newroom = true;
            slimeinroom = true;
            floaterinroom = true;
            blobinroom = true;
            lastroom = "N";
        }
        //West to East
        else if (hero.getX() == (-3 * 64) && hero.getY() == (3 * 64)) {
            hero.setX(512);
            hero.setLayoutY(0);
            changeroomfromO(walls);
            if (!lastroom.equals("W")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr - 1;
            enemyclass.enemyroomdead = roomnr;
            newroom = true;
            slimeinroom = true;
            floaterinroom = true;
            blobinroom = true;
            lastroom = "O";
        }
        //East to West
        else if (hero.getX() == (9 * 64) && hero.getY() == (3 * 64)) {
            hero.setX(-128);
            hero.setLayoutY(0);
            changeroomfromW(walls);
            if (!lastroom.equals("O")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr - 1;
            enemyclass.enemyroomdead = roomnr;
            newroom = true;
            slimeinroom = true;
            floaterinroom = true;
            blobinroom = true;
            lastroom = "W";

        }
    }

    private void changeroomfromN(ArrayList<javafx.scene.image.ImageView> walls) {
        Random rand = new Random();
        int generate = rand.nextInt((15 - 1) + 1) + 1;
        ArrayList<Double> roomNX;
        ArrayList<Double> roomNY;
        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomNX = r.setroomNO(false);
                    roomNY = r.setroomNO(true);
                    break;
                case 2:
                    roomNX = r.setroomNW(false);
                    roomNY = r.setroomNW(true);
                    break;
                case 3:
                    roomNX = r.setroomNOS(false);
                    roomNY = r.setroomNOS(true);
                    break;
                case 4:
                    roomNX = r.setroomNOS2(false);
                    roomNY = r.setroomNOS2(true);
                    break;
                case 5:
                    roomNX = r.setroomNOW(false);
                    roomNY = r.setroomNOW(true);
                    break;
                case 6:
                    roomNX = r.setroomNOSW(false);
                    roomNY = r.setroomNOSW(true);
                    break;
                case 7:
                    roomNX = r.setroomNOSW2(false);
                    roomNY = r.setroomNOSW2(true);
                    break;
                case 8:
                    roomNX = r.setroomNOSW3(false);
                    roomNY = r.setroomNOSW3(true);
                    break;
                case 9:
                    roomNX = r.setroomNOSW4(false);
                    roomNY = r.setroomNOSW4(true);
                    break;
                case 10:
                    roomNX = r.setroomNOSW5(false);
                    roomNY = r.setroomNOSW5(true);
                    break;
                case 11:
                    roomNX = r.setroomNO2(false);
                    roomNY = r.setroomNO2(true);
                    break;
                case 12:
                    roomNX = r.setroomNS(false);
                    roomNY = r.setroomNS(true);
                    break;
                case 13:
                    roomNX = r.setroomNOS3(false);
                    roomNY = r.setroomNOS3(true);
                    break;
                case 14:
                    roomNX = r.setroomNOW2(false);
                    roomNY = r.setroomNOW2(true);
                    break;
                case 15:
                    roomNX = r.setroomNOW2(false);
                    roomNY = r.setroomNOW2(true);
                    break;
                default:
                    roomNX = r.setroomNSW2(false);
                    roomNY = r.setroomNSW2(true);
                    break;
            }
        } else {
            roomNX = r.setBoss(false);
            roomNY = r.setBoss(true);
        }


        activateroomchange(walls, roomNX, roomNY);


    }



    private void changeroomfromS(ArrayList<javafx.scene.image.ImageView> walls) {
        Random rand = new Random();
        int generate = rand.nextInt((13 - 1) + 1) + 1;
        ArrayList<Double> roomSX;
        ArrayList<Double> roomSY;
        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomSX = r.setroomOSW(false);
                    roomSY = r.setroomOSW(true);
                    break;
                case 2:
                    roomSX = r.setroomNOS(false);
                    roomSY = r.setroomNOS(true);
                    break;
                case 3:
                    roomSX = r.setroomNsw(false);
                    roomSY = r.setroomNsw(true);
                    break;
                case 4:
                    roomSX = r.setroomNOS2(false);
                    roomSY = r.setroomNOS2(true);
                    break;
                case 5:
                    roomSX = r.setroomNOSW(false);
                    roomSY = r.setroomNOSW(true);
                    break;
                case 6:
                    roomSX = r.setroomNOSW2(false);
                    roomSY = r.setroomNOSW2(true);
                    break;
                case 7:
                    roomSX = r.setroomNOSW3(false);
                    roomSY = r.setroomNOSW3(true);
                    break;
                case 8:
                    roomSX = r.setroomNOSW4(false);
                    roomSY = r.setroomNOSW4(true);
                    break;
                case 9:
                    roomSX = r.setroomNOSW5(false);
                    roomSY = r.setroomNOSW5(true);
                    break;
                case 10:
                    roomSX = r.setroomNS(false);
                    roomSY = r.setroomNS(true);
                    break;
                case 11:
                    roomSX = r.setroomNOS3(false);
                    roomSY = r.setroomNOS3(true);
                    break;
                case 12:
                    roomSX = r.setroomOSW2(false);
                    roomSY = r.setroomOSW2(true);
                    break;
                case 13:
                    roomSX = r.setroomNSW2(false);
                    roomSY = r.setroomNSW2(true);
                    break;

                default:
                    roomSX = r.setroomOSW(false);
                    roomSY = r.setroomOSW(true);
                    break;
            }
        } else {
            roomSX = r.setBoss(false);
            roomSY = r.setBoss(true);
        }

        activateroomchange(walls, roomSX, roomSY);

    }

    private void changeroomfromW(ArrayList<javafx.scene.image.ImageView> walls) {
        Random rand = new Random();
        int generate = rand.nextInt((16 - 1) + 1) + 1;
        ArrayList<Double> roomWX;
        ArrayList<Double> roomWY;

        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomWX = r.setroomNW(false);
                    roomWY = r.setroomNW(true);
                    break;
                case 2:
                    roomWX = r.setroomNsw(false);
                    roomWY = r.setroomNsw(true);
                    break;
                case 3:
                    roomWX = r.setroomOW(false);
                    roomWY = r.setroomOW(true);
                    break;
                case 4:
                    roomWX = r.setroomNOW(false);
                    roomWY = r.setroomNOW(true);
                    break;
                case 5:
                    roomWX = r.setroomOSW(false);
                    roomWY = r.setroomOSW(true);
                    break;
                case 6:
                    roomWX = r.setroomNOSW(false);
                    roomWY = r.setroomNOSW(true);
                    break;
                case 7:
                    roomWX = r.setroomNOSW2(false);
                    roomWY = r.setroomNOSW2(true);
                    break;
                case 8:
                    roomWX = r.setroomNOSW3(false);
                    roomWY = r.setroomNOSW3(true);
                    break;
                case 9:
                    roomWX = r.setroomNOSW4(false);
                    roomWY = r.setroomNOSW4(true);
                    break;
                case 10:
                    roomWX = r.setroomNOSW5(false);
                    roomWY = r.setroomNOSW5(true);
                    break;
                case 11:
                    roomWX = r.setroomOSW2(false);
                    roomWY = r.setroomOSW2(true);
                    break;
                case 12:
                    roomWX = r.setroomNOW2(false);
                    roomWY = r.setroomNOW2(true);
                    break;
                case 13:
                    roomWX = r.setroomOW2(false);
                    roomWY = r.setroomOW2(true);
                    break;
                case 14:
                    roomWX = r.setroomOW3(false);
                    roomWY = r.setroomOW3(true);
                    break;
                case 15:
                    roomWX = r.setroomOW4(false);
                    roomWY = r.setroomOW4(true);
                    break;
                case 16:
                    roomWX = r.setroomNSW2(false);
                    roomWY = r.setroomNSW2(true);
                    break;

                default:
                    roomWX = r.setroomNsw(false);
                    roomWY = r.setroomNsw(true);
                    break;
            }
        } else {
            roomWX = r.setBoss(false);
            roomWY = r.setBoss(true);
        }


        activateroomchange(walls, roomWX, roomWY);
    }

    private void changeroomfromO(ArrayList<javafx.scene.image.ImageView> walls) {
        Random rand = new Random();
        int generate = rand.nextInt((18 - 1) + 1) + 1;
        ArrayList<Double> roomOX;
        ArrayList<Double> roomOY;
        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomOX = r.setroomNOS(false);
                    roomOY = r.setroomNOS(true);
                    break;
                case 2:
                    roomOX = r.setroomNO(false);
                    roomOY = r.setroomNO(true);
                    break;
                case 3:
                    roomOX = r.setroomOW(false);
                    roomOY = r.setroomOW(true);
                    break;
                case 4:
                    roomOX = r.setroomNOS2(false);
                    roomOY = r.setroomNOS2(true);
                    break;
                case 5:
                    roomOX = r.setroomNOW(false);
                    roomOY = r.setroomNOW(true);
                    break;
                case 6:
                    roomOX = r.setroomOSW(false);
                    roomOY = r.setroomOSW(true);
                    break;
                case 7:
                    roomOX = r.setroomNOSW(false);
                    roomOY = r.setroomNOSW(true);
                    break;
                case 8:
                    roomOX = r.setroomNOSW2(false);
                    roomOY = r.setroomNOSW2(true);
                    break;
                case 9:
                    roomOX = r.setroomNOSW3(false);
                    roomOY = r.setroomNOSW3(true);
                    break;
                case 10:
                    roomOX = r.setroomNOSW4(false);
                    roomOY = r.setroomNOSW4(true);
                    break;
                case 11:
                    roomOX = r.setroomNOSW5(false);
                    roomOY = r.setroomNOSW5(true);
                    break;
                case 12:
                    roomOX = r.setroomNO2(false);
                    roomOY = r.setroomNO2(true);
                    break;
                case 13:
                    roomOX = r.setroomOSW2(false);
                    roomOY = r.setroomOSW2(true);
                    break;
                case 14:
                    roomOX = r.setroomNOW2(false);
                    roomOY = r.setroomNOW2(true);
                    break;
                case 15:
                    roomOX = r.setroomNOS3(false);
                    roomOY = r.setroomNOS3(true);
                    break;
                case 16:
                    roomOX = r.setroomOW2(false);
                    roomOY = r.setroomOW2(true);
                    break;
                case 17:
                    roomOX = r.setroomOW3(false);
                    roomOY = r.setroomOW3(true);
                    break;
                case 18:
                    roomOX = r.setroomOW4(false);
                    roomOY = r.setroomOW4(true);
                    break;
                default:
                    roomOX = r.setroomNOS(false);
                    roomOY = r.setroomNOS(true);
                    break;
            }
        } else {
            roomOX = r.setBoss(false);
            roomOY = r.setBoss(true);
        }


        activateroomchange(walls, roomOX, roomOY);
    }

    public void activateroomchange(ArrayList<ImageView> walls, ArrayList<Double> roomX, ArrayList<Double> roomY) {
        for (int i = 0; i < roomX.size(); i++) {
            walls.get(i).setX(roomX.get(i));
            walls.get(i).setY(roomY.get(i));
            walls.get(i).setLayoutY(128);
            walls.get(i).setLayoutX(128);
        }
    }

    public void setstartroom(ArrayList<ImageView> walls){

        activateroomchange(walls,r.setroomstart(false),r.setroomstart(true));
    }
}



