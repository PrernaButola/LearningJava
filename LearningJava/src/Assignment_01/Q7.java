package Assignment_01;

public class Q7 {
	class Main_Method {
		//private int id;
		//public String name;
		static int count = 0;
		
		Main_Method(){
			/*Scanner sc = new Scanner(System.in);
			System.out.println("enter id: ");
			id = sc.nextInt();
			System.out.println("enter name: ");
			 name = sc.next(); */
			count++;
		}
		void display() {
			//System.out.println("name is: "+name);
			//System.out.println("id is: "+id);
			System.out.println("Total no of count: "+count);
		}
		
	}

}

