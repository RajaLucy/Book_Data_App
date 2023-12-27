  package app.connectionPool;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class connectionFact {
    
    private static DataSource dataSource = null;

    private connectionFact() {}

    public static Connection getConnection() {
        try {
            if (dataSource == null) {
                HikariConfig config = new HikariConfig();
                config.setJdbcUrl("jdbc:mysql://localhost:3306/mysqltut");
                config.setUsername("root");
                config.setPassword("Kiran*123#");
                config.setDriverClassName("com.mysql.cj.jdbc.Driver");
                dataSource = new HikariDataSource(config);
            }
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to obtain a connection from the pool.", e);
        }
    }
}
