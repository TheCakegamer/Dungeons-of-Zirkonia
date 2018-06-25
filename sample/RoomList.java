package sample;

import java.util.ArrayList;

public class RoomList {

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

    public ArrayList<Double> setroomNOSW(boolean setY){
        ArrayList<Double> NOSWX = new ArrayList<Double>();
        ArrayList<Double> NOSWY = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,0,0,0,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,0,0,0,0,0,0,0,1,1},
                {0,0,0,0,0,0,0,0,0,0,0},
                {1,1,0,0,0,0,0,0,0,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,1,1,0,0,0,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(NOSWX,NOSWY,room,setY);
    }

    public ArrayList<Double> setroomNO2(boolean setY){
        ArrayList<Double> NOX = new ArrayList<Double>();
        ArrayList<Double> NOY = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,0,0,1,1,1,1,1},
                {1,0,1,1,1,1,1,1,1,1,1},
                {1,0,1,0,0,0,1,1,1,1,1},
                {1,0,1,0,1,0,1,1,1,1,1},
                {1,0,1,0,1,0,0,0,0,0,0},
                {1,0,1,0,1,1,1,1,1,1,1},
                {1,0,1,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,1,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(NOX,NOY,room,setY);
    }

    public ArrayList<Double> setroomNOW2(boolean setY){
        ArrayList<Double> NOWX = new ArrayList<Double>();
        ArrayList<Double> NOWY = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,0,0,0,0,1},
                {1,0,0,0,0,0,1,1,1,0,1},
                {1,0,0,0,1,0,0,1,0,0,1},
                {1,1,1,1,1,0,1,1,1,0,1},
                {0,0,0,1,1,0,0,0,0,0,0},
                {1,1,0,0,1,0,1,1,1,0,1},
                {1,1,1,0,1,0,1,1,1,0,1},
                {1,1,1,0,1,0,1,1,1,0,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(NOWX,NOWY,room,setY);
    }

    public ArrayList<Double> setroomNOSW2(boolean setY){
        ArrayList<Double> NOSWX = new ArrayList<Double>();
        ArrayList<Double> NOSWY = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,0,0,1,0,1,0,0,1,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,0,1,1,0,0,0,1,1,0,1},
                {0,0,0,0,0,0,0,0,0,0,0},
                {1,0,1,1,0,0,0,1,1,0,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,1,0,0,1,0,1,0,0,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(NOSWX,NOSWY,room,setY);
    }

    public ArrayList<Double> setroomNS(boolean setY){
        ArrayList<Double> NSX = new ArrayList<Double>();
        ArrayList<Double> NSY = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,0,0,0,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,0,0,0,0,0,0,0,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,0,0,0,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,0,0,0,0,0,0,0,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(NSX,NSY,room,setY);
    }

    public ArrayList<Double> setroomOSW2(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {0,0,1,0,0,0,0,0,0,0,0},
                {1,0,1,0,1,1,1,1,1,1,1},
                {1,0,1,0,0,0,0,0,0,1,1},
                {1,0,1,0,1,1,1,1,0,1,1},
                {1,0,0,0,1,0,0,0,0,1,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomOW2(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,1,0,0,0,0,1},
                {1,0,0,0,1,1,1,0,0,0,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,0,1,1,0,0,0,1,1,0,1},
                {0,0,0,0,0,1,0,0,0,0,0},
                {1,0,1,1,0,0,0,1,1,0,1},
                {1,0,0,1,1,0,1,1,0,0,1},
                {1,0,0,0,1,1,1,0,0,0,1},
                {1,0,0,0,0,1,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomNOSW3(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,0,1,1,0,1,1,0,1,1},
                {1,0,0,1,0,0,0,1,0,0,1},
                {0,0,0,0,0,1,0,0,0,0,0},
                {1,0,0,1,0,0,0,1,0,0,1},
                {1,1,0,1,1,0,1,1,0,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,0,0,0,0,0,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomNOSW4(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,0,0,1,1,1,1,1},
                {1,0,1,1,1,1,1,1,1,1,1},
                {1,0,1,0,0,0,0,0,0,1,1},
                {1,0,1,0,0,0,0,0,0,1,1},
                {0,0,1,0,0,0,0,0,0,0,0},
                {1,1,1,0,0,0,0,0,0,1,1},
                {1,0,0,0,0,0,0,0,0,1,1},
                {1,0,0,0,0,0,0,0,0,1,1},
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomNOS3(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,0,0,0,1,1,1,0,1},
                {1,1,0,1,1,0,0,0,1,0,1},
                {1,1,0,0,0,0,0,0,1,0,1},
                {1,0,0,0,0,0,0,0,1,0,0},
                {1,1,0,0,0,0,0,0,1,0,1},
                {1,1,0,1,1,0,0,0,1,0,1},
                {1,1,1,0,0,0,1,1,1,0,1},
                {1,1,1,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomOW3(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,1,0,0,0,0,0,0,0,1,1},
                {1,0,0,0,0,0,0,1,0,0,1},
                {1,0,1,1,0,0,1,1,0,0,1},
                {1,0,0,1,0,0,0,0,0,0,1},
                {0,0,0,0,0,0,0,0,0,0,0},
                {1,0,0,0,0,0,0,1,0,0,1},
                {1,0,0,1,1,0,0,1,1,0,1},
                {1,0,0,1,0,0,0,0,0,0,1},
                {1,1,0,0,0,0,0,0,0,1,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomOW4(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,0,0,0,0,0,1,0,1},
                {1,0,0,0,0,0,1,0,0,0,1},
                {1,0,0,1,1,0,0,0,0,0,1},
                {0,0,0,1,0,0,0,1,0,0,0},
                {1,0,0,0,0,0,1,1,0,0,1},
                {1,0,0,0,1,0,0,0,0,0,1},
                {1,0,1,0,0,0,0,0,1,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomNOSW5(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,1,0,1},
                {1,0,1,1,1,1,0,0,1,0,1},
                {1,0,0,1,0,0,0,0,0,0,1},
                {1,0,0,1,0,0,0,1,0,0,1},
                {0,0,0,1,0,1,0,1,0,0,0},
                {1,0,0,1,0,0,0,1,0,0,1},
                {1,0,0,0,0,0,0,1,0,0,1},
                {1,0,1,0,0,1,1,1,1,0,1},
                {1,0,1,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
    }

    public ArrayList<Double> setroomNSW2(boolean setY){
        ArrayList<Double> X = new ArrayList<Double>();
        ArrayList<Double> Y = new ArrayList<Double>();

        int[][] room ={
                {1,1,1,1,1,0,1,1,1,1,1},
                {1,0,0,0,1,0,1,0,0,0,1},
                {1,0,0,0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,0,0,1,0,1},
                {1,0,1,0,1,0,0,0,1,0,1},
                {0,0,0,0,1,0,0,0,0,0,1},
                {1,0,0,0,1,1,1,1,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,1},
                {1,0,1,1,1,1,1,0,1,0,1},
                {1,0,0,0,0,0,1,0,0,0,1},
                {1,1,1,1,1,0,1,1,1,1,1}

        };


        return buildroom(X,Y,room,setY);
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
}
