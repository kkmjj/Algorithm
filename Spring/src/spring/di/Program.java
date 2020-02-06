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
		// ���� ������ ���ü��� �ۼ� -> xml ���� �ȿ� �� ����� ���´�. 
		
		
		/*  XML ���ü�  �б� 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");*/
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		
		
		// xml���� id �� �����ͼ� ����غ���
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
