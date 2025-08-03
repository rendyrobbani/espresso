package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.Check;
import com.rendyrobbani.espresso.schema.impl.CheckImpl;
import com.rendyrobbani.espresso.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CheckFactory {

	public static String createSimpleName(Table table, Integer index) {
		var tableName = table.getName();
		if (tableName.length() > 58) tableName = tableName.substring(0, 58);
		return String.join("_", "ck", tableName, NumberUtil.lpadZero(index, 2));
	}

	public static Check create(String name, Table table, String logic) {
		return new CheckImpl(name, table, logic);
	}

	public static Check createColumnEqualValue(String name, Table table, Column column, String value) {
		return create(name, table, column.getName() + " = " + value);
	}

	public static Check createColumnEqualColumn(String name, Table table, Column column1, Column column2) {
		return createColumnEqualValue(name, table, column1, column2.getName());
	}

	public static Check createColumnLikeValue(String name, Table table, Column column, String value) {
		return create(name, table, column.getName() + " like " + value);
	}

	public static Check createColumnLikeColumn(String name, Table table, Column column1, Column column2) {
		return createColumnLikeValue(name, table, column1, column2.getName());
	}

	public static Check createColumnMatchPattern(String name, Table table, Column column, String pattern) {
		return create(name, table, column.getName() + " regexp '" + pattern + "'");
	}

}