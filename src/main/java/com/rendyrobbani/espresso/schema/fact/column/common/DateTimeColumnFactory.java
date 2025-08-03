package com.rendyrobbani.espresso.schema.fact.column.common;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.column.ColumnFactory;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DateTimeColumnFactory {

	private static final ColumnTypeImpl DEFAULT_TYPE = ColumnTypeImpl.DATETIME;

	private static final String DEFAULT_SIZE = null;

	public static Column create(String name, boolean isNullable) {
		return ColumnFactory.create(name, DEFAULT_SIZE, DEFAULT_TYPE, isNullable, false, false);
	}

	public static Column create(String name) {
		return create(name, true);
	}

}