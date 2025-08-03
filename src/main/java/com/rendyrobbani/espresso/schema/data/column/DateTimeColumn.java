package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class DateTimeColumn extends DataColumn {

	public DateTimeColumn(String name, boolean isNullable, boolean isPrimaryKey) {
		super(name, null, ColumnTypeEnum.DATETIME, isNullable, isPrimaryKey, false);
	}

}