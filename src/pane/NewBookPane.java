package pane;

import item.Book;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import utils.Goto;


public class NewBookPane extends GridPane {
    public NewBookPane() {
        setPadding(new Insets(12));
        setVgap(8);
        //--------------------------------------------------- 3
        TextField name = input();
        TextField author = input();
        TextField rating = input();
        TextField image = input();
        TextField description = input();

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
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                handleClick(name.getText(), author.getText(), rating.getText(), image.getText(), description.getText());
            }
        });

        // -------------------------------------------------- 6
        getColumnConstraints().add(col1);
        getColumnConstraints().add(col2);

        // -------------------------------------------------- 7-17
        add(label("Title: "), 0, 0);
        add(label("Author: "), 0, 1);
        add(label("Rating: "), 0, 2);
        add(label("Image: "), 0, 3);
        add(label("Description: "), 0, 4);

        add(name, 1, 0);
        add(author, 1, 1);
        add(rating, 1, 2);
        add(image, 1, 3);
        add(description, 1, 4);

        add(btn, 0, 5, 2, 1);

    }

    private Text label(String s) {
        Text text = new Text(s);
        text.setFont(Font.font(16));
        return text;
    }

    private TextField input() {
        TextField textField = new TextField();
        textField.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(16), null)));
        textField.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID, new CornerRadii(16), BorderWidths.DEFAULT)));
        return textField;
    }

    private void handleClick(String name, String author, String rating, String image, String description) {
        if (name.isBlank() || author.isBlank() || rating.isBlank() || image.isBlank() || description.isBlank()) {
            return;
        }
        Book book = new Book(name, author, rating, image, description);
        BookListPane.getInstance().getBooks().add(book);
        BookListPane.getInstance().setSearchedBooks(BookListPane.getInstance().getBooks());
        Goto.mainPage();
    }


}
