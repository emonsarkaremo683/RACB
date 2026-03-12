/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racb.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import racb.config.DBConnection;
import racb.model.Category;
import racb.service.DaoService;

/**
 *
 * @author Emon
 */
public abstract class CategoryDao implements DaoService<Category> {

    String sql;
    DBConnection dbc = new DBConnection();
    PreparedStatement ps;
    ResultSet rs;
    Category c;

    @Override
    public void saveData(Category e) {
        sql = "insert into category(name) values(?)";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data is not Saved");
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateData(Category e) {
        sql = "update category set name = ? where id = ?";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setString(1, e.getName());

            ps.setInt(2, e.getId());
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Category> showAllData() {
        sql = "select id, name from category ";
        List<Category> list = new ArrayList<>();
        try {
            ps = dbc.getConn().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                c = new Category();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                list.add(c);
            }
            ps.close();
            rs.close();
            dbc.getConn().close();

        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void delete(int id) {
        sql = "delete from category where Id = ?";
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showConfirmDialog(null, "Delete Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Category findDataById(int id) {
         sql = "select * from category where id = ?";
        c = new Category();
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
            }
            ps.close();
            rs.close();
            dbc.getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @Override
    public String findNameById(int id) {
        sql = "select name from category where id = ?";
        c = new Category();
        String name = "";
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {

                name = rs.getString("name");
            }
            ps.close();
            rs.close();
            dbc.getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }

    @Override
    public int findIdByName(String name) {
        sql = "select id from category where name = ?";
        c = new Category();
        int id = 0;
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {

                id = rs.getInt("id");
            }
            ps.close();
            rs.close();
            dbc.getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

}
