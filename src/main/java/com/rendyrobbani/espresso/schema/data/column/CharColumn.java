package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class CharColumn extends DataColumn {

	public CharColumn(String name, Integer size, boolean isNullable, boolean isPrimaryKey) {
		super(name, size.toString(), ColumnTypeEnum.CHAR, isNullable, isPrimaryKey, false);
	}

}