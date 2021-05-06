public class IPcutter {
	String ip;

	IPcutter(String ip) {
		this.ip = ip;
	}

	public int[] cut() {
		int[] processedIP = new int[4];
		String[] parts = ip.split("\\.");
		if (parts.length != 4) {
			System.out.println("IP error ");
		} else {
			for (int i = 0; i < parts.length; i++) {
				processedIP[i] = Integer.parseInt(parts[i]);
				
			}

		}
		return processedIP;
	}
}
