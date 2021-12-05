package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Main03 {

	public static void main(String[] args) {
		// 읽을 파일의 경로
		final String PATH = "C:/Users/admin/Downloads/test.txt";
		
		// 읽을 내용이 담겨질 스트림
		byte[] data = null;
		
		// 읽은 내용이 변환될 문자열
		String read_string = null;
		
		/*
		 * 파일읽기
		 */
		InputStream in = null;
		try {
			in = new FileInputStream(PATH);
			
			// 읽은 내용을 담기 위한 배열은 파일의 용량만큼 사이즈를 할당한다.
			// in.available() -> 열고 있는 파일의 크기
			data = new byte[in.available()];
			
			// 파일 읽기 - 파라미터로 전달된 배열 안에, 파일의 내용을 담아준다.
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >> " + PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음 >> " + PATH);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 파일 읽기 실패 >> " + PATH);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ERROR] 알 수 없는 에러 >> " + PATH);
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// data 배열에 내용이 있다면, 문자열로 변환하여 출력
		if( data != null ) {
			// 문자열로 변환시에는 저장된 인코딩으로 지정해 준다.
			try {
				read_string = new String(data, "utf-8");
				System.out.println(read_string);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				System.out.println("[ERROR] 인코딩 지정 에러");
			}
		}		
	}
}