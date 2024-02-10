package pane;

import item.Book;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import utils.Goto;


public class NewBookPane extends GridPane {
    public NewBookPane() {
        setPadding(new Insets(12));
        setVgap(8);


        // -------------------------------------------------- 4
        ColumnConstraints col1 = new ColumnConstraints();
        ColumnConstraints col2 = new ColumnConstraints();
        col1.setPercentWidth(25);
        col1.setHalignment(HPos.RIGHT);
        col2.setPercentWidth(75);

        // -------------------------------------------------- 5
        Button btn = new Button("Add");
        btn.setMaxWidth(430);
        btn.setPrefHeight(32);
        btn.setTextFill(Color.WHITE);
        btn.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, null, null)));

        // -------------------------------------------------- 6
        getColumnConstraints().addAll(col1, col2);

        // -------------------------------------------------- 7

    }

    private Text label(String s) {
        Text text = new Text(s);
        text.setFont(Font.font(16));
        return text;
    }

    private TextField input() {
        TextField textField = new TextField();
        textField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(16), null)));
        textField.setBorder(new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, new CornerRadii(16), null)));
        return textField;
    }

    private void handleClick(String name, String author, String rating, String image, String description) {
        if (name.isBlank() || author.isBlank() || rating.isBlank() || image.isBlank() || description.isBlank()) {
            return;
        }
        Book book = new Book(name, author, rating, image, description);
        BookListPane.getInstance().getChildren().add(book);
        //TODO
        Goto.mainPage();
    }


}
