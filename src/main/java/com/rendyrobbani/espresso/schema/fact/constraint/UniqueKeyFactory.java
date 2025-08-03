package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.UniqueKey;
import com.rendyrobbani.espresso.schema.impl.UniqueKeyImpl;
import com.rendyrobbani.espresso.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UniqueKeyFactory {

	public static UniqueKey create(String name, Table table, List<Column> columns) {
		return new UniqueKeyImpl(name, table, columns);
	}

	public static String createSimpleName(Table table, Integer index) {
		var tableName = table.getName();
		if (tableName.length() > 58) tableName = tableName.substring(0, 58);
		return String.join("_", "uk", tableName, NumberUtil.lpadZero(index, 2));
	}

}