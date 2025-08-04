package com.rendyrobbani.espresso.database.factory;

import com.rendyrobbani.espresso.database.Column;
import com.rendyrobbani.espresso.database.ForeignKey;
import com.rendyrobbani.espresso.database.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ForeignKeyFactory {

	@Getter
	@SuppressWarnings("ClassCanBeRecord")
	@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
	private static final class ForeignKeyImpl implements ForeignKey {

		private final String name;

		private final Table table;

		private final List<Column> columns;

		private final Table referenceTable;

		private final List<Column> referenceColumns;

	}

	public static ForeignKey create(String name, Table table, List<Column> columns, Table referenceTable, List<Column> referenceColumns) {
		return new ForeignKeyImpl(name, table, columns, referenceTable, referenceColumns);
	}

}