package pane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;



public class SearchPane extends HBox {
    public SearchPane() {
        setAlignment(Pos.CENTER);
        TextField textField = new TextField();
        textField.setPromptText("Find the book");
        textField.setPrefWidth(250);

        Button btn = new Button("Search");
        btn.setBackground(new Background(new BackgroundFill(Color.DARKCYAN, null, null)));
        btn.setTextFill(Color.WHITE);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                BookListPane searchBook = BookListPane.getInstance();
                if (textField.getText().isBlank()) {

                }
            }
        });

    }
}
