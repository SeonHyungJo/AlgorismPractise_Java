
/*
 getMinMaxString �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
str���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�.
str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� �̸� "(�ּҰ�) (�ִ밪)"������ String�� ��ȯ�ϴ� �޼ҵ带 �ϼ��ϼ���.
������� str�� "1 2 3 4"��� "1 4"�� �����ϰ�, "-1 -2 -3 -4"��� "-4 -1"�� �����ϸ� �˴ϴ�.
 */
package GetMinMaxString;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	String[] arStr = str.split("\\s");
    	int max = 0,num, min = 9999;
    	for (int i = 0; i < arStr.length; i++) {
    		num = Integer.parseInt(arStr[i]);
    		if (max < num) {
				max = num;
			}
    		if(min > num){
    			min = num;
    		}
		}	
        return min + " " + max;
    }

    public static void main(String[] args) {	
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
    }
}