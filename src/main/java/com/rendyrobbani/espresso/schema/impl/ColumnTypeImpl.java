package com.rendyrobbani.espresso.schema.impl;

import com.rendyrobbani.espresso.schema.base.ColumnType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum ColumnTypeImpl implements ColumnType {
	CHAR("char", String.class),
	VARCHAR("varchar", String.class),
	TINYINT("tinyint", Integer.class),
	SMALLINT("smallint", Integer.class),
	BIGINT("bigint", Long.class),
	BOOLEAN("bit", Boolean.class),
	DATEONLY("date", java.time.LocalDate.class),
	DATETIME("datetime", java.time.LocalDateTime.class),
	DECIMAL("decimal", java.math.BigDecimal.class);

	private final String dataType;

	private final Class<?> javaType;
}