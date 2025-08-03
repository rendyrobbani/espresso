package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import lombok.Getter;

import java.util.List;

@Getter
public final class TableImpl implements Table {

	private final String name;

	private final Column columnId;

	private final List<Column> columns;

	public TableImpl(String name, List<Column> columns) {
		this.name = name;
		this.columns = columns;
		this.columnId = columns.stream().filter(Column::isPrimaryKey).findFirst().orElse(null);

		if (this.columnId == null) throw new IllegalArgumentException("Table " + name + " must have a primary key");
	}

}