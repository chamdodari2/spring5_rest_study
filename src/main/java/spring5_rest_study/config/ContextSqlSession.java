package spring5_rest_study.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan("spring5_rest_study.config.mapper")  //매퍼  //
public class ContextSqlSession { 
	@Autowired
	ApplicationContext applicationContext;

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setConfigLocation(applicationContext.getResource("classpath:/mybatis-config.xml"));
	//	factoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/*Mapper.xml"));// 모든것에 mapper로 끝나는
		return factoryBean;
	}

	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}