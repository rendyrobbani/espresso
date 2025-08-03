package com.rendyrobbani.espresso.schema.fact.column.common;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.ColumnFactory;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeImpl;

public final class VarCharColumnFactory {

	private static final ColumnTypeImpl DEFAULT_TYPE = ColumnTypeImpl.VARCHAR;

	private static final Integer DEFAULT_SIZE = 255;

	public static Column create(String name, Integer size, boolean isNullable, boolean isPrimaryKey) {
		return ColumnFactory.create(name, size != null ? size.toString() : DEFAULT_SIZE.toString(), DEFAULT_TYPE, isNullable, isPrimaryKey, false);
	}

	public static Column create(String name, Integer size, boolean isNullable) {
		return create(name, size, isNullable, false);
	}

	public static Column create(String name, Integer size) {
		return create(name, size, true, false);
	}

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey) {
		return create(name, DEFAULT_SIZE, isNullable, isPrimaryKey);
	}

	public static Column create(String name, boolean isNullable) {
		return create(name, DEFAULT_SIZE, isNullable, false);
	}

	public static Column create(String name) {
		return create(name, DEFAULT_SIZE, true, false);
	}

}