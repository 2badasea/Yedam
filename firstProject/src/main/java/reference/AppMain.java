package reference;
/////202�� ����. ���� �ڵ���� ������ �� �ǹǷ� å�� �����ؼ� ������ ��. 
import java.util.Scanner;
public class AppMain {
	
	
	public static void main(String[] args) {
		//�л��ο� �������, �л�����, �Էµ� ��ü������ ����Ʈ, �м�: ��հ� �ְ���, ����
		Scanner scn = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("--------------------------------------------------------");
			System.out.println("����> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo ==1) {
				System.out.println("�л���> ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			} else if(selectNo==2) {
				System.out.println("������ �Է��ϼ���");
				for(int i =0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> ");
					scores[i]=Integer.parseInt(scn.nextLine());
				}
			} else if(selectNo==3) {
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores["+i+"] :" + scores[i]);
				}
			} else if(selectNo==4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i =0; i<scores.length; i++) {
					max = (max < scores[i])? scores[i] : max;
					sum = sum + scores[i];
				}
				avg = (double)sum/studentNum;
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			} else if(selectNo==5) {
				run = false;
			}
			
			
			
			
			
		}
		System.out.println("���α׷� ����");
	
 }
}
