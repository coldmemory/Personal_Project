public class Salad {
	private String name;
	private int price;
	
	Salad(){}
	Salad(String name, int price){
		this.name = name;
		this.price = price;
		
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
