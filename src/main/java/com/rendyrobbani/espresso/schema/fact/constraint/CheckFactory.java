package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.Check;
import com.rendyrobbani.espresso.schema.impl.CheckImpl;
import com.rendyrobbani.espresso.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CheckFactory {

	public static Check create(String name, Table table, String logic) {
		return new CheckImpl(name, table, logic);
	}

	public static String createSimpleName(Table table, Integer index) {
		var tableName = table.getName();
		if (tableName.length() > 58) tableName = tableName.substring(0, 58);
		return String.join("_", "ck" + tableName + NumberUtil.lpadZero(index, 2));
	}

}