package com.xworkz.growwapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.growwapp.dto.GrowwAppDTO;
import com.xworkz.growwapp.util.GrowwAppUtil;

public class GrowwAppRepositoryImpl implements GrowwAppRepository {

	GrowwAppUtil util = new GrowwAppUtil();

	public GrowwAppRepositoryImpl() {
		System.out.println("GrowwAppRepositoryImpl constructor");
	}
	@Override
	public boolean onSave(GrowwAppDTO dto) {
		System.out.println("onSave method invoked");
		try {
			getClass().forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
		}

		try {
			Connection connection = DriverManager.getConnection(util.urlName, util.userName, util.password);
			System.out.println("connection established " + connection);
			String save = "insert into groww_app values(?,?,?,?,?,?,?,?)";
			PreparedStatement s = connection.prepareStatement(save);
			System.out.println("before: " + s);
			s.setInt(1, dto.getId());
			s.setString(2, dto.getUserName());
			s.setString(3, dto.getEmailId());
			s.setLong(4, dto.getPhoneNumber());
			s.setString(5, dto.getAddress());
			s.setString(6, dto.getPanNumber());
			s.setLong(7, dto.getUniqueClientCode());
			s.setLong(8, dto.getDematAccountNumber());
			System.out.println("after: "+s);
			int rows = s.executeUpdate();
			if (rows > 0) {
				System.out.println("rows effected" + rows);
				return true;
			} else {
				System.out.println("not effected");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("invalid connected");
			e.printStackTrace();
		}
		return false;
	}
}
