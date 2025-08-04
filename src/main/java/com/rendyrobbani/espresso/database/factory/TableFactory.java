package com.rendyrobbani.espresso.database.factory;

import com.rendyrobbani.espresso.database.Column;
import com.rendyrobbani.espresso.database.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TableFactory {

	@Getter
	private static final class TableImpl implements Table {

		private final String name;

		private final Column id;

		private final List<Column> columns;

		private TableImpl(String name, List<Column> columns, String columnIdName) {
			this.id = columns.stream().filter(c -> c.getName().equals(columnIdName)).findFirst().orElseThrow(() -> new IllegalArgumentException("Id column not found"));
			this.name = name;
			this.columns = columns;
		}

	}

	public static Table create(String name, List<Column> columns, String columnIdName) {
		return new TableImpl(name, columns, columnIdName);
	}

}