package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class BooleanColumn extends DataColumn {

	public BooleanColumn(String name, boolean isNullable, boolean isPrimaryKey) {
		super(name, "1", ColumnTypeEnum.BOOLEAN, isNullable, isPrimaryKey, false);
	}

}