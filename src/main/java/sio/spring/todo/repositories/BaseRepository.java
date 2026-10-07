package sio.spring.todo.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import sio.spring.todo.entities.BaseObject;

public class BaseRepository<T extends BaseObject, ID> implements RepositoryInterface<T, ID> {
	private Map<ID, T> internalObjects = new HashMap<ID, T>();

	@Override
	public T save(T entity) {
		internalObjects.put((ID) entity.getId(), entity);
		return entity;
	}

	@Override
	public Optional<T> findById(ID id) {
		if (internalObjects.containsKey(id)) {
			return Optional.of(internalObjects.get(id));
		}
		return Optional.empty();
	}

	@Override
	public List<T> findAll() {
		return new ArrayList<T>(internalObjects.values());
	}

	@Override
	public void deleteById(ID id) {
		if (internalObjects.containsKey(id)) {
			internalObjects.remove(id);
		}
	}
}
