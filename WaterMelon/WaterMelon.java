package WaterMelon;

/*
 * water_melon�Լ��� ���� n�� �Ű������� �Է¹޽��ϴ�.
���̰� n�̰�, ���ڼ��ڼ�...�� ���� ������ �����ϴ� ���ڿ��� �����ϵ��� �Լ��� �ϼ��ϼ���.

������� n�� 4�̸� '���ڼ���'�� �����ϰ� 3�̶�� '���ڼ�'�� �����ϸ� �˴ϴ�.
 */
public class WaterMelon {
	public String watermelon(int n){
		String str = "";
		
		/*�ٸ�Ǯ��
		 * return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
		 */
		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				str += "��";
			} else {
				str += "��";
			}
		}
		return str;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}