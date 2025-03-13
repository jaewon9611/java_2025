package repeat0313;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class UserInfo {
	private int no;
	private String name;
	private int age;
	public UserInfo() { super();}
	public UserInfo(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class Repeat004 {
	public static void main(String[] args) {
		HashMap<Integer,UserInfo> users = new HashMap<>();
		
		users.put(1,new UserInfo(1,"iron" , 45));
		users.put(2,new UserInfo(2,"hulk" , 38));
		users.put(3,new UserInfo(3,"captain" , 120));
		System.out.println("======================"
				 +"\n NO	NAME	AGE"
				+"\n======================");		
		//System.out.println(users.entrySet());
		Iterator<UserInfo> iter = users.values().iterator();
	       int total = 0;
	       while (iter.hasNext()) {
	           UserInfo user = iter.next();
	           System.out.println(user.getNo() + "\t" + user.getName() + "\t" + user.getAge());
	           total += user.getAge();
	       }
	       double avg = total / (double) users.size();
	       System.out.println("\n나이총합 : " + total);
	       System.out.printf("나이평균 : %.2f\n", avg);
	}
}
