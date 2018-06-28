package com.yunmi.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.yunmi.security.vo.Customer;
import com.yunmi.security.vo.SecurityMember;

@Service
public class CustomerDetailService implements UserDetailsService{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@SuppressWarnings("unused")
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		
		String pwd = "yunmi";
		SecurityMember s = new SecurityMember(new Customer("yunmi",passwordEncoder.encode(pwd),"ROLE_ADMIN"));
		
		if(s == null) {
			throw new UsernameNotFoundException(s.getUsername());
		}
		
		return s;
	}

}
