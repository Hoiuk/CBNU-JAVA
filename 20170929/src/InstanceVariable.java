class Student{
	int m_kor;
	int m_eng;
	int m_mat;
	
	static String g_strTeacher = "�豸";
}

public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student score =  new Student();
		
		score.m_eng = 40;
		score.m_mat = 50;
		System.out.println("���� ����  : "+score.m_kor);
		System.out.println("���� ����  : "+score.m_eng);
		System.out.println("���� ����  : "+score.m_mat);
		
		System.out.println("������ : " +score.g_strTeacher);
		Student.g_strTeacher = "���߱�";
		System.out.println("������ : " +score.g_strTeacher);
	}

}
