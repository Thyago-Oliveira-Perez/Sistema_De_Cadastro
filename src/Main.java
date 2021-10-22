import View.MenuView;

import java.awt.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        MenuView menu = new MenuView();

        menu.mostrarMenu();
    }
}