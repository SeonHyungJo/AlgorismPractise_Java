package FindKim;

import java.util.Arrays;

public class FindKim2 {
    public String findKim(String[] seoul){
        //x�� �輭���� ��ġ�� �����ϼ���.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "�輭���� "+ x + "�� �ִ�";
    }

    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}
