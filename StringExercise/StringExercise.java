package StringExercise;

/*
 * getMiddle�޼ҵ�� �ϳ��� �ܾ �Է� �޽��ϴ�. 
 * �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������. 
 * �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
 * ������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�, �Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�.
 */
class StringExercise{
    String getMiddle(String word){
    	String[] array = word.split("");
    	if (word.length()%2 == 0) {
			return array[(word.length()/2)-1] + array[(word.length()/2)];
		}else{
			return array[(word.length()/2)];
		}
    	    
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}