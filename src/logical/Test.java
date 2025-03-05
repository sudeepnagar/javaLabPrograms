package logical;

public class Test {

	public static void main(String[] args) {
		int m=4, n=5;
		int arr[][]= {{1,2,3,4,5},
				         {9,8,5,4,3},
				         {2,3,4,10,1},
				          {2,4,5,6,8}
				     };
		
		
		int k=0;
		for(int i=0;i<m;i++)
		{
			int a=arr[i][k];
			int b=arr[i][k];
			for(int j=i+1;j<n;j++)
			{
			
			   if(arr[i][j]>a || arr[i][j]<b )
			   {
				 if(arr[i][j]>a)
				 {
				  a=arr[i][j];
				  b=0;
				 }
				 else if(arr[i][j]<b)
				 {
				  b=arr[i][j];
				  a=0;
				 }
				 else 
				 {
					 System.out.println("not");
					 break;
				 }
			   }
				
			}
			k++;
		}
		System.out.println("yes");

	}

}
