import java.awt.List;
import java.util.Arrays;


/*
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, 
 * n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
 * nlcm 함수를 통해 n개의 숫자가 입력되었을 때, 최소공배수를 반환해 주세요. 
 * 예를들어 [2,6,8,14] 가 입력된다면 168을 반환해 주면 됩니다.
 */
class NLCM {
	public long nlcm(int[] num) {
		int val1 = num[0],val2;
		int r = 1;
		int LCM = 0, tmp1, tmp2;

		for (int i = 1; i < num.length; i++) {
			r = 1;
			val2 = num[i];
			tmp1 = val1;
			tmp2 = val2;
			System.out.println("val1 : " + val1 + " val2 : " + val2);
			System.out.println("tmp1 : " + tmp1 + " tmp2 : " + tmp2);
			if(val1<val2){//2번째 입력수가 클 경우 큰수를 val1으로 변경
	            val1 = tmp2;
	            val2 = tmp1;
	         }
			while(r>0){//유클리드 호제법을 이용한 GCD(최대공약수)구하기
				r = val1 % val2;
				val1 = val2;
				val2 = r;
			}
			LCM = tmp1 * tmp2 / val1;
			System.out.println("LCM : " + LCM);
			val1 = LCM;
		}
		return LCM;
	}

	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 6, 97, 70, 42, 77, 54, 96, 71, 39, 50 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}