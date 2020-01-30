package spring.di.ui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class INlineNewlecExam implements ExamConsole {

	
	private Exam exam;
	
	public INlineNewlecExam() {
	
	}
	
	public INlineNewlecExam(Exam exam) {
		this.exam =exam;
	}
	
	@Override
	public void print() {
			System.out.println("total is" +exam.total());
	}
	
	
	@Autowired
	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
		
	}

}
