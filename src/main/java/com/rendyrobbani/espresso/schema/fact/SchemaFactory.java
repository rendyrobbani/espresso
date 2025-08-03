package com.rendyrobbani.espresso.schema.fact;

import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Schema;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.impl.SchemaImpl;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SchemaFactory {

	public static Schema create(List<Table> tables, List<Constraint> checks, List<Constraint> uniqueKeys, List<Constraint> foreignKeys) {
		return new SchemaImpl(tables, checks, uniqueKeys, foreignKeys);
	}

}