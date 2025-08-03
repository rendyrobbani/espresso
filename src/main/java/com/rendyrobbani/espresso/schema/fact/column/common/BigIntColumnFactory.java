package com.rendyrobbani.espresso.schema.fact.column.common;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.column.ColumnFactory;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BigIntColumnFactory {

	private static final ColumnTypeImpl DEFAULT_TYPE = ColumnTypeImpl.BIGINT;

	private static final String DEFAULT_SIZE = "20";

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey, boolean isAutoIncrement) {
		return ColumnFactory.create(name, DEFAULT_SIZE, DEFAULT_TYPE, isNullable, isPrimaryKey, isAutoIncrement);
	}

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey) {
		return create(name, isNullable, isPrimaryKey, false);
	}

	public static Column create(String name, boolean isNullable) {
		return create(name, isNullable, false);
	}

	public static Column create(String name) {
		return create(name, true, false);
	}

}