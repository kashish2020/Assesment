
public class Student01 {
	
	private String rollno;
	private int age;
	public Student01(String rollno, int age) {
		this.rollno=rollno;
		this.age=age;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		int h=rollno.hashCode();
		return h;
	}
	public boolean checkequals(Object a) {
		if(a==this) {
			return true;
			
		}
		if(a==null || !(a instanceof Student01)) {
			return false;
			
		}
		Student01 st=(Student01)a;
		boolean result=this.rollno equals(st.rollno);
		return result;
		
	}

	}


