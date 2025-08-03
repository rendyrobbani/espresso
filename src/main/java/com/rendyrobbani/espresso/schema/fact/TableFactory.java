package com.rendyrobbani.espresso.schema.fact;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.impl.TableImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TableFactory {

	public static Table create(String name, List<Column> columns) {
		return new TableImpl(name, columns);
	}

}