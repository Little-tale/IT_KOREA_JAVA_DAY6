package day_06;

public class Oper2 {public static void main(String[] args)
{
	// 비트 연산자
		System.out.println(10&11);
		System.out.println(10|11);
		System.out.println(10^11);
		
		// XOR연산 으로 암호화 복호화 레쓰기릿
		int originNum = 1234; //원본데이터
		int crypto = 0;	// 암호화 데이터
		int decryto = 0; // 복호화 데이터
		int key = 12345; // 암호화 복호화에 사용할 키
		
		System.out.println("원본데이터 : "+ originNum);
		crypto = originNum ^ key; // 암호화 진행됨
		System.out.println("암호화 데이터 : "+ crypto);
		decryto = crypto ^ key; //복호화
		System.out.println("복호화 데이터 : "+ decryto);
		
		
		// ~ 논리부정 연산자
		System.out.println(~10);
		
		// 0b => 2진수 표련 자바 방식 // 1바이트 -> 8비트 => 
		// 1의 보수(not 연산)
		int a = 0b0000_0000_0000_0000_0000_0000_0000_1010;
		int b = 0b1111_1111_1111_1111_1111_1111_1111_0101;
		// 2의보수 (+1)
		int c = 0b1111_1111_1111_1111_1111_1111_1111_0110;
		
		System.out.println(".  원본 : "+a);
		System.out.println("1의보수 : "+b);
		System.out.println("2의보수 : "+c);
		
		// 쉬프트 연산자
		
		System.out.println(10>>1); // 1/2 감소
		System.out.println(10<<1); // 2배 됨
		System.out.println(10>>>1);
		
		//삼항연산자
			int number = ( 5 < 4 ) ? 5: 4; // false 니 거짓문 작동
			System.out.println(number); 
			
			int python = 50 ; // 효율성이 떨어지는 언어라 50점을 부여함 기능에 비해 효율이 너무 떨어짐 Rust를 배우도록
			// 파이썬 점수가 80점 이상 pass
			String TestNum = (python >= 80 ) ? ("Pass") : ("나가죽어");
			System.out.println(TestNum);
			
		
}

}
