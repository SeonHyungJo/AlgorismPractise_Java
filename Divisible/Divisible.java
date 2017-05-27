package Divisible;
/*
 * divisible �޼ҵ�� int�� �迭 array�� int divisor�� �Ű������� �޽��ϴ�.
array�� �� element �� divisor�� ������ �������� ���� �����ϴ� ���ο� �迭�� ���� ��ȯ�ϵ��� divisible�� �ڵ带 �ۼ��� ������.

������� array�� {5, 9, 7, 10}�̰� divisor�� 5�̸� {5, 10}�� �����ؾ� �մϴ�.
 */
import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		int num = 0;
		int n = 0;
		for (int i=0; i < array.length; i++) {
			if (array[i] % divisor == 0)
				num++;
		}
		int[] ret= new int [num];
		for (int i=0; i < array.length; i++) {
			if (array[i] % divisor == 0) {
				ret[n] = array[i];
				n++;
			}
		}
		//�ٸ�Ǯ�� return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
		return ret;
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}