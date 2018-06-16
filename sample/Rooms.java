package sample;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Random;

public class Rooms{

    int roomnr = 1;
    boolean newroom = false;

    Enemy enemyclass = new Enemy();
    boolean slimeinroom = false;
    boolean floaterinroom = false;
    boolean blobinroom = false;
    String lastroom = "ST";


    public ArrayList<Double> setroomNO(boolean setY){
        ArrayList<Double> roomNOX = new ArrayList<Double>();
        ArrayList<Double> roomNOY = new ArrayList<Double>();

        int[][] roomNO ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,0,1,0,0,0,0,0,0,1},
                {1,0,0,1,0,0,0,0,0,0,1},
                {1,0,0,1,0,0,0,0,0,0,1},
                {1,0,0,1,0,0,0,0,0,0,1},
                {1,0,1,1,0,0,1,1,0,0,0},
                {1,0,1,0,0,0,0,1,0,0,1},
                {1,0,1,0,0,0,0,1,0,0,1},
                {1,0,1,0,0,0,0,1,0,0,1},
                {1,0,0,0,0,0,0,1,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };

     return buildroom(roomNOX,roomNOY,roomNO,setY);

    }

    public ArrayList<Double> setroomNsw(boolean setY){
        ArrayList<Double> roomNSWX = new ArrayList<Double>();
        ArrayList<Double> roomNSWY = new ArrayList<Double>();

        int[][] roomNSW ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,0,1},
                {1,1,0,0,0,0,1,1,1,0,1},
                {1,1,0,0,0,0,1,1,1,0,1},
                {0,0,0,0,0,0,1,1,1,0,1},
                {1,1,0,0,0,0,1,1,1,0,1},
                {1,1,0,0,0,0,1,0,0,0,1},
                {1,1,1,1,1,0,0,0,0,0,1},
                {1,1,1,1,1,0,1,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


    return buildroom(roomNSWX,roomNSWY,roomNSW,setY);
    }

    public ArrayList<Double> setroomNW(boolean setY){
        ArrayList<Double> roomNWX = new ArrayList<Double>();
        ArrayList<Double> roomNWY = new ArrayList<Double>();

        int[][] roomNW ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,0,0,0,0,1},
                {1,0,1,0,1,0,0,0,0,0,1},
                {1,0,1,0,1,0,0,0,0,0,1},
                {1,0,1,0,1,0,0,0,0,0,1},
                {0,0,1,0,1,0,0,0,0,0,1},
                {1,1,1,0,1,1,1,1,1,0,1},
                {1,1,1,0,1,0,0,0,0,0,1},
                {1,1,1,0,1,0,0,0,0,0,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(roomNWX,roomNWY,roomNW,setY);
    }

    public ArrayList<Double> setroomNOS(boolean setY){
        ArrayList<Double> roomNOSX = new ArrayList<Double>();
        ArrayList<Double> roomNOSY = new ArrayList<Double>();

        int[][] roomNOS ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,0},
                {1,0,0,0,0,0,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(roomNOSX,roomNOSY,roomNOS,setY);
    }

    public ArrayList<Double> setroomOW(boolean setY){
        ArrayList<Double> roomOWX = new ArrayList<Double>();
        ArrayList<Double> roomOWSY = new ArrayList<Double>();

        int[][] roomOW ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,1,1,0,0,0,0,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(roomOWX,roomOWSY,roomOW,setY);
    }


    public ArrayList<Double> setroomNOS2(boolean setY){
        ArrayList<Double> roomNOSX = new ArrayList<Double>();
        ArrayList<Double> roomNOSY = new ArrayList<Double>();

        int[][] roomNOS ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,1,1,1,1,1},
                {1,0,1,0,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(roomNOSX,roomNOSY,roomNOS,setY);
    }

    public ArrayList<Double> setroomNOW(boolean setY){
        ArrayList<Double> roomNOWX = new ArrayList<Double>();
        ArrayList<Double> roomNOWSY = new ArrayList<Double>();

        int[][] roomNOW ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,1,1,1,1,1},
                {1,0,1,0,1,0,1,0,0,0,1},
                {1,0,1,0,1,0,1,0,0,0,1},
                {1,0,1,0,1,0,1,0,1,0,1},
                {0,0,1,0,1,0,1,0,1,0,0},
                {1,1,1,0,0,0,1,0,1,1,1},
                {1,0,0,0,0,0,1,0,1,1,1},
                {1,0,0,0,0,0,1,0,1,1,1},
                {1,0,0,0,0,0,0,0,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(roomNOWX,roomNOWSY,roomNOW,setY);
    }

    public ArrayList<Double> setroomOSW(boolean setY){
        ArrayList<Double> roomOSWX = new ArrayList<Double>();
        ArrayList<Double> roomOSWY = new ArrayList<Double>();

        int[][] roomOSW ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,1,0,1,0,0,0,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,0,0,1,0,0,0,1,0,0,1},
                {0,0,0,1,0,0,0,1,0,0,0},
                {1,0,0,1,0,0,0,1,0,0,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,0,0,0,1,0,1,0,0,0,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(roomOSWX,roomOSWY,roomOSW,setY);
    }

    public ArrayList<Double> setBoss(boolean setY){
        ArrayList<Double> roomBossX = new ArrayList<Double>();
        ArrayList<Double> roomBossY = new ArrayList<Double>();

        int[][] roomBoss ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(roomBossX,roomBossY,roomBoss,setY);
    }


    public ArrayList<Double> buildroom(ArrayList roomX, ArrayList roomY, int[][] roomBase, boolean setY){
        int y=-2;
        for (int i = 0; i <= 10; i++) {
            int x = -2;
            for (int j = 0; j <= 10; j++) {
                if (roomBase[i][j] == 1) {
                    roomX.add(x * 64.0);
                    roomY.add(y * 64.0);
                    x++;
                } else if (roomBase[i][j] == 0) {
                    roomX.add(10 * 64.0);
                    roomY.add(y * 64.0);
                    x++;
                }
            }
            y++;
        }

        if(!setY) {
            return roomX;
        }else {
            return roomY;
        }
    }


    public void changeroom(javafx.scene.image.ImageView hero, ArrayList<javafx.scene.image.ImageView> walls, ArrayList<Double> roomORX, ArrayList<Double> roomORY, Pane background, ImageView controlls){


        //North to South
        if (hero.getX() == (3*64) && hero.getY() == (-3*64)){

            hero.setY(512);
            hero.setLayoutY(0);
            changeroomfromS(walls, roomORX,roomORY);
            if (!lastroom.equals("N")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr-1;
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
        else if (hero.getX() == (3*64) && hero.getY() == (9*64)){


            hero.setY(-128);
            hero.setLayoutY(0);
            changeroomfromN(walls);
            controlls.setX(200000);
            enemyclass.slime.setX(770);
            if (!lastroom.equals("S")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr-1;
            enemyclass.enemyroomdead = roomnr;
            newroom = true;
            slimeinroom = true;
            floaterinroom = true;
            blobinroom = true;
            lastroom = "N";
        }
        //West to East
        else if (hero.getX() == (-3*64) && hero.getY() == (3*64)){
            hero.setX(512);
            hero.setLayoutY(0);
            changeroomfromO(walls);
            if (!lastroom.equals("W")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr-1;
            enemyclass.enemyroomdead = roomnr;
            newroom = true;
            slimeinroom = true;
            floaterinroom = true;
            blobinroom = true;
            lastroom = "O";
        }
        //East to West
        else if (hero.getX() == (9*64) && hero.getY() == (3*64)){
            hero.setX(-128);
            hero.setLayoutY(0);
            changeroomfromW(walls);
            if (!lastroom.equals("O")) {
                roomnr++;
            }
            enemyclass.enemyroom = roomnr-1;
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
        int generate = rand.nextInt((5 - 1) + 1) + 1;
        ArrayList<Double> roomNX;
        ArrayList<Double> roomNY;
        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomNX = setroomNO(false);
                    roomNY = setroomNO(true);
                    break;
                case 2:
                    roomNX = setroomNW(false);
                    roomNY = setroomNW(true);
                    break;
                case 3:
                    roomNX = setroomNOS(false);
                    roomNY = setroomNOS(true);
                    break;
                case 4:
                    roomNX = setroomNOS2(false);
                    roomNY = setroomNOS2(true);
                    break;
                case 5:
                    roomNX = setroomNOW(false);
                    roomNY = setroomNOW(true);
                    break;
                default:
                    roomNX = setroomNO(false);
                    roomNY = setroomNO(true);
                    break;
            }
        } else {
            roomNX = setBoss(false);
            roomNY = setBoss(true);
        }




        for (int i = 0; i< roomNX.size(); i++){
            walls.get(i).setX(roomNX.get(i));
            walls.get(i).setY(roomNY.get(i));
            walls.get(i).setLayoutY(128);
            walls.get(i).setLayoutX(128);
        }




    }
    private void changeroomfromS(ArrayList<javafx.scene.image.ImageView> walls, ArrayList<Double> roomORX,ArrayList<Double> roomORY) {
        Random rand = new Random();
        int generate = rand.nextInt((5 - 1) + 1) + 1;
        ArrayList<Double> roomSX;
        ArrayList<Double> roomSY;
        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomSX = roomORX;
                    roomSY = roomORY;
                    break;
                case 2:
                    roomSX = setroomNOS(false);
                    roomSY = setroomNOS(true);
                    break;
                case 3:
                    roomSX = setroomNsw(false);
                    roomSY = setroomNsw(true);
                    break;
                case 4:
                    roomSX = setroomNOS2(false);
                    roomSY = setroomNOS2(true);
                    break;
                case 5:
                    roomSX = setroomOSW(false);
                    roomSY = setroomOSW(true);
                    break;
                default:
                    roomSX = roomORX;
                    roomSY = roomORY;
                    break;
            }
        }else {
            roomSX = setBoss(false);
            roomSY = setBoss(true);
        }

        for (int i = 0; i < roomSX.size(); i++) {
            walls.get(i).setX(roomSX.get(i));
            walls.get(i).setY(roomSY.get(i));
            walls.get(i).setLayoutY(128);
            walls.get(i).setLayoutX(128);
        }

    }

    private  void changeroomfromW(ArrayList<javafx.scene.image.ImageView> walls) {
        Random rand = new Random();
        int generate = rand.nextInt((5 - 1) + 1) + 1;
        ArrayList<Double> roomWX;
        ArrayList<Double> roomWY;

        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomWX = setroomNW(false);
                    roomWY = setroomNW(true);
                    break;
                case 2:
                    roomWX = setroomNsw(false);
                    roomWY = setroomNsw(true);
                    break;
                case 3:
                    roomWX = setroomOW(false);
                    roomWY = setroomOW(true);
                    break;
                case 4:
                    roomWX = setroomNOW(false);
                    roomWY = setroomNOW(true);
                    break;
                case 5:
                    roomWX = setroomOSW(false);
                    roomWY = setroomOSW(true);
                    break;

                default:
                    roomWX = setroomNsw(false);
                    roomWY = setroomNsw(true);
                    break;
            }
        }else  {
            roomWX = setBoss(false);
            roomWY = setBoss(true);
        }


        for (int i = 0; i< roomWX.size(); i++){
            walls.get(i).setX(roomWX.get(i));
            System.out.println(roomWX.get(i));
            walls.get(i).setY(roomWY.get(i));
            System.out.println(roomWY.get(i));
            walls.get(i).setLayoutY(128);
            walls.get(i).setLayoutX(128);
        }
    }

    private  void changeroomfromO(ArrayList<javafx.scene.image.ImageView> walls) {
        Random rand = new Random();
        int generate = rand.nextInt((6 - 1) + 1) + 1;
        ArrayList<Double> roomOX;
        ArrayList<Double> roomOY;
        if (roomnr < 49) {
            switch (generate) {
                case 1:
                    roomOX = setroomNOS(false);
                    roomOY = setroomNOS(true);
                    break;
                case 2:
                    roomOX = setroomNO(false);
                    roomOY = setroomNO(true);
                    break;
                case 3:
                    roomOX = setroomOW(false);
                    roomOY = setroomOW(true);
                    break;
                case 4:
                    roomOX = setroomNOS2(false);
                    roomOY = setroomNOS2(true);
                    break;
                case 5:
                    roomOX = setroomNOW(false);
                    roomOY = setroomNOW(true);
                    break;
                case 6:
                    roomOX = setroomOSW(false);
                    roomOY = setroomOSW(true);
                    break;
                default:
                    roomOX = setroomNOS(false);
                    roomOY = setroomNOS(true);
                    break;
            }
        }else {
            roomOX = setBoss(false);
            roomOY = setBoss(true);
        }


        for (int i = 0; i< roomOX.size(); i++){
            walls.get(i).setX(roomOX.get(i));
            System.out.println(roomOX.get(i));
            walls.get(i).setY(roomOY.get(i));
            System.out.println(roomOY.get(i));
            walls.get(i).setLayoutY(128);
            walls.get(i).setLayoutX(128);
        }
    }
}



