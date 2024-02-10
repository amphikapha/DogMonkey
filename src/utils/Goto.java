package utils;

import item.Book;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import pane.BookListPane;
import pane.NewBookPane;
import pane.RootPane;
import pane.SearchPane;


public class Goto {
    private static RootPane rootPane;
    public static void setRootPane(RootPane rootPane) {
        Goto.rootPane = rootPane;
    }

    public static void clear() {
        if (rootPane.getChildren().size() > 1) {
            rootPane.getChildren().remove(1, rootPane.getChildren().size());
        }
    }

    public static void mainPage() {
        clear();
        ScrollPane scrollPane = new ScrollPane(BookListPane.getInstance());
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        rootPane.getChildren().addAll(new SearchPane(), scrollPane);
    }

    public static Button backToMainPageButton() {
        Button btn = new Button("Back");
        btn.setBorder(new Border(new BorderStroke(Color.DARKCYAN, BorderStrokeStyle.SOLID,null,new BorderWidths(2))));
        btn.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        btn.setTextFill(Color.DARKCYAN);
        btn.setPrefWidth(300);

        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.mainPage();
            }
        });

        return btn;
    }

    public static void bookPage(Book book) {
        clear();

        Text name = GetDisplay.name(book, 28,336,TextAlignment.CENTER);

        Text author = GetDisplay.author(book, 24, 336, TextAlignment.CENTER);
        author.setText("By " + book.getAuthor());

        ImageView iv = GetDisplay.image(book, 320);

        Text star = GetDisplay.stars(book, 24);

        Text description = GetDisplay.Description(book, 16, 336);

        rootPane.getChildren().add(backToMainPageButton());

        rootPane.getChildren().addAll(name, author, iv, star, description);
    }

    public static void addNewBookPage() {
        clear();
        rootPane.getChildren().add(backToMainPageButton());
        rootPane.getChildren().add(new NewBookPane());
    }
}
