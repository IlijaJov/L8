package pc;

public class Desktop extends PC {

	public Desktop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Desktop(String cpu, String hdd, String ram) {
		super(cpu, hdd, ram);
		
	}

	@Override
	public String type() {
		return "Desktop";
	}

	@Override
	public void print() {
		System.out.println(this.type() + ": CPU: " + this.cpu + ", HDD: " + 
							this.hdd + ", RAM: " +this.ram );
		
	}

}
