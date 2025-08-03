package com.rendyrobbani.espresso.schema.fact.column;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.data.column.DateOnlyColumn;

public final class DateOnlyColumnFactory {

	private DateOnlyColumnFactory() {
	}

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey) {
		return new DateOnlyColumn(name, isNullable, isPrimaryKey);
	}

	public static Column create(String name, boolean isNullable) {
		return create(name, isNullable, false);
	}

	public static Column create(String name) {
		return create(name, true, false);
	}

}