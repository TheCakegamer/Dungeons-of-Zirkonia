package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class RoomList {

    CreatorController cc = new CreatorController();


    public ArrayList<Double> setBoss(boolean setY){
        ArrayList<Double> roomBossX = new ArrayList<>();
        ArrayList<Double> roomBossY = new ArrayList<>();

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

    public ArrayList<Double> setroomstart(boolean setY){
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();

        int[][] room ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,1,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setNroom(boolean setY) throws FileNotFoundException {
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();

        File dir = new File("rooms/");
        File[] files = dir.listFiles();
        Random rand = new Random();
        assert files != null;
        File file = files[rand.nextInt(files.length)];
        while(!file.getName().contains("N")){
            file = files[rand.nextInt(files.length)];
        }
        int[][] room = cc.read(file.getName());


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setOroom(boolean setY) throws FileNotFoundException {
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();

        File dir = new File("rooms/");
        File[] files = dir.listFiles();
        Random rand = new Random();
        assert files != null;
        File file = files[rand.nextInt(files.length)];
        while(!file.getName().contains("O")){
            file = files[rand.nextInt(files.length)];
        }
        int[][] room = cc.read(file.getName());


        return buildroom(X,Y,room,setY);
    }



    public ArrayList<Double> setSroom(boolean setY) throws FileNotFoundException {
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();

        File dir = new File("rooms/");
        File[] files = dir.listFiles();
        Random rand = new Random();
        assert files != null;
        File file = files[rand.nextInt(files.length)];
        while(!file.getName().contains("S")){
            file = files[rand.nextInt(files.length)];
        }
        int[][] room = cc.read(file.getName());


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setWroom(boolean setY) throws FileNotFoundException {
        ArrayList<Double> X = new ArrayList<>();
        ArrayList<Double> Y = new ArrayList<>();

        File dir = new File("rooms/");
        File[] files = dir.listFiles();
        Random rand = new Random();
        assert files != null;
        File file = files[rand.nextInt(files.length)];
        while(!file.getName().contains("W")){
            file = files[rand.nextInt(files.length)];
        }
        int[][] room = cc.read(file.getName());


        return buildroom(X,Y,room,setY);
    }

    private ArrayList<Double> buildroom(ArrayList<Double> roomX, ArrayList<Double> roomY, int[][] roomBase, boolean setY){
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
}
