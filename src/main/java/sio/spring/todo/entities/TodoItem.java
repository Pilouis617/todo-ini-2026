package sio.spring.todo.entities;

public class TodoItem {
	private String label;
	private boolean checked;

	public TodoItem() {
		this("Item");
	}

	public TodoItem(String label) {
		this.label = label;
		this.checked = false;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
