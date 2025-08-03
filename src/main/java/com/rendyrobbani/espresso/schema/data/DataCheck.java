package com.rendyrobbani.espresso.schema.data;

import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.Check;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@SuppressWarnings("ClassCanBeRecord")
public final class DataCheck implements Check {

	private final String name;

	private final Table table;

	private final String logic;

}