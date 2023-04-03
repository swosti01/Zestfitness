/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserService;

import DBConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.packagemodel;

/**
 *
 * @author swost
 */
public class packageservices {

    public void insertuser(packagemodel st) {
        String query = "insert into packages (package_name, trainer_name, duration, price)" +"values(?,?,?,?)";
        PreparedStatement ps = new DBConnection().getStatement(query);
        try {
            ps.setString(1, st.getPackageName());
            ps.setString(2, st.getTrainerName());
            ps.setString(3, st.getDuration());
            ps.setString(4, st.getPrice());
            ps.execute();
            System.out.println("Inserted " + st.getPackageName());

        } catch (SQLException e) {
            System.out.println("error" + e);
//            e.printStackTrace();
        }
    }

}
