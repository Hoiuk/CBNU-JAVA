import java.io.BufferedReader;
import java.io.InputStreamReader;
class Employee{
	private String empNo;
	private String name;
	private String part;
	
	public Employee() {
	}
	
	public Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	public String getEmpNo() {
		return empNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPart() {
		return part;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPart(String part) {
		this.part = part;
	}
	
	public String resultStr() {
		String result ="";
		
		result += "��� : "+empNo + "\n";
		result += "�̸� : "+name + "\n";
		result += "�μ� : "+part + "\n";
		
		return result;
	}
}

class Manager extends Employee{
	private String position;
	
	public Manager(String empNo, String name, String part, String position) {
		setEmpNo(empNo);
		setName(name);
		setPart(part);
		this.position = position;
	}
	
	public String addStr() {
		String result = "";
		result += "��å : " +position + "\n";
		return result;
	}
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		Employee emp = null;
		Manager mng = null;
		String empNo = null;
		String name = null;
		String part = null;
		String position = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("��� �Է�(��)A1010 : ");
			empNo = in.readLine();
			System.out.print("�̸� �Է�(��)�ڹ��� : ");
			name = in.readLine();
			System.out.print("�μ� �Է�(��)��ȹ : ");
			part = in.readLine();
			System.out.print("��å �Է�(��)���-1, �븮-2, ����-3 : ");
			position = in.readLine();
		}catch(Exception e) {
			System.out.println("�Է� ����");
		}
		
		if(position.equals("1")) {
			emp = new Employee(empNo, name, part);
			result += emp.resultStr();
		}
		else {
			position = (position.equals("2"))?"�븮" : "����";
			mng = new Manager(empNo, name, part, position);
			result += mng.resultStr() + mng.addStr();
		}
		
		System.out.println(result);

	}

}