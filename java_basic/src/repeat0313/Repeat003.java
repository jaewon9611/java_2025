package repeat0313;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class User1 {
	private int no;
	private String name;
	private int age;
	public User1() {super();}
	public User1(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; } 
	@Override public String toString() {return "user [no=" + no + ", name=" + name + ", age=" + age + "]";}
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	@Override
	public int hashCode() {return Objects.hash(age, name, no);}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User1 other = (User1) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
}

public class Repeat003 {
	public static void main(String[] args) {
		HashSet<User1> users = new HashSet<>();
		
		users.add(new User1(1,"iron" , 45));
		users.add(new User1(2,"hulk" , 38));
		users.add(new User1(3,"captain" , 120));
		System.out.println("======================"
				 +"\n NO	NAME	AGE"
				+"\n======================");
		Iterator<User1> iter = users.iterator();
       int total = 0;
       while (iter.hasNext()) {
           User1 user = iter.next();
           System.out.println(user.getNo() + "\t" + user.getName() + "\t" + user.getAge());
           total += user.getAge();
       }
       double avg = total / (double) users.size();
       System.out.println("\n나이총합 : " + total);
       System.out.printf("나이평균 : %.2f\n", avg);
		
	}
}
