import java.util.*;
public class StudentMain01 {
	
	Map<String,StudentMain01> map=new HashMap<>();
	Set<Integer> odd=new HashSet<>();
	Set<Integer> even=new HashSet<>();
	List<String> li=new ArrayList<>();
	public static void main(String args[]) {
		StudentMain01 main=new StudentMain01();
		main.run();
	}
	
	public void run() {
		Student01 std1 = new Student01("1", 22);
		Student01 std2 = new Student01("2", 21);
		Student01 std3 = new Student01("3", 20);
		Student01 std4 = new Student01("4", 23);
		Student01 std5 = new Student01("5", 21);
		Student01 std6 = new Student01("6", 20);
		map.put("1",std1);
		map.put("2",std2);
		map.put("3",std3);
		map.put("4",std4);
		map.put("5",std5);
		map.put("6",std6);
		
		conversion(map);

	}
	public Object conversion(Map<String, Studen01> map2) {
		Set<String> keys = map2.keySet();

		
		int i;
		int hash;
		String rno;
		for(String k:keys) {
			li.add(k);
			i=map2.getAge(k);
			hash=k.hashCode();
			
			rno=k;
			checkEquals(rno);
			if(i%2==0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
			return hash;
			
		}		
		return li;
		return odd;
		return even;
	}
}


