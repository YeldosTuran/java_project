package Database;

import Model.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudData {
    private PostgreDataBase db;
    public StudData (){
        db = new PostgreDataBase();
    };

    public boolean createSubjectRecord (Subject subject) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Student(name, attendence) VALUES (?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, subject.getName());
            st.setFloat(2, subject.getAttendence());
            st.execute();
            return true;
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
//			throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
//			e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
//				throwables.printStackTrace();
            }
        }
        return false;
    }
    public boolean getSubjects() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT name, grade FROM Subject";
            PreparedStatement st = con.prepareStatement(sql);

//			st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Subject subject = new Subject(
                        rs.getString("name"),
                        rs.getFloat("attendence"));
                return true;
            }

        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                System.out.println(throwables.getMessage());
            }
        }
        return false;
    }
}
