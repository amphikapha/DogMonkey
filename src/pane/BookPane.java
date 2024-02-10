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

        ImageView iv = new ImageView();
        iv = GetDisplay.image(book, 160);
        GridPane.setColumnIndex(iv, 0);
        GridPane.setRowSpan(iv, 4);

        Text name = new Text();
        name = GetDisplay.name(book, 18, 250, TextAlignment.LEFT);
        GridPane.setColumnIndex(name, 1);
        GridPane.setRowIndex(name, 0);

        Text author = new Text();
        author = GetDisplay.author(book, 16, 250, TextAlignment.LEFT);
        GridPane.setColumnIndex(author, 1);
        GridPane.setRowIndex(author, 1);

        Text star = new Text();
        star = GetDisplay.stars(book, 16);
        GridPane.setColumnIndex(name, 1);
        GridPane.setRowIndex(name, 3);

        setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.bookPage(book);
            }
        });

    }
}
