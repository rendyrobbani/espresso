package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Schema;
import com.rendyrobbani.espresso.schema.base.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@SuppressWarnings("ClassCanBeRecord")
public final class SchemaImpl implements Schema {

	private final List<Table> tables;

	private final List<Constraint> checks;

	private final List<Constraint> uniqueKeys;

	private final List<Constraint> foreignKeys;

}