package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Table;
import lombok.Getter;

import java.util.List;

@Getter
public final class TableImpl implements Table {

	String name;

	Column columnId;

	List<Column> columns;

}