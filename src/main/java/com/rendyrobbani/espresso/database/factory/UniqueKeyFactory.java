package com.rendyrobbani.espresso.database.factory;

import com.rendyrobbani.espresso.database.Column;
import com.rendyrobbani.espresso.database.Table;
import com.rendyrobbani.espresso.database.UniqueKey;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UniqueKeyFactory {

	@Getter
	@SuppressWarnings("ClassCanBeRecord")
	@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
	private static final class UniqueKeyImpl implements UniqueKey {

		private final String name;

		private final Table table;

		private final List<Column> columns;

	}

	public static UniqueKey create(String name, Table table, List<Column> columns) {
		return new UniqueKeyImpl(name, table, columns);
	}

}