package sio.spring.todo.repositories;

import java.util.UUID;

import sio.spring.todo.entities.User;

@org.springframework.stereotype.Repository
public class UserMemoryRepository extends BaseRepository<User, UUID> {
}
