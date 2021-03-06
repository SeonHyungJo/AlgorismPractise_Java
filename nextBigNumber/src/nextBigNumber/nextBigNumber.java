package nextBigNumber;
/*
 * 어떤 수 N(1≤N≤1,000,000) 이 주어졌을 때, N의 다음 큰 숫자는 다음과 같습니다.
N의 다음 큰 숫자는 N을 2진수로 바꾸었을 때의 1의 개수와 같은 개수로 이루어진 수입니다.
1번째 조건을 만족하는 숫자들 중 N보다 큰 수 중에서 가장 작은 숫자를 찾아야 합니다.
예를 들어, 78을 2진수로 바꾸면 1001110 이며, 78의 다음 큰 숫자는 83으로 2진수는 1010011 입니다.
N이 주어질 때, N의 다음 큰 숫자를 찾는 nextBigNumber 함수를 완성하세요.
 */
class nextBigNumber
{
	public int nextBigNumber(int n)
	{
		 int a = Integer.bitCount(n);
	      int compare = n+1;

	      while(true) {
	        if(Integer.bitCount(compare)==a)
	          break;
	        compare++;
	      }

	      return compare;
//		int answer = n;
//		int count = 0;
//		int count2 = 0;
//		String num = Long.toBinaryString(n);
//		String num2 = "";
//		for (int i=0; i<num.length(); i++) {
//			if (num.charAt(i) == '1') {
//				count++;
//			}
//		}
//		while(true){
//			count2 = 0;
//			answer = answer+1;
//			num2 = Long.toBinaryString(answer);
//			for (int i=0; i<num2.length(); i++) {
//				if (num2.charAt(i) == '1') {
//					count2++;
//				}
//			}
//			if (count == count2) {
//				return answer;
//			}
//		}	
	}
	public static void main(String[] args)
	{
		nextBigNumber test = new nextBigNumber();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}
}