package Quiz;
import java.util.Scanner;
public class Cat {
	 
	Scanner sc = new Scanner(System.in);
	
	String color;
	int age;
	double weight;
	String gender;
	
	
	 // Create Setter Method
	  public void setColor(String color) {
		    color = sc.next();
		    this.color = color;
	  }
	  
	  public void setAge(int age) {
		age = sc.nextInt();
	    this.age = age;
	  }
	  
	  public void setWeight(double weight) {
		  weight = sc.nextDouble();
		  this.weight = weight;
	  }
	  
	  public void setGender(String gender) {
		  gender = sc.next();
		  this.gender = gender;
	  }

	  // Create Getter Method
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public Integer getAge() {
		  return this.age;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public String getGender() {
		  return this.gender;
	  }
}

