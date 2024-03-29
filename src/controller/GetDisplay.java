package controller;

import item.Book;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;



public class GetDisplay {
    public static Text Description(Book book, int fontSize, int wrappingWidth) {
        Text text = new Text(book.getDescription());
        text.setFont(Font.font(fontSize));
        text.setWrappingWidth(wrappingWidth);
        return text;
    }

    public static ImageView image(Book book, int fitHeight) {
        ImageView iv = new ImageView(book.getImage());
        iv.setPreserveRatio(true);
        iv.setFitHeight(fitHeight);

        return iv;
    }

    public static Text name(Book book, int fontSize, int wrappingWidth, TextAlignment textAlignment) {
        Text text = new Text(book.getName());
        text.setFont(Font.font(fontSize));
        text.setWrappingWidth(wrappingWidth);
        text.setTextAlignment(textAlignment);
        return text;
    }

    public static Text author(Book book, int fontSize, int wrappingWidth, TextAlignment textAlignment) {
        Text text = new Text(book.getAuthor());
        text.setFill(Color.GRAY);
        text.setFont(Font.font(fontSize));
        text.setWrappingWidth(wrappingWidth);
        text.setTextAlignment(textAlignment);
        return text;
    }

    public static Text stars(Book book, int fontSize) {
        Text star = new Text("\u2605".repeat(book.getStars()) + "\u2606".repeat(5-book.getStars()));
        star.setFill(Color.DARKRED);
        star.setFont(Font.font(fontSize));
        return star;
    }
}
