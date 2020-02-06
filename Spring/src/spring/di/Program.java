package spring.di;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.INlineNewlecExam;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
//		Exam exam = new NewlecExam();
////		ExamConsole console = new INlineNewlecExam(exam); 
//        ExamConsole console = new GridExamConsole(exam);
//		
//		console.setExam(exam);
//
		// 위에 내용을 지시서에 작성 -> xml 파일 안에 다 만들어 놓는다. 
		
		
		/*  XML 지시서  읽기 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");*/
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		
		
		// xml에서 id 값 가져와서 사용해보기
		ExamConsole console =(ExamConsole) context.getBean("console") ;
		
		
		//ExamConsole console =context.getBean(ExamConsole.class) ;
		console.print();
		
	 //	List<Exam> exams = new ArrayList<>();
	
	//	List<Exam> exams = (List<Exam>) context.getBean("exams");
		
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams)
		//{
		//	System.out.println(e);
		//}
		
		
		
		
		
	}

}
