package com.fa.training.service.common;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<T> implements IOperations<T> {
	@Override
	public T findOne(final int id) {
		return getDao().findOne(id);
	}

	@Override
	public T findOne(final String id) {
		return getDao().findOne(id);
	}

	@Override
	public List<T> findAll() {
		return getDao().findAll();
	}

	@Override
	public Serializable create(final T entity) {
		getDao().create(entity);
		return null;
	}

	@Override
	public void update(final T entity) {
//		return getDao().update(entity);
	}

	@Override
	public void delete(final T entity) {
		getDao().delete(entity);
	}

	@Override
	public void deleteById(final long entityId) {
		getDao().deleteById(entityId);
	}

	@Override
	public void deleteById(final String entityId) {
		getDao().deleteById(entityId);
	}

	@Override
	public long findRecordsCount() {
		return getDao().findRecordsCount();
	}

	protected abstract IOperations<T> getDao();

}
