package Ex14_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다...");
			socket = listener.accept();	// 클라이언트로부터 연결 요청 대기
			System.out.println("연결되었씁니다");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				
				System.out.println("클라이언트: " + inputMessage);
				System.out.print("보내기 >>");
				String outputMessage = scanner.nextLine(); //키보드에서 한행 읽기
				
				out.write(outputMessage + "\n");
				out.flush();
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("클라이언트와 채팅 중 오류가 발생 했습니다.");
			}
		}
		
	}

}
