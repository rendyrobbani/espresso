package com.rendyrobbani.espresso.schema.fact.column.special;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.data.column.CharColumn;

public final class NIPColumnFactory {

	private NIPColumnFactory() {
	}

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey) {
		return new CharColumn(name, 18, isNullable, isPrimaryKey);
	}

	public static Column create(String name, boolean isNullable) {
		return create(name, isNullable, false);
	}

	public static Column create(String name) {
		return create(name, true, false);
	}

}