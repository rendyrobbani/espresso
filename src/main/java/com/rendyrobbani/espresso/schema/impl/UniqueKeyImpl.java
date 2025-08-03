package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.UniqueKey;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
@SuppressWarnings("ClassCanBeRecord")
public final class UniqueKeyImpl implements UniqueKey {

	private final String name;

	private final Table table;

	private final List<Column> columns;

}