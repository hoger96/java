package prj1;

public class string {

	public static void main(String[] args) {
		//1. equals:두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.
		String a = "yh";
		String b = "yh";
		boolean equals = a.equals(b);
		System.out.println("equals: " + equals);
		
		//2. replace:문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
		String c = "김영현";
		String replace = c.replace("현", "웅");
		System.out.println("replace: " + replace);
		
		//3.substring:문자열에 지정한 범위에 속하는 문자열을 반환한다.
		String d = "김꿍디너무귀여워";
		String substring = d.substring(0,5);
		System.out.println("substring: " + substring);
		
		//4. concat:문자와 문자를 결합해준다.
		String e = "김";
		String f = "영현";
		String concat = e.concat(f);
		System.out.println("concat: " + concat);

	}

}
