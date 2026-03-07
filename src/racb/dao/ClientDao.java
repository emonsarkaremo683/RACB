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
import racb.model.Client;
import racb.service.DaoService;

public abstract class ClientDao implements DaoService<Client> {

    String sql;
    DBConnection dbc = new DBConnection();
    PreparedStatement ps;
    ResultSet rs;
    Client c;

    @Override
    public void saveData(Client e) {
        sql = "insert into category(name, number, address) values(?,?,?)";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getNumber());
            ps.setString(3, e.getAddress());
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data is not Saved");
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateData(Client e) {
        sql = "update category set name = ?, number = ?, address = ? where id = ?";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getNumber());
            ps.setString(3, e.getAddress());
            ps.setInt(4, e.getId());
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Client> showAllData() {
        sql = "select c.id, c.name, c.number, c.address, cs.balance from category c"
                + " join clientdetails cs"
                + " on c.id = cs.clientId";
        List<Client> list = new ArrayList<>();
        try {
            ps = dbc.getConn().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                c = new Client(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("number"),
                        rs.getString("address"),
                        rs.getDouble("cs.balance")
                );

                list.add(c);
            }
            ps.close();
            rs.close();
            dbc.getConn().close();

        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void delete(int id) {
        sql = "delete from client where Id = ?";
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showConfirmDialog(null, "Delete Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Client findDataById(int id) {
        sql = "select * from client where id = ?";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                c = new Client(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("number"),
                        rs.getString("address")
                );
            }
            ps.close();
            rs.close();
            dbc.getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

   

}
