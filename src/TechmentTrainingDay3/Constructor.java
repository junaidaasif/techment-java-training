package techmentTrainingDay3;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Customer{
			int id;
			String name;
			double contact;
			int minBalance;
			Customer(int id, String name, double contact, int minBalance){
				this.id = id;
				this.name = name;
				this.contact = contact;
				this.minBalance = minBalance;
			}
			public void display() {
				System.out.println(id);
				System.out.println(name);
				System.out.println(contact);
				System.out.println(minBalance);
			}
			
			public void check() {
				if(minBalance==0) {
					System.out.println("zero Balance account");
				}
				else if(minBalance==1000){
					System.out.println("current account");
				}
				else if(minBalance==10000) {
					System.out.println("current account");
				}
			}
			
			
		}
		Customer obj1 = new Customer(1,"junaid", 8770393, 10000);
		obj1.display();
		obj1.check();
		}

}
