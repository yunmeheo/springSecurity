package com.yunmi.security.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SecurityMember extends User{

	private static final long serialVersionUID = 1L;

	public SecurityMember(Customer c) {
		super(c.getId(), c.getPwd(), makeSecurityRole(c.getGrant()));
	}
	
	public static Collection<SimpleGrantedAuthority> makeSecurityRole(String grant) {
		Collection<SimpleGrantedAuthority> role= new ArrayList<SimpleGrantedAuthority>();
		role.add(new SimpleGrantedAuthority(grant));
		return role;
	}

}
