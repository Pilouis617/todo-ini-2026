package sio.spring.todo.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import sio.spring.todo.entities.User;

@org.springframework.stereotype.Repository
public class UserRepository implements Repository<User, UUID> {
	private Map<UUID, User> internalUsers = new HashMap<UUID, User>();

	@Override
	public User save(User entity) {
		internalUsers.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Optional<User> findById(UUID id) {
		if (internalUsers.containsKey(id)) {
			return Optional.of(internalUsers.get(id));
		}
		return Optional.empty();
	}

	@Override
	public List<User> findAll() {
		return new ArrayList<User>(internalUsers.values());
	}

	@Override
	public void deleteById(UUID id) {
		if (internalUsers.containsKey(id)) {
			internalUsers.remove(id);
		}
	}
}
