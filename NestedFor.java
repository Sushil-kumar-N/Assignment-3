
public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int j = 1;j<=5;j++) 
		{
			for (int i = 1; i<=j; i++) 
			{
				System.out.print(k++ +" ");
			}                            
			System.out.println();//new line
	}

}
}
