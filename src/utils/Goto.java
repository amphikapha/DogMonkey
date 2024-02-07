package utils;

import item.Book;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import pane.RootPane;

import java.awt.*;

public class Goto {
    private static RootPane rootPane;

    public static void setRootPane(RootPane rootPane) {
        rootPane = rootPane;
    }

    public static void clear() {
        if (rootPane.getChildren().size() > 1) {
            rootPane.getChildren().remove(1, rootPane.getChildren().size());
        }
    }

    public static void mainPage() {
        clear();
//        ScrollPane scrollPane = new ScrollPane();
//        scrollPane.
//        rootPane.getChildren().add();
    }

    public static Button backToMainPageButton() {
        Button btn = new Button("Back");
        btn.setBackground(Color.WHITE);
        return btn;
    }

    public static void bookPage(Book book) {
        clear();
        Text name = new Text();
        name = GetDisplay.name(book, 28,336,TextAlignment.CENTER);

        Text author = new Text();
        author = GetDisplay.author(book, 24, 336, TextAlignment.CENTER);
        author.setText("By " + book.getAuthor());

        Text star = new Text();
        star = GetDisplay.stars(book, 24);

        Text description = new Text();
        description = GetDisplay.Description(book, 16, 336);

        //rootPane.getChildren().add(backToMainPageButton());
    }
}
