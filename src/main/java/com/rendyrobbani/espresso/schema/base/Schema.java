package com.rendyrobbani.espresso.schema.base;

import java.util.List;

public interface Schema {

	List<Table> getTables();

	List<Constraint> getChecks();

	List<Constraint> getUniqueKeys();

	List<Constraint> getForeignKeys();

}