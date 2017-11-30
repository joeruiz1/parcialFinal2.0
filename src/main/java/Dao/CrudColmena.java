/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Conexion.DbUtil;
import VO.Colmena;
import VO.RegistroMiel;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando stiven
 */
public class CrudColmena {

    private Connection CONEXION;

    public CrudColmena() throws URISyntaxException {
        CONEXION = DbUtil.getConnection();
    }

    public void agregarColmena(RegistroMiel RM) {
        try {
            PreparedStatement preparedStatement = CONEXION
                    .prepareStatement("insert into RegistrarMiel(fecha,recolector,idColmena,KilosMiel) values (?, ?, ?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, RM.getFecha());
            preparedStatement.setString(2, RM.getRecolector());
            preparedStatement.setInt(3, RM.getIdColmena());
            preparedStatement.setInt(4, RM.getKilosMiel());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public List<Colmena> listarColmena() {
        List<Colmena> users = new ArrayList<Colmena>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = CONEXION.createStatement();

            ResultSet rs = statement.executeQuery("select * from Colmena");
            while (rs.next()) {
                Colmena cl = new Colmena();
               cl.setUbicacionEspa(rs.getString("ubicacionEspacial"));
               cl.setFabrica(rs.getString("fabrica"));
               cl.setColmenaHija(rs.getInt("idColmenaHija"));
               cl.setColmena(rs.getInt("idColmena"));
               
                users.add(cl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
     public List<RegistroMiel> OtroRequerimiento() {
        List<RegistroMiel> users = new ArrayList<RegistroMiel>();
        try {
            System.out.println("LLegue hasta aca olllllaaaaaa");
            Statement statement = CONEXION.createStatement();

            ResultSet rs = statement.executeQuery("select idColmena, sum(KilosMiel) as total from registrarmiel where recolector!=('pedro') group by idColmena having (total)>2 order by sum(KilosMiel)");
            while (rs.next()) {
                RegistroMiel cl = new RegistroMiel();
               cl.setIdColmena(rs.getInt("idColmena"));
               cl.setKilosMiel(rs.getInt("total"));
              
                users.add(cl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

}
