import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int inputNum=0;//�����n
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		
		if(inputNum!=0){
			boolean[] lights = new boolean[inputNum];
			for(int index =0; index<lights.length ; index++)
				lights[index]=false;
			for(int sIndex = 0; sIndex < inputNum; sIndex++){//ѧ��������
				for(int lIndex = 0; lIndex < inputNum; lIndex++){//�Ƶ�����
					if( (lIndex+1)%(sIndex+1) ==0 )
						lights[lIndex] = !lights[lIndex];
				}
			}
			
			int onNum = 0;//���ŵĵ���
			for(int index =0; index<lights.length ; index++)
				if(lights[index]==true){
					onNum ++;//
				}
			System.out.print(onNum);
		}
	}
}
