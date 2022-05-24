package com.learning.bo;

import java.sql.SQLException;

import com.learning.dto.Address;

public class AddressBO {
	public boolean update(Address address, String uname) throws ClassNotFoundException, SQLException {
		AddressDAO addressdao = new AddressDAO();
		return addressdao.update(address, uname);
	}

	public boolean delete(int userId) throws ClassNotFoundException, SQLException {
		AddressDAo addressdao = new AddressDAO();
		return addressdao.delete(userId);
	}

	public boolean get(int userId) throws ClassNotFoundException, SQLException {
		AddressDAO addressdao = new AddressDAO();
		return addressdao.getAddress(userId);
	}

	public List<Address> getAddresses() throws ClassNotFoundException, SQLException {
		AddressDAO addressdao = new AddressDAO();
		return addressdao.getAddresses();
	}

	public boolean add(Address address) throws ClassNotFoundException, SQLException {
		AddressDAO addressdao = new AddressDAO();
		return addressdao.add(address);
	}

	public boolean deleteAll() throws ClassNotFoundException, SQLException {
		AddressDAO addressdao = new AddressDAO();
		return addressdao.deleteAll();
	}

}
