package sample;


import javafx.scene.image.ImageView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Rooms {

    int roomnr = 1;
    boolean newroom = false;
    boolean slimeinroom = false;
    boolean floaterinroom = false;
    boolean blobinroom = false;
    private Enemy enemyclass = new Enemy();
    private String lastroom = "ST";
    private RoomList r = new RoomList();


    public void changeroom(javafx.scene.image.ImageView hero, ArrayList<javafx.scene.image.ImageView> walls, ImageView controlls) throws FileNotFoundException {


        //North to South
        if (hero.getX() == (3 * 64) && hero.getY() == (-3 * 64)) {

            hero.setY(512);
            hero.setLayoutY(0);
            changeroomfromS(walls);
            if (!lastroom.equals("N") || roomnr == 49) {
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
            if (!lastroom.equals("S") || roomnr == 49) {
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
            if (!lastroom.equals("W") || roomnr == 49) {
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
            if (!lastroom.equals("O") || roomnr == 49) {
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

    private void changeroomfromN(ArrayList<javafx.scene.image.ImageView> walls) throws FileNotFoundException {
        ArrayList<Double> roomNX;
        ArrayList<Double> roomNY;
        if (roomnr < 49) {

                    roomNX = r.setNroom(false);
                    roomNY = r.setNroom(true);
            }
         else {
            roomNX = r.setBoss(false);
            roomNY = r.setBoss(true);
        }


        activateroomchange(walls, roomNX, roomNY);


    }


    private void changeroomfromS(ArrayList<javafx.scene.image.ImageView> walls) throws FileNotFoundException {
        ArrayList<Double> roomSX;
        ArrayList<Double> roomSY;
        if (roomnr < 49) {

                    roomSX = r.setSroom(false);
                    roomSY = r.setSroom(true);

        } else {
            roomSX = r.setBoss(false);
            roomSY = r.setBoss(true);
        }

        activateroomchange(walls, roomSX, roomSY);

    }

    private void changeroomfromW(ArrayList<javafx.scene.image.ImageView> walls) throws FileNotFoundException {
        ArrayList<Double> roomWX;
        ArrayList<Double> roomWY;

        if (roomnr < 49) {


                    roomWX = r.setWroom(false);
                    roomWY = r.setWroom(true);
        } else {
            roomWX = r.setBoss(false);
            roomWY = r.setBoss(true);
        }


        activateroomchange(walls, roomWX, roomWY);
    }

    private void changeroomfromO(ArrayList<javafx.scene.image.ImageView> walls) throws FileNotFoundException {
        ArrayList<Double> roomOX;
        ArrayList<Double> roomOY;
        if (roomnr < 49) {

                        roomOX = r.setOroom(false);
                        roomOY = r.setOroom(true);
        } else {
            roomOX = r.setBoss(false);
            roomOY = r.setBoss(true);
        }


        activateroomchange(walls, roomOX, roomOY);
    }

    private void activateroomchange(ArrayList<ImageView> walls, ArrayList<Double> roomX, ArrayList<Double> roomY) {
        for (int i = 0; i < roomX.size(); i++) {
            walls.get(i).setX(roomX.get(i));
            walls.get(i).setY(roomY.get(i));
            walls.get(i).setLayoutY(128);
            walls.get(i).setLayoutX(128);
        }
    }

    public void setstartroom(ArrayList<ImageView> walls) {

        activateroomchange(walls, r.setroomstart(false), r.setroomstart(true));
    }
}



