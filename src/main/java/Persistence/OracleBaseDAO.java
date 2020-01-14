package Persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleBaseDAO {
    private Connection myConn;

    private Properties readProperties() {
        Properties props = new Properties();
        Path myPath = Paths.get("src/main/resources/database.properties");
        try {
            BufferedReader bf = Files.newBufferedReader(myPath, StandardCharsets.UTF_8);
            props.load(bf);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return props;
    }

    protected Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        Properties properties = readProperties();

        String connectionUrl = properties.getProperty("db.url");
        String username = properties.getProperty("db.user");
        String password = properties.getProperty("db.passwd");

        Connection myConn = DriverManager.getConnection(connectionUrl, username, password);

        return myConn;
    }

    public void closeConnection() throws SQLException {
        myConn.close();
    }
}
