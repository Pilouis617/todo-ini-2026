package sio.spring.todo.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String login;
	private String password;
	private List<TodoList> todoLists;

	public User() {
		this.todoLists = new ArrayList<TodoList>();
	}

	public void addTodoList(TodoList list) {
		todoLists.add(list);
		list.setOwner(this);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TodoList> getTodoLists() {
		return todoLists;
	}

}
