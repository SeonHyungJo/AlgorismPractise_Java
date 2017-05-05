/*def average(list):
함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
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

