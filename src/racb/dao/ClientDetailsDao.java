package racb.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import racb.config.DBConnection;
import racb.model.ClientDetails;
import racb.service.DaoService;

public abstract class ClientDetailsDao implements DaoService<ClientDetails> {

    String sql;
    DBConnection dbc = new DBConnection();
    PreparedStatement ps;
    ResultSet rs;
    ClientDetails c;

    @Override
    public void saveData(ClientDetails e) {
        sql = "insert into clientdetails(clientId, memoId) values(?,?)";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, e.getClientId());
            ps.setLong(2, e.getMemoId());
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data is not Saved");
            Logger.getLogger(ClientDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateData(ClientDetails e) {
        sql = "update category set clientId = ?, memoId = ? where id = ?";

        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, e.getClientId());
            ps.setLong(2, e.getMemoId());
            ps.setInt(3, e.getId());
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (SQLException ex) {
            Logger.getLogger(ClientDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void delete(int id) {
        sql = "delete from clientdetails where Id = ?";
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            dbc.getConn().close();
            JOptionPane.showConfirmDialog(null, "Delete Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(ClientDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ClientDetails findDataById(int id) {
        sql = "select c.id, c.clientId, c.memoId, m.total_balance from clientdetails c"
                + " join memo m"
                + " on m.memoId = c.memoId "
                + "where id = ?";
        
        try {
            ps = dbc.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                c = new ClientDetails(rs.getInt("id"),
                        rs.getDouble("total_balance"),
                        rs.getLong("memoId")
                );

                
            }
            ps.close();
            rs.close();
            dbc.getConn().close();

        } catch (SQLException ex) {
            Logger.getLogger(ClientDetailsDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

   
}
