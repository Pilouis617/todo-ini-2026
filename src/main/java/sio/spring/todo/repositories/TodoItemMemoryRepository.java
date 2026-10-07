package sio.spring.todo.repositories;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import sio.spring.todo.entities.TodoItem;

@Repository
public class TodoItemMemoryRepository extends BaseRepository<TodoItem, UUID> {

}
