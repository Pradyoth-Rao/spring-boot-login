//package com.SampleLogin.simplelogin;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
//
//@Configuration
//public class CassandraConfig extends AbstractCassandraConfiguration {
// 
//    @Override
//    protected String getKeyspaceName() {
//        return "test01";
//    }
// 
//    @Bean
//    public CassandraClusterFactoryBean cluster() {
//        CassandraClusterFactoryBean cluster = 
//          new CassandraClusterFactoryBean();
//        cluster.setContactPoints("127.0.0.1");
//        cluster.setPort(9142);
//        return cluster;
//    }
// 
//    @Bean
//    public CassandraMappingContext cassandraMapping() 
//      throws ClassNotFoundException {
//        return new BasicCassandraMappingContext();
//    }
//}
