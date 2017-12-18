public class JavaTypes {

	public static void main(String[] args) {

		// int�� �������� ��
		//�з�              �ڷ���            ���
		//������
		//������	       byte               -128 ~ 127
		//������           short              -32,768, ~ 32,767
		//������           int(�⺻��)      10����, 8����,16����(int-2,147,483,647~ 2,147,483,647)
		//������           long	              32000L(���� �ο� L�� ����) (-2^63~2^63-1)
		//�Ǽ���
		//�Ǽ���           float	              (+,-)1.4E-45 ~ 3.4028235E38(���� �ڿ� F�� ����)
		//�Ǽ���           double(�⺻��) (+,-)4.9E-324 ~ 107976931348623157E308
		//���ڿ�           String             ū ����ǥ�� ǥ��
		//���� 	       char                ���� ����ǥ�� �ѱ��ڸ� ǥ��
		//�ο�	       boolean           true, false��

		int intValue = 0;
		int num01 =10;	           //10���� 10�� ǥ�� 
		int num02 = 01750;	           //8���� 1000�� ǥ�� //oto�� ǥ��	
		int num03 = 0x3e8;	           //16���� 1000�� ǥ��
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);

		//�Ǽ���
		float floatVal=3014F;
		double doubleVal = 256012;
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		
		//������ Ÿ��
		String stringValue = "�ȳ��ϼ���.";
		String bye = "�ȳ��� �輼��.";
		System.out.println(stringValue);
		System.out.println(bye);
		
		//����
		char character = 'A';
		System.out.println(character);

		// �ο�
		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println(" " + trueVal +10);
		//	            (trueVal + 10 +" "); �� �ȵ�-���ڿ��̱� ����, '' ''�� �տ� ��ĭ �����
		//						   "" �� ���� ����
		
		System.out.println(falseVal);
		boolean result = 1 == 2;     //1�� 2�� Ʋ����.
		boolean result2 = 1 != 2;    //1�� 2�� Ʋ���ٴ�  (!�� Ʋ���ٴ� ��)
		System.out.println(result);
		System.out.println(result2);

		//if�� (10 == 11 && "��찳" =="��찳" && "����" =="������") �϶�
		// if���� �� ���¸� boolean���� �Ҷ�,
		//&&(����) ���� ���̸� true ���߿� 1���� �����̾ false
		//||(����) �ϳ��� ���̸� true 
		boolean isEqualNumber =10 ==11;
		boolean isEqualType ="��찳" =="��찳";
		boolean isEqualName ="����" =="������";
		if (isEqualNumber && isEqualType&& isEqualName) {
		
		}
		
		//����ȯ
		byte byteRes = (byte) 128; //int���� ������ byte Ÿ������ ����
		byte byteRes2 = (byte) 129;//byte���� �Ѿ�°��� ���ư�-��ȯ����
		System.out.println(byteRes);
		System.out.println(byteRes2);
		
		short shortRes = (short)32768;//int --> short ����ȯ
		System.out.println(shortRes);

		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01;   // float--> int ����ȯ.�Ҽ����� ����
		System.out.println(intVal01);
	
		int charNum = 'A';    //char  --> int ����ȯ, 'A'��  int 65�� ����(����)�Ǿ�����
		System.out.println(charNum);
	}
}


