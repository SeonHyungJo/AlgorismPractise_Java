package EvenOrOdd;
/*
 * evenOrOdd �޼ҵ�� int�� num�� �Ű������� �޽��ϴ�.
num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϵ��� evenOrOdd�� �ڵ带 �ۼ��� ������.
num�� 0�̻��� �����̸�, num�� ������ ���� �����ϴ�.
 */


public class EvenOrOdd {
    String evenOrOdd(int num) {
    	String result = "Even";
    	if (num % 2 != 0) {
			result = "Odd";
		}
        return result;
        /*�ٸ�Ǯ��
         * String evenOrOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
         */
        
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("��� : " + evenOrOdd.evenOrOdd(3));
        System.out.println("��� : " + evenOrOdd.evenOrOdd(2));
    }
}