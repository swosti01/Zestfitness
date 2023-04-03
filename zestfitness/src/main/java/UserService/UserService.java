package UserService;

import DBConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.student;

public class UserService {

    public void insertuser(student st) {
        String query = "insert into userinfo (fullname, username,password) values(?,?,?)";
        PreparedStatement ps = new DBConnection().getStatement(query);
        try {
            ps.setString(1, st.getFullname());
            ps.setString(2, st.getUsername());
            ps.setString(3, st.getPassword());
            ps.execute();
            System.out.println("Inserted " + st.getFullname());

        } catch (SQLException e) {
            System.out.println("error" + e);
            e.printStackTrace();
        }
    }

    public boolean login(student st) throws SQLException {

        String query = "select * from userinfo where username=? and password=?";
        PreparedStatement ps = new DBConnection().getStatement(query);
        try {

            ps.setString(1, st.getUsername());
            ps.setString(2, st.getPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;

            }

        } catch (SQLException e) {
            System.out.println("eroor" + e);
            e.printStackTrace();
        }
        return false;

    }

    public static void main(String[] args) {
        UserService us = new UserService();
        student st = new student();
        st.setFullname("");
        st.setUsername("");
        st.setPassword("");
        us.insertuser(st);
    }
}
