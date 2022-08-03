package ja_0726;

public class String_15 {
	public static void main(String[] args) {
		
		String[] numbers = {"34.5", "21.5", "37.5", "45.5", "58.5"};
		String result_1 = "";
		Integer result_2 = 0;
		Double result_3 = 0.0;
		Float result_4 = 0.0f;
		
		for (int i = 0; i < numbers.length; i++) 
		{
			result_1 += numbers[i] + ", ";
			result_2 += (int)(Double.parseDouble(numbers[i])); //소숫점 없애고 계산
			result_3 += Double.parseDouble(numbers[i]); //소숫점 합쳐서 계산
			result_4 += Float.parseFloat(numbers[i]);
		}
		
		System.out.println("result_1 : " + result_1);
		System.out.println("result_2 : " + result_2);
		System.out.println("result_3 : " + result_3);
		System.out.println("result_4 : " + result_4);
		
		}
	}

