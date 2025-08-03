package com.rendyrobbani.espresso.schema.data;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.UniqueKey;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@SuppressWarnings("ClassCanBeRecord")
public final class DataUniqueKey implements UniqueKey {

	private final String name;

	private final Table table;

	private final List<Column> columns;

}