package com.rmicp.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDetails getUserDetailByUserName(String username) {
		User user = new User("Rohit", "Rohit Malhotra", "malhotra", true, true,
				true, true);

		List<Role> roles = new ArrayList<Role>();
		Role role = new Role();
		role.setName("ROLE_USER");
		Role role1 = new Role();
		role1.setName("ROLE_EMPLOYEE");
		Role role2 = new Role();
		role2.setName("ROLE_CUSTOMER");
		roles.add(role);
		roles.add(role1);
		roles.add(role2);
		user.setAuthorities(roles);
		return user;
	}
}
