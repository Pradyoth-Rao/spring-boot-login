package com.SampleLogin.simplelogin;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

public interface EmpRepository extends CassandraRepository<Emp, UUID>{
	
//	@Query("select * from test01.emp where username =0?")
	public Emp findByUsername(String username);
	
	
}
