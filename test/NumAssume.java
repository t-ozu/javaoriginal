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
		System.out.println("1～30までのランダムな値を作成しました。");
		System.out.println("7回まで入力できます。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int input = Integer.parseInt(str);
		
		
		for(int i=1; i<7;i++){
			if(num<input){
				System.out.println("答えより大きい数字です。");
			}
			else{
				System.out.println("答えより小さい数字です。");
			}
			str = br.readLine();
			input = Integer.parseInt(str);
			if(num==input){
				System.out.println("正解です");
				break;
			}
		}	
	}
}

