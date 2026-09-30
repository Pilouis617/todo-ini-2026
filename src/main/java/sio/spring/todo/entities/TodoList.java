package sio.spring.todo.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
	private String name;
	private LocalDateTime createdAt;
	private User owner;
	private List<TodoItem> items;

	public TodoList() {
		this("nouvelle liste");
	}

	public TodoList(String name) {
		this.name = name;
		this.createdAt = LocalDateTime.now();
		this.items = new ArrayList<TodoItem>();
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public User getOwner() {
		return owner;
	}

	public List<TodoItem> getItems() {
		return items;
	}
}
