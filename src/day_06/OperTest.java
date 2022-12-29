package day_06;

import java.util.Scanner;

public class OperTest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,result;
		System.out.print("정수1 입력 :");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 :");
		num2 = sc.nextInt();
		
		// result 에 삼항 연산자
		result = (num1 > num2) ? (num1):(num2);
		
		
		if (num1 == num2)
			{
			System.out.println("두 수가 같습니다. 똑바로 다시 넣는게 좋을꺼야 뒤지게 맞기 싫으면");
			//return 0;
			
			}
		else
			{
			System.out.println("큰수는 : "+result+" 입니다.");
			}
		
		
		}
		

}
