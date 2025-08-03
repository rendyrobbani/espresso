package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.UniqueKey;
import com.rendyrobbani.espresso.schema.impl.UniqueKeyImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UniqueKeyFactory {

	public static UniqueKey create(String name, Table table, List<Column> columns) {
		return new UniqueKeyImpl(name, table, columns);
	}

}