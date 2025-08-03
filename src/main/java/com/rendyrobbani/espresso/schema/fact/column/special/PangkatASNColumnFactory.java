package com.rendyrobbani.espresso.schema.fact.column.special;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.data.column.CharColumn;

public final class PangkatASNColumnFactory {

	private PangkatASNColumnFactory() {
	}

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey) {
		return new CharColumn(name, 2, isNullable, isPrimaryKey);
	}

	public static Column create(String name, boolean isNullable) {
		return create(name, isNullable, false);
	}

	public static Column create(String name) {
		return create(name, true, false);
	}

}