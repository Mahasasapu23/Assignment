package org.springframework.spring_context.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.spring_context.AadharCard;
import org.springframework.spring_context.Citizen;
@Configuration
@ComponentScan(basePackages="org.springframework.spring_context.config")
public class AppConfig {
	@Bean
	public AadharCard aadharcard()
	{
		return new AadharCard("67j","hyd","Telengana");
	}
	@Bean
	public Citizen citizen()
	{
		return new Citizen(101,"maha",22,aadharcard());
	}
}

