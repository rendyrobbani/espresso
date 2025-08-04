package com.rendyrobbani.espresso.database;

public interface Column {

	String getName();

	String getSize();

	boolean isNullable();

	boolean isPrimaryKey();

	boolean isAutoIncrement();

	ColumnType getType();

	default String getTypeAndSize() {
		return this.getType().getDataType() + this.getSize();
	}

}