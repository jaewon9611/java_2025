package repeat0313;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class User {
	private int no;
    private String name;
    private int age;
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getNo() { return no; }
    public void setNo(int no) { this.no = no; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() { return "User [name=" + name + ", no=" + no + ", age=" + age + "]"; }

    public User(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }
}

public class Repeat002 {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		users.add(new User(1,"iron" , 45));
		users.add(new User(2,"hulk" , 38));
		users.add(new User(3,"captain" , 120));
		System.out.println("======================"
				 +"\n NO	NAME	AGE"
				+"\n======================");
		Iterator<User> iter = users.iterator();
        int total = 0;
        while (iter.hasNext()) {
            User user = iter.next();
            System.out.println(user.getNo() + "\t" + user.getName() + "\t" + user.getAge());
            total += user.getAge();
        }
        double avg = total / (double) users.size();
        System.out.println("\n나이총합 : " + total);
        System.out.printf("나이평균 : %.2f\n", avg);
        
        
	}
}
/*
Q7.  ArrayList
	 * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기  
*/