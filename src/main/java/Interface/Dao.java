package Interface;

import java.sql.SQLException;
import java.util.List;

public interface Dao<Item, String> {

    Item findOneByTitle(String title) throws SQLException, ClassNotFoundException;
    Item findOneByAuthor(String author) throws SQLException, ClassNotFoundException;
    List<Item> findAll() throws SQLException, ClassNotFoundException;
    boolean delete(String title) throws SQLException, ClassNotFoundException;
    boolean save(String title, String author, String url, String isbn, String type, String description) throws SQLException, ClassNotFoundException;
}