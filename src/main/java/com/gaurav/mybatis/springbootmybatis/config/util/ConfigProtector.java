package com.gaurav.mybatis.springbootmybatis.config.util;


import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.stereotype.Service;

@Service
public class ConfigProtector {

	/**
	 * @param dataSourceBuilder
	 * @return
	 */
	public DataSourceBuilder populateSecrets(DataSourceBuilder dataSourceBuilder) {
		dataSourceBuilder.username("gaurav");
		dataSourceBuilder.password("admin");
		return dataSourceBuilder;
	}

}
