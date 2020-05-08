package AiBANK.server;

import AiBANK.dataB.User;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;

public class ServerApp {
    public static Connection connection;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/datab?useUnicode=true&serverTimezone=UTC","root", "");
            ServerSocket ss = new ServerSocket(1999);

            while(true){
                Socket s = ss.accept();
                ServerThread st = new ServerThread(s);
                st.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean registerUser(User user){
        int rows = 0;

        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (id, login, password, name, role) VALUES (null, ?, ?, ?, ?)");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, "USER");

            rows = statement.executeUpdate();
            statement.close();
        }
        catch(Exception e){e.printStackTrace();}

        if(rows == 1)
            return true;

        return false;
    }

    public static User loginUser(User user){
        User authUser = null;

        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE login = ? AND password = ?");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());

            ResultSet result = statement.executeQuery();

            if(result.next()){
                authUser = new User(
                        result.getLong("id"),
                        result.getString("login"),
                        result.getString("password"),
                        result.getString("name"),
                        result.getString("role")
                );
            }
            statement.close();
        }
        catch(Exception e){e.printStackTrace();}

        return authUser;
    }
}
