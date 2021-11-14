package com.fa.training.service.common;

import java.io.Serializable;
import java.util.List;

public interface IOperations<T> {
	T findOne(final int id);

	T findOne(final String id);

	List<T> findAll();

	Serializable create(final T entity);

	void update(final T entity);

	void delete(final T entity);

	void deleteById(final long entityId);

	void deleteById(final String entityId);

	long findRecordsCount();
}
