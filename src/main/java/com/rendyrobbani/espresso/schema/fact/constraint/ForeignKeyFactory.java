package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.ForeignKey;
import com.rendyrobbani.espresso.schema.data.DataForeignKey;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ForeignKeyFactory {

	public static ForeignKey create(String name, Table table, List<Column> columns, Table referenceTable, List<Column> referenceColumns) {
		return new DataForeignKey(name, table, columns, referenceTable, referenceColumns);
	}

}