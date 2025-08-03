package com.rendyrobbani.espresso.schema.base;

public interface Column {

	String getName();

	String getSize();

	ColumnType getType();

	default String getTypeAndSize() {
		return this.getType().getDataType() + this.getSize();
	}

	boolean isNullable();

	boolean isPrimaryKey();

	boolean isAutoIncrement();

}