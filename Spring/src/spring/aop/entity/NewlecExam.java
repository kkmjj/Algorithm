package spring.aop.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //@Service
public class NewlecExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	
	
	public NewlecExam() {
		
	}
	
	
	
	public NewlecExam(int kor, int eng, int math, int com) {
	
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	@Override
	public int total() {
		// 개발자 관점의 AOP 에서 현재 걸리는 시간을 알아보고 싶을떄   앞 뒤에 뭔가를 작성 그것을 AOP 로 따로 구현 
		
	//	long start = System.currentTimeMillis();
		// 개발자 관점에서 현재 사용되고 있는 코드에 뭔가를 확인하려고 코드를 작성할때 aop를 통해서 따로 관리 그것을 spring으로 하면 더 쉽게 해줌
		int result =kor+eng+math+com;
		
		try {
		Thread.sleep(200);
	
		} catch (InterruptedException e) {
			
			e.printStackTrace();	
			
	}
//		
//		long end = System.currentTimeMillis();
//		
//		String message = (end -start)+"걸렸습니다";
//		System.out.println(message);
		return result;
	}

	@Override
	public float avg() {
		float result =total()/4.0f;
		return result;
	}
	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
	

}
