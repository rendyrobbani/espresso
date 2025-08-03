package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class SmallIntColumn extends DataColumn {

	public SmallIntColumn(String name, boolean isNullable, boolean isPrimaryKey) {
		super(name, "6", ColumnTypeEnum.SMALLINT, isNullable, isPrimaryKey, false);
	}

}