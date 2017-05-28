package SumDivisor;
/*
어떤 수를 입력받아 그 수의 약수를 모두 더한 수 sumDivisor 함수를 완성해 보세요.
예를 들어 12가 입력된다면 12의 약수는 [1, 2, 3, 4, 6, 12]가 되고,
총 합은 28이 되므로 28을 반환해 주면 됩니다.
*/
public class SumDivisor {
	public int sumDivisor(int num) {
		int answer = 0;
    for (int i = 1; i <= (int)num/2; i++) {
      if (num % i == 0) {
        answer += i;
      }
    }
		//return java.util.stream.IntStream.rangeClosed(1,num).filter(x -> num % x == 0).sum();
		return answer+num;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumDivisor c = new SumDivisor();
		System.out.println(c.sumDivisor(12));
	}
}
