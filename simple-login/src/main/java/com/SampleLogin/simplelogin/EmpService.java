package com.SampleLogin.simplelogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements UserDetailsService{
	
	@Autowired 
	private EmpRepository memberRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			Emp member = memberRepository.findByUsername(username);
			if (member == null) {
				throw new UsernameNotFoundException(username);
			}
		return new UserDetailsImpl(member);
	}

}
