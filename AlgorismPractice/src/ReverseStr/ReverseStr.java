package ReverseStr;

import java.util.Arrays;

/*
 * reverseStr �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
str�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� String�� �������ּ���.
str�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
������� str�� "Zbcdefg"�� "gfedcbZ"�� �����ϸ� �˴ϴ�.
 */
//��Ǯ��
public class ReverseStr {
	public String reverseStr(String str){
		String[] array = str.split("");
		Arrays.sort(array);
	
		System.out.println(Arrays.toString(array));
//		for (int i = 0; i < array.length; i++) {
//			result += array[array.length - i - 1];
//		}
		return "";
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}