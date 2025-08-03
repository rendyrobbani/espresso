package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.Table;
import com.rendyrobbani.espresso.schema.base.constraint.Check;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@SuppressWarnings("ClassCanBeRecord")
public final class CheckImpl implements Check {

	private final String name;

	private final Table table;

	private final String logic;

}