

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.INlineNewlecExam;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
//		Exam exam = new NewlecExam();
////		ExamConsole console = new INlineNewlecExam(exam); // DI로 두줄을 변경 하는 법 
//        ExamConsole console = new GridExamConsole(exam);
//		
//		console.setExam(exam);
//
		// 위에 내용을 지시서에 작성 -> xml 파일 안에 다 만들어 놓는다. 
		
		ApplicationContext context = new ClassPathXmlAppicationContext("setting.xml");
		ExamConsole console = ? ;			// 스프링 이용 
		
		
		console.print();
		
		
		
		
	}

}
