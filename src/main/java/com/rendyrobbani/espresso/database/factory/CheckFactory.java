package com.rendyrobbani.espresso.database.factory;

import com.rendyrobbani.espresso.database.Check;
import com.rendyrobbani.espresso.database.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CheckFactory {

	@Getter
	@SuppressWarnings("ClassCanBeRecord")
	@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
	private static final class CheckImpl implements Check {

		private final String name;

		private final Table table;

		private final String logic;

	}

	public static Check create(String name, Table table, String logic) {
		return new CheckImpl(name, table, logic);
	}

}