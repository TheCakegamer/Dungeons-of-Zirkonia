package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class End {
    int progress = 0;
    Image ed2 = new Image(getClass().getResource("/image/Ed2.gif").toExternalForm());
    Image ed3 = new Image(getClass().getResource("/image/Ed3_1.gif").toExternalForm());
    Image ed4 = new Image(getClass().getResource("/image/Ed3_2.gif").toExternalForm());

    @FXML
    ImageView endingimg;


    public void nextimg() {
        progress++;

        switch (progress) {

            case 1:
                endingimg.setImage(ed2);
                break;
            case 2:
                endingimg.setImage(ed3);
                break;
            case 3:
                endingimg.setImage(ed4);
                break;
            case 4:
                System.exit(1);
        }

    }
}
