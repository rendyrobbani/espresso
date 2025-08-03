package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class VarCharColumn extends DataColumn {

	public VarCharColumn(String name, Integer size, boolean isNullable, boolean isPrimaryKey) {
		super(name, size.toString(), ColumnTypeEnum.VARCHAR, isNullable, isPrimaryKey, false);
	}

}