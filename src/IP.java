
public class IP {

	public static void main(String[] args) {
		String ip= "192.168.1.50";
		IPcutter pIP= new IPcutter(ip);
		System.out.println("your processed IP is ");
		int [] ans=pIP.cut();
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		
		}
	}
}
