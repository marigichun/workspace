public class RepeatPrint {
	
	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("���� ������ �ùٸ����ʽ��ϴ�");
			System.out.println("����");
			System.out.println("java RepeatPrint [-options]");
			System.out.println("-message <����� �޽��� �Է�>");
			System.out.println("-repeat <�޽��� ��� �ݺ� Ƚ��>");
		}
		else if (args.length == 2) {
			if (args[0].equals("-message")) {
				System.out.println(args[1]);
			}
		}

	}
}