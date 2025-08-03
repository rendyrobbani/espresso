package com.rendyrobbani.espresso.schema.data.column;

import com.rendyrobbani.espresso.schema.data.DataColumn;
import com.rendyrobbani.espresso.schema.impl.ColumnTypeEnum;
import lombok.Getter;

@Getter
public final class DecimalColumn extends DataColumn {

	public DecimalColumn(String name, Integer len, Integer dec, boolean isNullable, boolean isPrimaryKey) {
		super(name, String.join(", ", len == null ? "38" : len.toString(), dec == null ? "2" : dec.toString()), ColumnTypeEnum.DECIMAL, isNullable, isPrimaryKey, false);
	}

}