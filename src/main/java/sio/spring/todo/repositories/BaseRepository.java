package sio.spring.todo.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import sio.spring.todo.entities.BaseObject;

@org.springframework.stereotype.Repository
public class BaseRepository<T extends BaseObject, ID> implements RepositoryInterface<T, ID> {
	private Map<ID, T> internalUsers = new HashMap<ID, T>();

	@Override
	public T save(T entity) {
		internalUsers.put((ID) entity.getId(), entity);
		return entity;
	}

	@Override
	public Optional<T> findById(ID id) {
		if (internalUsers.containsKey(id)) {
			return Optional.of(internalUsers.get(id));
		}
		return Optional.empty();
	}

	@Override
	public List<T> findAll() {
		return new ArrayList<T>(internalUsers.values());
	}

	@Override
	public void deleteById(ID id) {
		if (internalUsers.containsKey(id)) {
			internalUsers.remove(id);
		}
	}
}
