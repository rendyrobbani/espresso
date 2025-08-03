package com.rendyrobbani.espresso.schema.base.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Table;

import java.util.List;

public interface ForeignKey extends Constraint {

	List<Column> getColumns();

	Table getReferenceTable();

	List<Column> getReferenceColumns();

}