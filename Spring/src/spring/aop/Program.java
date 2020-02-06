package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlecDIConfig;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		Exam proxy = (Exam)context.getBean("proxy");	// context에서 xml에서 proxy를 받아오면됨 
		System.out.println("total"+proxy.total());
		System.out.println("avg"+proxy.avg());
		
		
		
		
		
		//ApplicationContext context =  new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
//		
//		Exam exam = new NewlecExam(1,1,1,1); 
//		
//		
//	Exam proxy = (Exam)Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] {Exam.class}, 
//			
//			new InvocationHandler() {
//				
//				@Override
//				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//					
//					long start = System.currentTimeMillis();
//					
//					//
//				Object result = method.invoke(exam, args);
//					
//					long end = System.currentTimeMillis();
//					String message = (end -start)+"걸렸습니다";
//					System.out.println(message);
//					
//					
//					return result;
//				}
//			}
//			);
//			// new class[] {Exam.class} 라는 인터페이스 인데 앞에 NewlecExam 외 여러개 인터페이스에 대한 정보를 
//			// 알려주기 위해서 
			
		
		
	}

}
