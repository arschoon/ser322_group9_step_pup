package ser322_group9_step_pup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) {
        //url = "jdbc:mysql://localhost:3306/Group9";
        //username = "root";
        //System.out.println("Please enter password:");
        //password = args[0];
        if(args.length != 3) {
            System.out.println("USAGE: ");
            System.exit(0);
        }
        try
        {
            String url = args[0];
            Connection connection = DriverManager.getConnection(url, args[1], args[2]);
            System.out.println("Connected");
        }
        catch (SQLException e)
        {
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
        
    }
    
}

