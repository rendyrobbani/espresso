package com.rendyrobbani.espresso.common.data.pangkat;

import com.rendyrobbani.espresso.common.base.ValueAndTitle;

public interface PangkatASN extends ValueAndTitle<String> {

	String getRoman();

	String getBaseName();

	String getFullName();

	boolean isPNS();

	boolean isP3K();

}