package spring.di.ui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;


@Component("console")
public class INlineNewlecExam implements ExamConsole {

	@Autowired(required = false)
	//@Qualifier("exam")
	private Exam exam;
	
	public INlineNewlecExam() {
	
	}
	
	public INlineNewlecExam(Exam exam) {
		this.exam =exam;
	}
	
	@Override
	public void print() {
			if(exam!=null) System.out.println("total is" +exam.total());
	}
	
	

	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
		
	}

}
