package part3.ex5.abst;

public class NewlecExam extends Exam {

	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	
	
	public int total() {
		return super.total()+com; //this.getKor+this.geteng
	}
	
	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return total()/4.0;
	}

	public void setCom(int com) {
		// TODO Auto-generated method stub
		this.com = com;
	}

	public String getCom() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
