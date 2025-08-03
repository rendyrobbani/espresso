package com.rendyrobbani.espresso.schema.fact;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.ColumnType;
import com.rendyrobbani.espresso.schema.impl.ColumnImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ColumnFactory {

	public static Column create(String name, String size, ColumnType type, boolean isNullable, boolean isPrimaryKey, boolean isAutoIncrement) {
		return new ColumnImpl(name, size, type, isNullable, isPrimaryKey, isAutoIncrement);
	}

	public static Column copyOf(Column column, String name, boolean isNullable, boolean isPrimaryKey) {
		return new ColumnImpl(name, column.getSize(), column.getType(), isNullable, isPrimaryKey, column.isAutoIncrement());
	}

}