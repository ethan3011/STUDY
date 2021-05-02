package HTA0430.app;

import HTA0430.service.TodoService;
import HTA0430.vo.Todo;
import HTA0430.vo.User;

import static HTA0430.utils.KeyboardUtils.readInt;
import static HTA0430.utils.KeyboardUtils.readString;
import static HTA0430.utils.KeyboardUtils.readDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import HTA0430.exception.TodoException;

public class TodoApp {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");

	private TodoService service = new TodoService();
	
	public TodoApp() {
		service.프로그램시작서비스();
	}
	
	public void menu() {
		try {
		if (!service.로그인여부제공서비스()) {
			System.out.println("---------------------------------------------------------------------------------------------------------");
			System.out.println("1.로그인 2.회원가입 0.종료");
			
			System.out.print("메뉴 선택 > ");
			int menuNo = readInt();
			System.out.println();
			
			if (menuNo == 1) {
				로그인();
			} else if (menuNo == 2) {
				회원가입();
			} else if(menuNo == 0) {
				종료();
			}
			
		} else {
			System.out.println("---------------------------------------------------------------------------------------------------------");
			System.out.println("1.일정조회 2.일정추가 3.일정변경 4.일정완료처리 5.일정삭제 6.일정상세조회 7.비밀번호변경 8.로그아웃 9.회원탈퇴  0.종료");
			System.out.println("---------------------------------------------------------------------------------------------------------");
			
			System.out.print("메뉴 선택 > ");
			int menuNo = readInt();
			
			if (menuNo == 1) {
				일정조회();
			} else if (menuNo == 2) {
				일정추가();
			} else if (menuNo == 3) {
				일정변경();
			} else if (menuNo == 4) {
				일정완료처리();
			} else if (menuNo == 5) {
				일정삭제();
			} else if (menuNo == 6) {
				일정상세조회();
			} else if (menuNo == 7) {
				비밀번호변경();
			} else if (menuNo == 8) {
				로그아웃();
			} else if (menuNo == 9) {
				회원탈퇴();
			} else if(menuNo == 0) {
				종료();
			}
		}
		} catch (TodoException e) {
			System.out.println("[오류] " + e.getMessage());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		menu();
	}
	
	// 아이디와 비밀번호를 입력받아서 로그인 서비스를 실행한다.
	private void 로그인() {
		System.out.println("[로그인]");
		
		System.out.print("아이디를 입력하세요: ");
		String userId = readString();
		
		System.out.print("비밀번호를 입력하세요: ");
		String password = readString();
		
		service.로그인서비스(userId, password);
		System.out.println("[안내] 로그인이 완료되었습니다.");
	}
	
	// 로그아웃 서비스를 실행한다.
	private void 로그아웃() {
		service.로그아웃서비스();
	}
	
	// 아이디, 비밀번호, 사용자명을 입력받아서 회원가입 서비스를 실행한다.
	private void 회원가입() {
		System.out.println("아이디를 입력하세요 : ");
		String userId = readString();
		System.out.println("비밀번호를 입력하세요 : ");
		String passwrod = readString();
		System.out.println("사용자명을 입력하세요 : ");
		String username = readString();
		
		User user = new User();
		user.setId(userId);
		user.setPassword(passwrod);
		user.setUsername(username);
		service.회원가입서비스(user);
	}
	
	// 종료 서비스를 실행한다.
	private void 종료() {
		System.out.println("[종료] 프로그램이 종료됩니다.");
		service.프로그램종료서비스();
		System.exit(0);
	}
	
	// 나의모든일정조회서비스를 실행한다.
	private void 일정조회() {
		List<Todo> todos = service.나의모든일정조회서비스();
		System.out.println("[나의 모든 일정]");
		System.out.println("=========================================================================");
		for(Todo todo :todos) {
				System.out.println("번호 : " + todo.getNo());
				System.out.println("제목 : " + todo.getTitle());
				System.out.println("생성이 : " + todo.getWriter());
				System.out.println("생성일 : " + dateFormat.format(todo.getCreatedDate()));
				System.out.println("예정일 : " + dateFormat.format(todo.getDay()));
				System.out.println("상태 : " + todo.getStatus());
				System.out.println("내용 : " + todo.getText());
				if(todo.getCompletedDate() == null) {
					System.out.println("완료일 : 미정");
				}else {
					System.out.println("완료일 : " + dateFormat.format((todo.getCompletedDate())));
				}
				System.out.println();
			}
	}
	
	private void 일정상세조회() {
		System.out.println("[일정상세조회]");
		
		System.out.println("조회하실 일정 번호를 입력해주세요 : ");
		int no = readInt();
		Todo foundTodo = service.일정상세조회서비스(no);
			System.out.println("=========================================================================");
			System.out.println("계획번호 : " + foundTodo.getNo());
			System.out.println("계획제목 : " + foundTodo.getTitle());
			System.out.println("계획 생성자 : " + foundTodo.getWriter());
			System.out.println("실행일 : " + dateFormat.format(foundTodo.getDay()));
			System.out.println("계획상태 : " + foundTodo.getStatus());
			System.out.println("계획내용 : " + foundTodo.getText());
			System.out.println("생성일 : " + dateFormat.format(foundTodo.getCreatedDate()));
			if(foundTodo.getCompletedDate() == null) {
				System.out.println("완료일 : 미정");
			}else {
				System.out.println("완료일 : " + dateFormat.format((foundTodo.getCompletedDate())));
			}
			if(foundTodo.getDeletedDate() == null) {
				System.out.println("삭제일 : 미정");
				System.out.println("=========================================================================");
			}else {
				System.out.println("삭제일 : " + dateFormat.format((foundTodo.getDeletedDate())));
				System.out.println("=========================================================================");
			}
		
	}
	
	// 일정제목, 내용, 예정일을 입력받아서 새일정추가서비스를 실행한다.
	private void 일정추가() {
		System.out.println("[새 일정 추가]");
		
		System.out.print("일정 제목을 입력하세요: ");
		String title = readString();
		System.out.print("일정 내용을 입력하세요: ");
		String text = readString();
		System.out.print("일정 실행일을 입력하세요(2021-04-30): ");
		Date day = readDate();
		
		Todo todo = new Todo();
		todo.setTitle(title);
		todo.setText(text);
		todo.setDay(day);
		
		service.새일정추가서비스(todo);
		
	} 
	
	// 변경할 일정번호, 제목, 내용을 입력받아서 일정변경서비스를 실행한다.
	private void 일정변경() {
		System.out.println("[일정 변경]");
		
		System.out.println("일정 변경할 번호를 적어주세요 : ");
		int no = readInt();
		System.out.println("일정 변경할 제목을 적어주세요 : ");
		String title = readString();
		System.out.println("일정 변경할 내용을 적어주세요 : ");
		String text = readString();
		
		service.일정변경서비스(no, title, text);
	}
	
	// 완료처리할 일정번호를 입력받아서 일정완료처리서비스를 실행한다.
	private void 일정완료처리() {
		System.out.println("[일정 완료 처리]");
		
		System.out.println("완료처리할 일정번호를 입력해주세요.");
		int no = readInt();
		service.일정완료처리서비스(no);
	}
	
	// 삭제할 일정번호를 입력받아서 일정삭제서비스를 실행한다.
	private void 일정삭제() {
		System.out.println("[일정 삭제]");
		
		System.out.println("삭제하실 일정 번호를 입력해주세요 : ");
		int no = readInt();
		
		service.일정삭제서비스(no);
	}
	
	// 이전비밀번호, 새비밀번호를 입력받아서 비밀번호변경서비스를 실행한다.
	private void 비밀번호변경() {
		System.out.println("[비밀번호 변경]");
		
		System.out.println("이전 비밀번호를 입력해주세요 : ");
		String oldPassword = readString();
		
		System.out.println("신규 비밀번호를 입력해주세요 : ");
		String newPassword = readString();
		
		service.비밀번호변경서비스(oldPassword, newPassword);
	}
	
	// 비밀번호를 입력받아서 회원탈퇴서비스를 실행한다.
	private void 회원탈퇴() {
		System.out.println("[회원 탈퇴]");
		
		System.out.println("탈퇴를 진행하시려면 비밀번호를 입력해주세요 : ");
		String password = readString();
		service.회원탈퇴서비스(password);
		service.로그아웃서비스();
		
	}
		
	public static void main(String[] args) {
		new TodoApp().menu();
	}
}
