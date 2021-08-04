package pc;

public class Laptop extends PC {
	
	public Laptop() {
		super();
	}

	public Laptop(String cpu, String hdd, String ram) {
		super(cpu, hdd, ram);
	}

	@Override
	public String type() {
		return "Laptop";
	}

	@Override
	public void print() {
		System.out.println(this.type() + ": CPU: " + this.cpu + ", HDD: " + 
							this.hdd + ", RAM: " +this.ram );
	}

}
