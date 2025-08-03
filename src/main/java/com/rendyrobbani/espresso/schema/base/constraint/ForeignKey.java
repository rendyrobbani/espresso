package com.rendyrobbani.espresso.schema.base.constraint;

import com.rendyrobbani.espresso.schema.base.Column;
import com.rendyrobbani.espresso.schema.base.Constraint;
import com.rendyrobbani.espresso.schema.base.Table;

import java.util.List;

public interface ForeignKey extends Constraint {

	List<Column> getColumns();

	Table getReferenceTable();

	List<Column> getReferenceColumns();

	@Override
	default String getValue() {
		return String.join(" ",
				"foreign key",
				"(" + String.join(", ", this.getColumns().stream().map(Column::getName).toList()) + ")",
				"references",
				this.getReferenceTable().getName(),
				"(" + String.join(", ", this.getReferenceColumns().stream().map(Column::getName).toList()) + ")"
		);
	}

}