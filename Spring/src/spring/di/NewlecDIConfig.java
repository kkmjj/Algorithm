package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

/*<context:component-scan base-package="spring.di.ui,spring.di.entity">
 * </context:component-scan>
<!-- <bean id="exam" class="spring.di.entity.NewlecExam">*/

@ComponentScan("spring.di.ui") // @ComponentScan({"spring.di.ui","spring.di.entity"}) 
@Configuration
public class NewlecDIConfig {
	
	@Bean
	public Exam exam() {		// bean���� id ���� �޵��� �� �����ϰ� 
		
		return new NewlecExam();
	}
	

}
