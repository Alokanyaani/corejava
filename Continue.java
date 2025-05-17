package jump;

public class Continue {
	public static void main(String[] args) {
		int arr[]= {40,20,55,33,2};
		for(int i:arr) {
			if(i==55 || i==33) {
				continue;
				
			}
			System.out.println(i);
		}
	}

}
