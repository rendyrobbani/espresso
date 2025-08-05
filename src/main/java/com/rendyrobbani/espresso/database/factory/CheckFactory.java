package com.rendyrobbani.espresso.database.factory;

import com.rendyrobbani.espresso.database.Check;
import com.rendyrobbani.espresso.database.Table;
import com.rendyrobbani.espresso.util.number.NumberUtil;
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

	public static Check create(Integer index, Table table, String logic) {
		return create(String.join("_", "ck", table.getName().substring(0, Math.min(58, table.getName().length())), NumberUtil.lpadZero(index, 2)), table, logic);
	}

}