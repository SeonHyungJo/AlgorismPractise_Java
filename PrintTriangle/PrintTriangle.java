package PrintTriangle;


/*
 * printTriangle �޼ҵ�� ���� ���� num�� �Ű������� �Է¹޽��ϴ�.
������ ������ *(��)�� ���̰� num�� �ﰢ���� ���ڿ��� �����ϴ� printTriangle �޼ҵ带 �ϼ��ϼ���
printTriangle�� return�ϴ� String�� ���๮��('\n')�� ������ �մϴ�.

���̰� 3�϶�

*
**
***
���̰� 5�϶�

*
**
***
****
*****
 */
public class PrintTriangle {
	public String printTriangle(int num){
		String str = "";
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				str += "*";
			}
			str += '\n';
		}
		/*�ٸ�Ǯ��
		 * String stars = "*";
        for(int i=0; i<num; ++i){
            result += stars+"\n";
            stars += "*";
        }
		 */
		return str;		
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println( pt.printTriangle(3) );
	}
}