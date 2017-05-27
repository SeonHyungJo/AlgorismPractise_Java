package ReverseStr;

/*
 * reverseStr �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
str�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� String�� �������ּ���.
str�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
������� str�� "Zbcdefg"�� "gfedcbZ"�� �����ϸ� �˴ϴ�.
 */
//��Ǯ��

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("ywwrqlkjiheeeUK") );
	}
}