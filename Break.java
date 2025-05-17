package jump;

public class Break {
	public static void main(String[] args) {
		int arr[]= {40,13,55,33,2,17,23};
		for (int i:arr) {
			if (i<=40) {
				if (i%2==1) {
					System.out.println(i);
					break;					
				}
			}
		}
		
	}

}
