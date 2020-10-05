package com.RouletteAPI.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.RouletteAPI.dao.ClientDao;
import com.RouletteAPI.model.Client;
import com.RouletteAPI.model.ConnectionDataBase;

@Repository
public class ClientDaoImp implements ClientDao{
	
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	@Override
	public boolean saveClient(Client client) {
		boolean save = false;
		Connection connect = null;
		try {
			connect = ConnectionDataBase.getInstance().getConnection();
			if(connect!=null) {
				String query = "INSERT INTO client (firstName, lastName, document, password, money, rol_idrol) VALUES(?,?,?,?,?,?)";
				preparedStatement = connect.prepareStatement(query);
				preparedStatement.setString(1, client.getFirstName());
				preparedStatement.setString(2, client.getLastName());
				preparedStatement.setString(3, String.valueOf(client.getDocument()));
				preparedStatement.setString(4, client.getPassword());
				preparedStatement.setDouble(5, client.getMoney());
				if(client.getRoles() != null) {
					preparedStatement.setInt(6, 1);
				}else {
					preparedStatement.setInt(6, 2);
				}
				preparedStatement.executeUpdate();
				save = true;
			}else {
				System.out.println("Error en la conexion");
			}
			return save;
		} catch (Exception e) {
			System.out.println("Error en: "+e.getMessage());
			return false;
		}
	}

}
