package spring5_rest_study.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class,ContextSqlSession.class,MvcConfig.class}) //여기에 있는 설정파일(Bean) 가져온다
@ComponentScan(basePackages = {
		
		"spring5_rest_study.mappers"
		,"spring5_rest_study.service"
		,"spring5_rest_study.controller"
		})
public class ContextRoot {

}