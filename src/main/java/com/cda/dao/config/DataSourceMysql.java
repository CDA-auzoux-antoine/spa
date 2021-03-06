package com.cda.dao.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSourceMysql{

	@Value("${database.mysql.url}")
	private String url;
	@Value("${database.mysql.driver}")
	private String driver;
	@Value("${database.mysql.user}")
	private String utilisateur;
	@Value("${database.mysql.password}")
	private String motDePasse;

}
