package pc;

public abstract class PC { 
		
		protected String cpu;
		protected String hdd;
		protected String ram;
		
		public PC() {
			super();
		}

		public PC(String cpu, String hdd, String ram) {
			super();
			this.cpu = cpu;
			this.hdd = hdd;
			this.ram = ram;
		}

		public String getCpu() {
			return cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getHdd() {
			return hdd;
		}

		public void setHdd(String hdd) {
			this.hdd = hdd;
		}

		public String getRam() {
			return ram;
		}

		public void setRam(String ram) {
			this.ram = ram;
		}
		
		public abstract String type();
		
		public abstract void print();

}
