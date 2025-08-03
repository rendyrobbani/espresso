package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.ForeignKey;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@SuppressWarnings("ClassCanBeRecord")
public final class ForeignKeyImpl implements ForeignKey {

	private final String name;

	private final Table table;

	private final List<Column> columns;

	private final Table referenceTable;

	private final List<Column> referenceColumns;

}