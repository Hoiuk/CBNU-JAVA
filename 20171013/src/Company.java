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
		
		result += "사번 : "+empNo + "\n";
		result += "이름 : "+name + "\n";
		result += "부서 : "+part + "\n";
		
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
		result += "직책 : " +position + "\n";
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
			System.out.print("사번 입력(예)A1010 : ");
			empNo = in.readLine();
			System.out.print("이름 입력(예)박문석 : ");
			name = in.readLine();
			System.out.print("부서 입력(예)기획 : ");
			part = in.readLine();
			System.out.print("직책 입력(예)사원-1, 대리-2, 과정-3 : ");
			position = in.readLine();
		}catch(Exception e) {
			System.out.println("입력 오류");
		}
		
		if(position.equals("1")) {
			emp = new Employee(empNo, name, part);
			result += emp.resultStr();
		}
		else {
			position = (position.equals("2"))?"대리" : "과장";
			mng = new Manager(empNo, name, part, position);
			result += mng.resultStr() + mng.addStr();
		}
		
		System.out.println(result);

	}

}
