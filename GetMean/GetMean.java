/*def average(list):
�Լ��� �ϼ��ؼ� �Ű����� list�� ��հ��� return�ϵ��� ����� ������.
��� ũ���� list�� �͵� ��հ��� ���� �� �־�� �մϴ�.
 */

package GetMean;

public class GetMean {
    public int getMean(int[] array) {
    	int sum = 0;
    	
    	for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
        return sum/array.length;
    }

    public static void main(String[] args) {
        GetMean getMean = new GetMean();
    }
}

