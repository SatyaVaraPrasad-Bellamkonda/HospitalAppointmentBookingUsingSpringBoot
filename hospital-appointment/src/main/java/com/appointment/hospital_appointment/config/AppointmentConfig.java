package com.appointment.hospital_appointment.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppointmentConfig {
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
