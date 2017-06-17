import java.awt.List;
import java.lang.reflect.Array;

/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.

A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.

보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 ceasar 함수를 완성해 보세요.	

“a B z”,4를 입력받았다면 “e F d”를 리턴합니다./'
 */

class Caesar {
	String caesar(String s, int n) {
		String[] array = s.split("");
		String result = "";
		for (int i = 0; i < array.length; i++) {
			int c = (int)array[i].charAt(0);
			if (c>=97) {
				c += n;
				if (c > 122) {
					c -= 26;
				}
			} else {
				c += n;
				if (c > 90) {
					c -= 26;
				}
			}
			result += Character.toString((char)c);
		}
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a A Z z', n은 4인 경우: " + c.caesar("a B z Z", 4));
	}
}
