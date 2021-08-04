package pc;

public class PcMain {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop("Intel Core i7-10750H Hexa Core", 
									"512 GB SSD PCIe NVMe M.2", "16 GB DDR4 - 2933 MHz");
		
		Desktop desktop = new Desktop("AMD Ryzen 7 2700X Eight-Core Processor 3.70 GHz", 
										"1 TB SSD PCIe NVMe M.2",
										"VENGEANCE® LPX 16GB (2 x 8GB) DDR4 DRAM 3200MHz");
		
		laptop.print();
		desktop.print();
		

	}

}
