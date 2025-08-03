package com.rendyrobbani.espresso.schema.fact.column.special;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.fact.column.common.CharColumnFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NIPColumnFactory {

	public static Column create(String name, boolean isNullable, boolean isPrimaryKey) {
		return CharColumnFactory.create(name, 18, isNullable, isPrimaryKey);
	}

	public static Column create(String name, boolean isNullable) {
		return create(name, isNullable, false);
	}

	public static Column create(String name) {
		return create(name, true, false);
	}

}