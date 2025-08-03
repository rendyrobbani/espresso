package com.rendyrobbani.espresso.schema.fact.column;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.data.column.VarCharColumn;

public final class VarCharColumnFactory {

	private static final Integer DEFAULT_SIZE = 255;

	private VarCharColumnFactory() {
	}

	public static Column create(String name, Integer size, boolean isNullable, boolean isPrimaryKey) {
		return new VarCharColumn(name, size, isNullable, isPrimaryKey);
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