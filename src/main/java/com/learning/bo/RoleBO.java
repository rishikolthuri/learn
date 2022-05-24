package com.learning.bo;

import java.sql.SQLException;

import com.learning.dto.Role;

public class RoleBO {
	public boolean update(Role role) throws ClassNotFoundException, SQLException {
		RoleDAO roledao = new RoleDAO();
		return roledao.update(role);

	}

	public boolean delete(String id) throws ClassNotFoundException, SQLException {
		RoleDAO roledao = new RoleDAO();
		return roledao.delete(id);
	}

	public Role get(String id) throws ClassNotFoundException, SQLException {
		RoleDAO roledao = new RoleDAO();
		return roledao.getRole(id);

	}

	public List<Role> getRoles() throws ClassNotFoundException, SQLException {
		RoleDAO roledao = new RoleDAO();
		return roledao.getRoles();

	}

	public boolean add(Role role) throws ClassNotFoundException, SQLException {
		RoleDAO roledao = new RoleDAO();
		return roledao.add(role);

	}

	public boolean deleteAll() throws ClassNotFoundException, SQLException {
		RoleDAO roledao = new RoleDAO();
		return roledao.deleteAll();

	}
}
