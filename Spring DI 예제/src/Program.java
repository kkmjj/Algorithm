

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.INlineNewlecExam;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
//		Exam exam = new NewlecExam();
////		ExamConsole console = new INlineNewlecExam(exam); // DI�� ������ ���� �ϴ� �� 
//        ExamConsole console = new GridExamConsole(exam);
//		
//		console.setExam(exam);
//
		// ���� ������ ���ü��� �ۼ� -> xml ���� �ȿ� �� ����� ���´�. 
		
		ApplicationContext context = new ClassPathXmlAppicationContext("setting.xml");
		ExamConsole console = ? ;			// ������ �̿� 
		
		
		console.print();
		
		
		
		
	}

}
