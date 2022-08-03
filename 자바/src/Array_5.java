package ja_0712;

public class Array_5 {
	public static void main(String[] args) {
		
		double sum = 0;
		float average = 0.0f;
		
		double[] score = {100.00, 88.56, 77.56, 56.12, 93};
		
		for (int i = 0; i<score.length; i++)
		{
			sum += score[i];
		}
		average = (float)sum / score.length;
		
		System.out.println("총점 :" + sum);
		System.out.printf("평균 : %7.2f", average);
	}

}
