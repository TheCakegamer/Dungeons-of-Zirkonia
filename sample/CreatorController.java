package sample;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;


public class CreatorController {

    @FXML
    GridPane grid;
    @FXML
    Label textbox;


    int clickedX;
    int clickedY;
    int exits;
    GameOver GO = new GameOver();

    ImageView[][] walls = new ImageView[11][11];
    Image wallimg = new Image(getClass().getResource("/image/dungeonwall.png").toExternalForm());
    Image groundimg = new Image(getClass().getResource("/image/dungeonground.png").toExternalForm());


    public void initialize() {

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {


                walls[x][y] = new ImageView(wallimg);


            }
        }

        walls[5][0].setImage(groundimg);
        walls[5][10].setImage(groundimg);
        walls[0][5].setImage(groundimg);
        walls[10][5].setImage(groundimg);


        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {

                if ((x > 0 && x < 10) && (y > 0 && y < 10) || x == 5 && y == 0 || y == 10 && x == 5 || x == 0 && y == 5 || x == 10 && y == 5) {
                    walls[x][y].setImage(groundimg);
                    walls[x][y].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                        Node source = (Node) event.getSource();
                        Integer colIndex = GridPane.getColumnIndex(source);
                        Integer rowIndex = GridPane.getRowIndex(source);
                        System.out.printf("Mouse entered cell [%d, %d]%n", colIndex, rowIndex);
                        clickedX = rowIndex;
                        clickedY = colIndex;
                        if (walls[clickedY][clickedX].getImage().equals(wallimg) && event.getButton() == MouseButton.SECONDARY) {
                            walls[clickedY][clickedX].setImage(groundimg);
                        } else if( event.getButton() == MouseButton.PRIMARY) {
                            walls[clickedY][clickedX].setImage(wallimg);
                        }
                    });


                }


                grid.add(walls[x][y], x, y);
            }
        }

    }

    public void clear() {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {


                walls[y][x].setImage(groundimg);


            }
        }
        walls[5][0].setImage(groundimg);
        walls[5][10].setImage(groundimg);
        walls[0][5].setImage(groundimg);
        walls[10][5].setImage(groundimg);

    }

    public void create() throws IOException {
        int[][] wallnubs = new int[11][11];

        for (int x = 0; x < 11; x++) {
            for (int y = 0; y < 11; y++) {


                if (walls[y][x].getImage().equals(groundimg)) {
                    System.out.print("0,");
                    wallnubs[y][x] = 0;
                } else {
                    System.out.print("1,");
                    wallnubs[y][x] = 1;

                }


            }
            System.out.println();
        }


        write(generatefilename(wallnubs), wallnubs, exits);



    }

    public void exit(){
        Stage editwindow = (Stage) textbox.getScene().getWindow();
        editwindow.close();
    }

    public String generatefilename(int[][] room) {

        exits = 0;

        String roomname = "rm";
        if (room[5][0] == 0 && room[5][1] == 0) {
            roomname += "N";
            exits++;
        }
        if (room[10][5] == 0 && room[9][5] == 0) {
            roomname += "O";
            exits++;
        }
        if (room[5][10] == 0 && room[5][9] == 0) {
            roomname += "S";
            exits++;
        }
        if (room[0][5] == 0 && room[1][5] == 0) {
            roomname += "W";
            exits++;
        }


        int num = 0;
        String save = roomname + ".txt";
        File file = new File("rooms/" + save);
        while (file.exists()) {
            save = roomname + (num++) + ".txt";
            file = new File("rooms/" + save);
        }

        return save;
    }

    public void write(String filename, int[][] x, int exits) throws IOException {


        if (exits >= 2) {
            BufferedWriter outputWriter = null;
            outputWriter = new BufferedWriter(new FileWriter("rooms/" + filename + "/"));
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    // Maybe:
                    //  outputWriter.write(x[i][j] + "");
                    // Or:
                    outputWriter.write(Integer.toString(x[j][i]) + ",");

                }
                outputWriter.newLine();
            }
            textbox.setText("");
            outputWriter.flush();
            outputWriter.close();
            clear();

        } else {
            GO.oof();
            textbox.setText("Please add at least 2 Exits!");

        }
    }

    public int[][] read(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("rooms/" + filename + "/")));
        int rows = 11;
        int columns = 11;
        int[][] myArray = new int[rows][columns];
        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(",");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        return myArray;
    }
}




