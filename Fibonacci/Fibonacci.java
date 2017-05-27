package Fibonacci;
/*
 * �Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 2 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� ��ȭ���Դϴ�. 
 * 2 �̻��� n�� �ԷµǾ��� ��, fibonacci �Լ��� �����Ͽ� n��° �Ǻ���ġ ���� ��ȯ�� �ּ���. 
 * ���� ��� n = 3�̶�� 2�� ��ȯ���ָ� �˴ϴ�.
 */
class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		int num1 = 0;
		int temp = 1;
		if (num!=0 || num!=1) {
			for (int i = 1; i < num; i++) {
				answer = temp + num1;
				num1 = temp;
				temp = (int)answer;
			}	
		}
		return answer;
	}

  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}