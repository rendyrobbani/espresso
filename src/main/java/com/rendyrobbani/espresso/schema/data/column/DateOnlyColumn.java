package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class DateOnlyColumn extends DataColumn {

	public DateOnlyColumn(String name, boolean isNullable, boolean isPrimaryKey) {
		super(name, null, ColumnTypeEnum.DATEONLY, isNullable, isPrimaryKey, false);
	}

}