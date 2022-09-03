import java.util.*;

class ZooAnimal{
	private String Name;
	private String Type;
	private int Age;
	private boolean Hungry;
	
	public ZooAnimal() {
		String name;
		String type;
		int age;
		boolean hungry;

		Scanner nn = new Scanner(System.in);
		System.out.println("Enter Name of Animal: ");
		name = nn.nextLine();
		this.setName(name);
		
		Scanner tt = new Scanner(System.in);
		System.out.println("Enter Type of Animal: ");
		type = tt.nextLine();
		
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter Age of Animal: ");
		age = aa.nextInt();
		
		Scanner hh = new Scanner(System.in);
		System.out.println("Hungry or Not?: ");
		hungry = hh.hasNextBoolean();
		
		cage cg = new cage();
		
		if(hungry = false) {
			System.out.println("The ZooKeeper is Feeding the animal named " + name + " , a " + type + " which is " + age + " year/s old " );
			this.eat();
			System.out.println(this.hungrys(" not "));
		}
		else {
			if(age == 0) {
				System.out.println("The ZooKeeper is Feeding the animal named " + name + " , a " + type + " which is " + age + " year/s old " );
				this.sleep();
				System.out.println(this.hungrys(" actually "));
				
			}
			else {
				System.out.println("The ZooKeeper is Feeding the animal named " + name + " , a " + type + " which is " + age + " year/s old " );
				this.eat();
				System.out.println(this.hungrys(" not "));
				
			}
		}
		
		 
		
	}
	
	public ZooAnimal(String name, String type, int age, boolean hungry) {
		super();
		Name = name;
		Type = type;
		Age = age;
		Hungry = hungry;
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public boolean isHungry() {
		return Hungry;
	}

	public void setHungry(boolean hungry) {
		Hungry = hungry;
	}
	
	//methods
	public String hungrys(String gutom) {
		String text = this.getName() + " is " + gutom + "hungry"; 
		return text;
		
		}
	
	public void sleep() {
		System.out.println(this.getName() + " is Sleeping!");
	}
	
	public void eat() {
		System.out.println(this.getName() + " is Eating");
	}
		
	
}

class cage{
	private int Length;
	private int Width;
	private int Heigth;
	private boolean Clean;
	private boolean Covered;
	
	public cage() {
		int length;
		int width; 
		int heigth; 
		boolean clean; 
		boolean covered;
		
		Scanner ll = new Scanner(System.in);
		System.out.println("Enter Length: ");
		length = ll.nextInt();
		
		Scanner ww = new Scanner(System.in);
		System.out.println("Enter Width: ");
		width = ww.nextInt();
		
		Scanner hh = new Scanner(System.in);
		System.out.println("Enter Heigth: ");
		heigth = hh.nextInt();
		
		Scanner cc = new Scanner(System.in);
		System.out.println("Clean or Not?:  ");
		clean = cc.hasNextBoolean();
		
		Scanner ccov = new Scanner(System.in);
		System.out.println("Covered or Not?:  ");
		covered = ccov.hasNextBoolean();
		
		/*if(length == 15 && width == 20 && heigth == 15) {
			this.clean("not");
			if(covered = true) {
				this.covers("actually");
			}
			else {
				System.out.println(this.clean("actually"));
				if(covered = false) {
					System.out.println(this.covers("not"));
				}
			}
		}*/
		
		if(clean != false) {
			if(length == 15 && width == 20 && heigth == 15) {
				System.out.println("\n\n");
				System.out.println(this.clean("not"));
				if(covered = true) {
					System.out.println(this.covers("actually"));
				}
				else {
					System.out.println("\n\n");
					System.out.println(this.clean("actually"));
					if(covered = false) {
						System.out.println(this.covers("not"));
					}
				}
				
			}
			
		}
		else {
			System.out.println("\n\n");
			System.out.println(this.clean("not"));
			if(covered = true) {
				System.out.println(this.covers("actually"));
			}
		}
		
		
	}
	
	public cage(int length, int width, int heigth, boolean clean, boolean covered) {
		super();
		Length = length;
		Width = width;
		Heigth = heigth;
		Clean = clean;
		Covered = covered;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getHeigth() {
		return Heigth;
	}

	public void setHeigth(int heigth) {
		Heigth = heigth;
	}

	public boolean isClean() {
		return Clean;
	}

	public void setClean(boolean clean) {
		Clean = clean;
	}

	public boolean isCovered() {
		return Covered;
	}

	public void setCovered(boolean covered) {
		Covered = covered;
	}
	
	//methods
	
	public String clean(String cc) {
		String text = "The Cage is " + cc + " clean";
		return text;
		
	}
	
	public String covers(String cc) {
		String text = "The Cage is " + cc + " covered";
		return text;
	}
	
	
}



public class MyMain {
	public static void main(String[] args) {
		ZooAnimal za = new ZooAnimal();
		
		
	}
}
