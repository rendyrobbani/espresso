package com.rendyrobbani.espresso.classification.organisasi;

import com.rendyrobbani.espresso.classification.urusan.BidangClassification;

import java.util.List;

public interface OrganisasiClassification {

	String ORGANISASI_REGEX_VALUE = String.join("\\.", BidangClassification.BIDANG_REGEX_VALUE, BidangClassification.BIDANG_REGEX_VALUE, BidangClassification.BIDANG_REGEX_VALUE, "([0-9]{2})", "([0-9]{4})");
	String ORGANISASI_REGEX_GROUP = "^" + ORGANISASI_REGEX_VALUE + "$";

	String getSkpdCode();

	String getUnitCode();

	List<BidangClassification> getListBidang();

}