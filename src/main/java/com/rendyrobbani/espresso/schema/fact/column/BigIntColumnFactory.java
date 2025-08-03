package com.rendyrobbani.espresso.schema.fact.column;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.data.column.BigIntColumn;

public final class BigIntColumnFactory {

	private BigIntColumnFactory() {
	}

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey, boolean isAutoIncrement) {
		return new BigIntColumn(name, isNullable, isPrimaryKey, isAutoIncrement);
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