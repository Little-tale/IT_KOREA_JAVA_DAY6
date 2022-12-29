package ifTest;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {
		//OperTest 문제를 if문으로 바꾸기
		// result = (num1 > num2) ? (num1):(num2);
		int num1 = 7, num2 = 5, result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 :");
		num1 = sc.nextInt();
		System.out.print("정수2 입력 :");
		num2 = sc.nextInt();
		
		if (num1>num2)
		{
			result = num1;
			System.out.println("큰수는 : "+result+" 입니다.");
		}
		else if (num1<num2)
		{
			result = num2;
			System.out.println("큰수는 : "+result+" 입니다.");
		}
		else if (num1==num2)
		{
			result = 0;
			System.out.println("같은수네요? --\'\'");
		}
		else
		{
			System.out.println("넌 무었을 한게니?");
		}
		
		// 왼만하면 예상되는 부분은 다 조건문에 적고 예상밖은 else로 에러를 방출하게 하는것이
		// 아주 좋소. 
		
	}

}
