package file;

import java.io.File;

public class Main01 {
	public static void main(String[] args) {
		//절대경로나 상대경로를 생성자 파라미터로 전달한다.
		//이클립스에서 상대경로를 사용할 경우, 현재 프로젝트가
		//기준이된다.
		File f1 = new File("src/file/Main01.java");
//		File f1 = new File("src/file");
		
		//전달된 경로가 파일인지 검사
		//-> 존재하지 않는 파일로 검사할 경우 무조건 false
		boolean is_file = f1.isFile();
		System.out.println("isFile = " + is_file);
		
		File f2 = new File("C:\\0900_GB_PJY\\java\\workspace\\day19\\src\\file\\Main01.java");
		boolean is_file2 = f2.isFile();
		System.out.println("isFile2 = " + is_file2);
		
		File f3 = new File("C:/0900_GB_PJY/java/workspace/day19/src/file/Main01.java");
		boolean is_file3 = f3.isFile();
		System.out.println("isFile3 = " + is_file3);
		
		
		
		//전달된 경로가 디렉토리인지 검사
		// -> 존재하지 않는 디렉토리로 검사할 경우 무조건 false
		boolean is_dir = f1.isDirectory();
		System.out.println("isDirectory = " + is_dir );
		
		//전달된 경로가 숨긴형태인지를 검사
		//-> 존재하지 않는 파일로 검사할 경우 무조건 false
		boolean is_hidden = f1.isHidden();
		System.out.println("isHidden = " + is_hidden);
		
		// 절대경로 값을 추출
		String abs = f1.getAbsolutePath();
		System.out.println("절대경로 : " + abs);
		
		
		//생성자에 전달된 파일이나 디렉토리가 물리적으로 존재하는지를 검사
		boolean is_exist = f1.exists();
		System.out.println("존재여부 = "+ is_exist);
		
		System.out.println("-------------------------------------------------");
		
		//디렉토리 정보 객체 생성
		
		File f4 = new File("a/b/c/target");
		System.out.println("isFile : " + f4.isFile());
		System.out.println("isDirectory :" + f4.isDirectory());
		System.out.println("isHidden : " + f4.isHidden());
		System.out.println("절대경로 : " + f4.getAbsolutePath());
		System.out.println("존재여부 : " + f4.exists());
		
		//경로에 따른 디렉토리생성
		f4.mkdirs();
		
		System.out.println("--------------------------------------------------");
		
		// 마지막 "/" 이후 단어를 리턴
		System.out.println(f1.getName());
		System.out.println(f4.getName());
		
		// 처음부터 마지막 "/"직전까지 리턴
		System.out.println(f1.getParent());
		System.out.println(f4.getParent());
		
		System.out.println("--------------------------------------------------");
		
		//삭제 -> 성공시 true, 실패시 false
		boolean del_ok = f4.delete();
		System.out.println("삭제성공여부 : " + del_ok);				
	}
}