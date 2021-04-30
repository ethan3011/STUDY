package HTA0430.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import HTA0430.exception.TodoException;
import HTA0430.utils.StringUtils;
import HTA0430.vo.Todo;

public class TodoDao {

	private List<Todo> db = new ArrayList<Todo>();
	
	/**
	 * 새 Todo을 db에 추가한다.
	 * @param todo 새 Todo
	 */
	public void insertTodo(Todo todo) {
		db.add(todo);
	}
	
	/**
	 * 모든 Todo 정보를 반환한다.
	 * @return Todo 리스트
	 */
	public List<Todo> getTodos() {
		return db;
	}
	
	/**
	 * 지정한 Todo 번호의 Todo 정보를 반환한다.
	 * @param no 일정번호
	 * @return Todo정보
	 */
	public Todo getTodoByNo(int no) {
		for(Todo item :db) {
			if(item.getNo() == no) {
				return item;
			}
		}
		return null;
	}
	
	/**
	 * todos.csv에 기록된 Todo정보를 읽어서 db에 저장한다.
	 */
	public void loadData() {
		try(BufferedReader br = new BufferedReader(new FileReader("Java/HTA0430/todos.csv"))){
			String item = null;
			while((item = br.readLine()) != null) {
				String[] values = item.split(",");
				int no = StringUtils.stringToInt(values[0]);
				String title = values[1];
				String writer = values[2];
				Date day = StringUtils.stringToDate(values[3]);
				String status = values[4];
				String text = values[5];
				Date creatDate = StringUtils.stringToDateTime(values[6]);
				Date completeDate = StringUtils.stringToDateTime(values[7]);
				Date deletedDate = StringUtils.stringToDateTime(values[8]);
				
				Todo todo = new Todo();
				todo.setNo(no);
				todo.setTitle(title);
				todo.setWriter(writer);
				todo.setDay(day);
				todo.setStatus(status);
				todo.setText(text);
				todo.setCreatedDate(creatDate);
				todo.setCompletedDate(completeDate);
				todo.setDeletedDate(deletedDate);
				
				db.add(todo);
			}
		}catch(IOException e) {
			throw new TodoException(e.getMessage());
		}
	}
	
	/**
	 * db에 저장된 Todo 정보를 todos.csv 파일에 저장한다.
	 */
	public void saveData() {
		try(PrintWriter pw = new PrintWriter("Java/HTA0430/todos.csv")){
			StringBuilder sb = new StringBuilder();
			
			for(Todo todo :db) {
				sb.append(todo.getNo())
				.append(",")
				.append(todo.getTitle())
				.append(",")
				.append(todo.getWriter())
				.append(",")
				.append(StringUtils.dateToString(todo.getDay()))
				.append(",")
				.append(todo.getStatus())
				.append(",")
				.append(todo.getText())
				.append(",")
				.append(StringUtils.dateTimeToString(todo.getCreatedDate()))
				.append(",")
				.append(StringUtils.dateTimeToString(todo.getCompletedDate()))
				.append(",")
				.append(StringUtils.dateTimeToString(todo.getDeletedDate()));
				
				String text = sb.toString();
				pw.println(text);
				
				sb.setLength(0);
			}
		}catch(IOException e) {
			throw new TodoException(e.getMessage());
		}
		
	}
}
