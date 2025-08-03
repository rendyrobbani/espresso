package com.rendyrobbani.espresso.schema.base.constraint;

import com.rendyrobbani.espresso.schema.base.Constraint;

public interface Check extends Constraint {

	String getLogic();

	@Override
	default String getValue() {
		return "check (" + this.getLogic() + ")";
	}

	@Override
	default String getCreateDDL() {
		return String.join(" ", "alter table", this.getTable().getName(), "add constraint", this.getName(), this.getValue());
	}

}