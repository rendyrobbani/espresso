package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class BigIntColumn extends DataColumn {

	public BigIntColumn(String name, boolean isNullable, boolean isPrimaryKey, boolean isAutoIncrement) {
		super(name, "20", ColumnTypeEnum.BIGINT, isNullable, isPrimaryKey, isAutoIncrement);
	}

}