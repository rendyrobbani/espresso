package com.rendyrobbani.espresso.schema.fact.column.common;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.ColumnFactory;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BooleanColumnFactory {

	private static final ColumnTypeImpl DEFAULT_TYPE = ColumnTypeImpl.BOOLEAN;

	private static final String DEFAULT_SIZE = "1";

	public static Column create(String name, boolean isNullable) {
		return ColumnFactory.create(name, DEFAULT_SIZE, DEFAULT_TYPE, isNullable, false, false);
	}

	public static Column create(String name) {
		return create(name, true);
	}

}