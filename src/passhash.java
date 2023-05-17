import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.security.crypto.bcrypt.BCrypt;


public class passhash {
    
    private Connection connection;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/restotracker";
    private static final String DB_USER = "tbl_user";
    private static final String DB_PASSWORD = "us_password";
    
    public static void main(String[] args) throws SQLException {
        // Generate a salt using bcrypt
        String salt = BCrypt.gensalt();
        // Hash the password with the generated salt
        String plainTextPassword = "us_password";
        String hashedPassword = BCrypt.hashpw(plainTextPassword, salt);
        // Store the salt and hashed password in the database
        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO tbl_user (us_username, salt, us_password) VALUES (?, ?, ?)");
        pstmt.setString(1, "us_username");
        pstmt.setString(2, salt);
        pstmt.setString(3, hashedPassword);
        pstmt.executeUpdate();
        
        // Retrieve the stored salt and hashed password from the database
        pstmt = con.prepareStatement("SELECT salt, us_password FROM tbl_users WHERE us_username = ?");
        pstmt.setString(1, "us_username");
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            String storedSalt = rs.getString("salt");
            String storedPassword = rs.getString("us_password");
            
            // Hash the user's entered password using the stored salt
            String enteredPassword = "us_password";
            String hashedEnteredPassword = BCrypt.hashpw(enteredPassword, storedSalt);
            
            // Compare the resulting hash to the stored hash
            if (hashedEnteredPassword.equals(storedPassword)) {
                // Passwords match, user is authenticated
                System.out.println("Authentication successful!");
            } else {
                // Passwords don't match, user is not authenticated
                System.out.println("Authentication failed!");
            }
        }
        
        // Close the database connection
        con.close();
    }
}
