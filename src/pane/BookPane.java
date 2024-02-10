package pane;

import item.Book;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import utils.GetDisplay;
import utils.Goto;


public class BookPane extends GridPane {
    public BookPane(Book book) {
        setPrefWidth(428);
        setHgap(8);
        setPadding(new Insets(4));

        ImageView iv = GetDisplay.image(book, 160);
        add(iv, 0, 0, 0, 3);

        Text name = GetDisplay.name(book, 18, 250, TextAlignment.LEFT);
        add(name, 1, 0);

        Text author = GetDisplay.author(book, 16, 250, TextAlignment.LEFT);
        add(author, 1, 1);

        Text star = GetDisplay.stars(book, 16);
        add(star, 1, 3);

        setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.bookPage(book);
            }
        });

    }
}
