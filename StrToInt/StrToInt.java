package StrToInt;

/*
strToInt �޼ҵ�� String�� str�� �Ű������� �޽��ϴ�.
str�� ���ڷ� ��ȯ�� ����� ��ȯ�ϵ��� strToInt�� �ϼ��ϼ���.
������� str�� "1234"�̸� 1234�� ��ȯ�ϰ�, "-1234"�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 */

public class StrToInt {
    public int getStrToInt(String str) {
    	int result = 0;
    	if (str.substring(0,1) == "-") {
    		result = Integer.parseInt(str.substring(0,4))*-1;
		}else{
			result = Integer.parseInt(str);
		}
        return result;
    }
    //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String args[]) {
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.getStrToInt("-1234"));
    }
}
