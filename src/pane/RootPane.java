package pane;

import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import utils.Goto;

import javax.swing.*;
import java.awt.*;

public class RootPane extends VBox {
    private static RootPane instance;

    private RootPane() {
        // TODO: FILL CODE HERE
        instance.setSpacing(16);
        //instance.setPadding(new Insets(32, 0, 32, 0));
        Text text = new Text("Let's Read");
        text.setFill(Color.DARKCYAN);
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 32));
        instance.getChildren().add(text);
        ///////////////////////
        Goto.setRootPane(this);
        Goto.mainPage();
    }

    public static RootPane getRootPane() {
        if (instance == null)
            instance = new RootPane();
        return instance;
    }
}
