package Laba1;

public class Action {
	private String name = "no name";
	private double price;
	private double date;
	private int value;
	private int owner;
	private static double totalPrice = 0;
	
	public Action() {		
	}
	
	public Action(String name, double date, int value, int owner) {
		setName(name);
		setDate(date);
		setValue(value);
		setOwner(owner);	
	}
	
	public Action(String name, double date, int value, int owner, double price) {
		setName(name);
		setDate(date);
		setValue(value);
		setOwner(owner);
	        setPrice(price);
	}
	
	public String toString() {
		return "Information about action: \n" +
                                  "\nname: " + getName() 
				+ "\ndate: " + getDate() 
				+ "\nvalue: " + getValue() 
				+ "\nowner: " + getOwner() 
				+ "\nprice: " + getPrice()
				+ "\n";	
	}

	public static void printStaticSum() {
		System.out.print("Price all actions" + totalPrice + " dollars\n");
	}
	
	public void printSum() {
		System.out.println("Price action " + getName() + " is " + getPrice() + " dollars\n");
	}
	
	public void resetValues(String name, double date, int value, int owner, double price) {
		setName(name);
		setDate(date);
		setValue(value);
		setOwner(owner);
	        setPrice(price);
	}
        public String getName() {
		return name;
	}
        public void setName(String name) {
    		this.name = name;
    	}
	public double getDate() {
		return date;
	}

	public void setDate(double date) {
		this.date = date;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		totalPrice -= this.price;
		totalPrice += price;
		this.price = price;
	}
}
