package com.rendyrobbani.espresso.schema.fact.constraint;

import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.Check;
import com.rendyrobbani.espresso.schema.data.DataCheck;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CheckFactory {

	public static Check create(String name, Table table, String logic) {
		return new DataCheck(name, table, logic);
	}

}