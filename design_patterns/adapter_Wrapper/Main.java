package adapter_Wrapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*接口转换器（包装器 转化器 适配器）
 * 例如电压：  220v         转接头         110v
 * 							  |
 * 						   用户使用
 */

public class Main {
	public static void main(String[] args) throws Exception {
		//字节输入流
		FileInputStream fis = new FileInputStream("");
		
		//相当于转接口
		InputStreamReader isr = new InputStreamReader(fis);
		
		//字符缓冲输入流
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		while(line !=null && !line.equals("")) {
			System.out.println(line);
		}
		br.close();
		
	}
}
