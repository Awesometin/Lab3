//package src;

//Austin Adams
//Lab 3
//9/12/2017

public class Person {
	static int Current_Year = 2017;
	private String name;
	private int Birth_Date;
	private int age;
	
	//constructor
	public Person(String name, int Birth_Date){
		this.name = name;
		this.Birth_Date = Birth_Date;
	}

	
	public void reset_birthday(int year){
		Birth_Date = year;
	}
	
	/*public void display_name(){
		System.out.println("This is " + name);
	}
	
	public void display_birthday(){
		System.out.printf("I was born in %d. ",Birth_Date);
	}
	public void display_age(){
		age = Current_Year - Birth_Date;
		System.out.printf("I am %d years old ",age);
		
	*/	
	//Combining all of the display methods into one saves room, and is much easier
		public void display()
		{
			System.out.println("This is " + name);
			System.out.print("I was born in ");
			System.out.println(Birth_Date);
					
			//System.out.printf("I am %d years old ",age);
			System.out.print("I am ");
			System.out.print(age);
			System.out.println(" years old");
		}
		
	//This method deals with Senority, and does not need to be a part of the display method.
		public void Senority(){
		
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display();
		John.Senority();
		
		
		
	}

}
