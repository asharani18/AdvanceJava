package com.tech.utility;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

                     
@EnableWebMvc
@ComponentScan(basePackages = "com.tech")
@Configuration
public class AppConfig {

	@Bean
	public InternalResourceViewResolver irv() 
	{
		InternalResourceViewResolver  irvr = new InternalResourceViewResolver();
		irvr.setSuffix(".jsp");
		return irvr;
		
	}@Bean
	public DriverManagerDataSource dmd() {
		
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/spring01");
		dm.setUsername("root");
		dm.setPassword("root");
		
		return dm;
		
	}
	@Bean
	public LocalSessionFactoryBean sfb()
	{
		LocalSessionFactoryBean lf= new LocalSessionFactoryBean();
		lf.setDataSource(dmd());
		Properties p= new Properties();
		p.setProperty("org.hibernate.dialect.MySQL55Dialect", "hibernate.dialect");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		lf.setHibernateProperties(p);
		lf.setAnnotatedClasses(com.tech.Model.Student.class);
		
		return lf;
		
	}
}
