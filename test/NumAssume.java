package test;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NumAssume
{
	
	public static void main(String[] args)throws IOException
	{
		
		Random ran = new Random();
		int num = ran.nextInt(30);
		num++;
		System.out.println("1�`30�܂ł̃����_���Ȓl���쐬���܂����B");
		System.out.println("7��܂œ��͂ł��܂��B");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int input = Integer.parseInt(str);
		
		
		for(int i=1; i<7;i++){
			if(num<input){
				System.out.println("�������傫�������ł��B");
			}
			else{
				System.out.println("������菬���������ł��B");
			}
			str = br.readLine();
			input = Integer.parseInt(str);
			if(num==input){
				System.out.println("�����ł�");
				break;
			}
		}	
	}
}

