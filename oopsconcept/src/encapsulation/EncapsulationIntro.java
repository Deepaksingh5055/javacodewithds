package encapsulation;


public class EncapsulationIntro {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(31);
		System.out.println(l1.getPrice());
		
	}
}
		
// public void dowork() {
//	System.out.println("working working");
//
//	}
	class Laptop{
		int ram;
		 private int price;
		 public void setPrice(int price) {
		 boolean isAdmin=true;
		 if(!isAdmin) {
		System.out.println("you cannot set price");
		 } else {
			
		this.price=price;
	}
		 }
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getPrice() {
			return price;
		}
		 

}
