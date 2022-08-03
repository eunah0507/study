package ja_0712;

public class Array_4 {
public static void main(String[] args) {
	
	/*int [][] one = new int[4][3];
	
	one[0][0] = 1;
	one[0][1] = 2;
	one[0][2] = 88;
	one[1][0] = 3;
	one[1][1] = 4;
	one[2][0] = 88;
	one[2][1] = 5;
	one[2][2] = 6;
	one[3][0] = 88;
	one[3][1] = 8;
	one[3][2] = 88;
	*/
	
	int[][] one =  {{1,2,11},{3 ,4,22,123},{5,6,33,741,852},{7,8,44,9586,7458,4125}};
	int i, j;
	
	System.out.println(one.length);
	
	for (i = 0; i < one.length; i++) {
		System.out.print(one[i].length+" ");
		//for (j = 0; j < one[i].length; j++) {
			//System.out.print("   " + one[i][j]);
		//}
		//System.out.println();
	}
	
	
}
}
