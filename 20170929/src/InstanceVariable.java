class Student{
	int m_kor;
	int m_eng;
	int m_mat;
	
	static String g_strTeacher = "김구";
}

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student score =  new Student();
		
		score.m_eng = 40;
		score.m_mat = 50;
		System.out.println("국어 점수  : "+score.m_kor);
		System.out.println("영어 점수  : "+score.m_eng);
		System.out.println("수학 점수  : "+score.m_mat);
		
		System.out.println("선생님 : " +score.g_strTeacher);
		Student.g_strTeacher = "안중근";
		System.out.println("선생님 : " +score.g_strTeacher);
	}

}
