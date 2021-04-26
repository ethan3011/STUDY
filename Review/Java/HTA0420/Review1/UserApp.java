package HTA0420.Review1;

import java.util.Scanner;

public class UserApp {
	/*UserApp*/
	public static void main(String[] args) {
		
	//Scanner 객체
	Scanner sc = new Scanner(System.in);

	//UserService 객체
	UserService service = new UserService();
	
		//while문
		while(true) {
		//try~catch문
		try {
			System.out.println("---------------------------------------");
			System.out.println("1.가입하기 2.비밀번호변경 3.회원탈퇴 4.조회 0.종료");
			System.out.println("---------------------------------------");
			
			System.out.println("메뉴번호를 입력해주세요.");
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) {
				System.out.println("[회원가입]");
				System.out.println("아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("이름을 입력해주세요.");
				String name = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				String pwd = sc.next();
				service.insertUser(new User(id, name, pwd));
				System.out.println("[성공] 회원가입이 완료되었습니다.");
				
			}else if(menuNo == 2) {
				System.out.println("[비밀번호변경]");
				System.out.println("아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("기존 비밀번호를 입력해주세요.");
				String oldPwd = sc.next();
				System.out.println("신규 비밀번호를 입력해주세요.");
				String newPwd = sc.next();
				service.changePassword(id, oldPwd, newPwd);
				System.out.println("[성공] 비밀번호 변경이 완료되었습니다.");
				
			}else if(menuNo == 3) {
				System.out.println("[회원탈퇴]");
				System.out.println("아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("비밀번호를 입력해주세요.");
				String pwd = sc.next();
				service.deleteUser(id, pwd);
				System.out.println("[성공] 계정이 삭제되었습니다.");
				
			}else if(menuNo == 4) {
				System.out.println("[조회]");
				System.out.println("아이디를 입력해주세요.");
				String id = sc.next();
				System.out.println("이름을 입력해주세요.");
				String name = sc.next();
				
				User save = service.searchUserInfo(id, name);
				System.out.println("### 회원정보");
				System.out.println("회원아이디 : " + save.getId());
				System.out.println("회원이름 : " + save.getName());
				
			}else if(menuNo == 0) {
				System.out.println("[종료]");
				break;
			}
		}catch (UserException e) {
			System.out.println("오류 : " + e);
		}catch (Exception e) {
			System.out.println("알수가없는 오류가 발생하였습니다. 프로그램을 종료합니다.");
			break;
		}
		}sc.close();
	}
}

