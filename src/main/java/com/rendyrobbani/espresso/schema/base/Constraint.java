package com.rendyrobbani.espresso.schema.base;

public interface Constraint {

	Table getTable();

	String getName();

	String getValue();

	default String getDeleteDDL(boolean useIfExists) {
		return String.join(" ", "alter table", this.getTable().getName(), "drop constraint" + (useIfExists ? " if exists" : ""), this.getName());
	}

	default String getDeleteDDL() {
		return this.getDeleteDDL(false);
	}

	String getCreateDDL();

}