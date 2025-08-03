package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.ForeignKey;
import com.rendyrobbani.espresso.schema.impl.ForeignKeyImpl;
import com.rendyrobbani.espresso.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ForeignKeyFactory {

	public static ForeignKey create(String name, Table table, List<Column> columns, Table referenceTable, List<Column> referenceColumns) {
		return new ForeignKeyImpl(name, table, columns, referenceTable, referenceColumns);
	}

	public static String createSimpleName(Table table, Integer index) {
		var tableName = table.getName();
		if (tableName.length() > 58) tableName = tableName.substring(0, 58);
		return String.join("_", "fk" + tableName + NumberUtil.lpadZero(index, 2));
	}

}