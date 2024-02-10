package pane;

import item.Book;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import utils.Goto;


import java.util.ArrayList;

public class BookListPane extends VBox {

    private static BookListPane instance;
    private ArrayList<Book> books;

    private BookListPane() {
        books = new ArrayList<>();
        books.add(new Book("Hairy Panner and the professor's stove", "J.K. Kidding", 2, "res/1.png", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vehicula, sem a ultricies scelerisque, eros tellus sodales sem, ut malesuada lorem leo sit amet libero. Donec vel mi posuere, rhoncus purus eget, posuere sem. Mauris vehicula tincidunt turpis, eget malesuada lectus pretium non. Aenean eu egestas erat. Aenean ex ipsum, ornare non tristique in, facilisis ac ex. Vestibulum eget elit et nunc posuere laoreet sed eget dui."));
        books.add(new Book("Hairy Panner and the Kitchen of secrets", "J.K. Kidding", 3, "res/2.png", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vehicula, sem a ultricies scelerisque, eros tellus sodales sem, ut malesuada lorem leo sit amet libero. Donec vel mi posuere, rhoncus purus eget, posuere sem. Mauris vehicula tincidunt turpis, eget malesuada lectus pretium non. Aenean eu egestas erat. Aenean ex ipsum, ornare non tristique in, facilisis ac ex. Vestibulum eget elit et nunc posuere laoreet sed eget dui."));
        books.add(new Book("Hairy Panner and the Chef of AsKarnBan", "J.K. Kidding", 1, "res/3.png", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vehicula, sem a ultricies scelerisque, eros tellus sodales sem, ut malesuada lorem leo sit amet libero. Donec vel mi posuere, rhoncus purus eget, posuere sem. Mauris vehicula tincidunt turpis, eget malesuada lectus pretium non. Aenean eu egestas erat. Aenean ex ipsum, ornare non tristique in, facilisis ac ex. Vestibulum eget elit et nunc posuere laoreet sed eget dui."));
        books.add(new Book("Mercy Johndaughter and the Cloud Thief", "Nick Nornand", 5, "res/4.png", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vehicula, sem a ultricies scelerisque, eros tellus sodales sem, ut malesuada lorem leo sit amet libero. Donec vel mi posuere, rhoncus purus eget, posuere sem. Mauris vehicula tincidunt turpis, eget malesuada lectus pretium non. Aenean eu egestas erat. Aenean ex ipsum, ornare non tristique in, facilisis ac ex. Vestibulum eget elit et nunc posuere laoreet sed eget dui."));
        books.add(new Book("Mercy Johndaughter and the Land of Heroes", "Nick Nornand", 4, "res/5.png", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vehicula, sem a ultricies scelerisque, eros tellus sodales sem, ut malesuada lorem leo sit amet libero. Donec vel mi posuere, rhoncus purus eget, posuere sem. Mauris vehicula tincidunt turpis, eget malesuada lectus pretium non. Aenean eu egestas erat. Aenean ex ipsum, ornare non tristique in, facilisis ac ex. Vestibulum eget elit et nunc posuere laoreet sed eget dui."));

        // TODO: FILL CODE HERE
        setFillWidth(true);
        setAlignment(Pos.CENTER);

    }

    public static BookListPane getInstance() {
        if (instance == null) {
            instance = new BookListPane();
        }
        return instance;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // TODO: FILL CODE HERE
    public Button newBookButton() {
        Button btn = new Button("Add New Book");
        btn.setPrefWidth(400);
        btn.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, null, null)));
        btn.setTextFill(Color.WHITE);

        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Goto.addNewBookPage();
            }
        });

        return btn;
    }

    public void setSearchedBooks(ArrayList<Book> searchedBooks) {


    }
}
