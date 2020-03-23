
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[20];
		int count = 1;
		for(int i=0; i<20; i++) {
			array[i] = count;
			count++;
		}
		for(int arr : array) {
			System.out.println(arr);
		}
	}

}
