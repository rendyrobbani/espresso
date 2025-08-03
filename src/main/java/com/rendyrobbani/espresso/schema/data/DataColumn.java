package com.rendyrobbani.espresso.schema.data;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.ColumnType;
import lombok.Getter;

@Getter
public class DataColumn implements Column {

	protected final String name;

	protected final String size;

	protected final ColumnType type;

	protected final boolean isNullable;

	protected final boolean isPrimaryKey;

	protected final boolean isAutoIncrement;

	public DataColumn(String name, String size, ColumnType type, boolean isNullable, boolean isPrimaryKey, boolean isAutoIncrement) {
		this.name = name;
		this.size = size == null ? "" : "(" + size + ")";
		this.type = type;
		this.isAutoIncrement = isAutoIncrement && type.getJavaType().equals(Long.class);
		this.isPrimaryKey = isPrimaryKey || this.isAutoIncrement;
		this.isNullable = isNullable && !this.isPrimaryKey;
	}

}