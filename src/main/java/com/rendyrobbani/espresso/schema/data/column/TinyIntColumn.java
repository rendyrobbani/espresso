package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class TinyIntColumn extends DataColumn {

	public TinyIntColumn(String name, boolean isNullable, boolean isPrimaryKey) {
		super(name, "4", ColumnTypeEnum.TINYINT, isNullable, isPrimaryKey, false);
	}

}