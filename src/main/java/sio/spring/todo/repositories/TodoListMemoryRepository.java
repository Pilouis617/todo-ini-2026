package sio.spring.todo.repositories;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import sio.spring.todo.entities.TodoList;

@Repository
public class TodoListMemoryRepository extends BaseRepository<TodoList, UUID> {

}
