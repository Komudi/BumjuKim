package Ex14_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServerEx {
	public static String clac(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if(st.countTokens() !=3) return "error";
		
		String res ="";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode= st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch (opcode) {
		case "+":res = Integer.toString(op1+op2);
			break;
			
		case "-":res = Integer.toString(op1-op2);
			break;
		
		case "*":res = Integer.toString(op1*op2);
			break;

		default:res = "error";
		}
		return res;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in =null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �־��ϴ�");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� ����");
					break;
				}
				
				System.out.println(inputMessage);
				String res = clac(inputMessage);
				out.write(res + "\n");
				out.flush();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket != null) socket.close();
				if(listener != null) listener.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߾����ϴ�!!");
			}
		}
		
	}

}
