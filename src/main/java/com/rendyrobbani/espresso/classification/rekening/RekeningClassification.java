package com.rendyrobbani.espresso.classification.rekening;

public interface RekeningClassification {

	String REKENING1_REGEX_VALUE = "(?!0|9)(\\d)";
	String REKENING1_REGEX_MATCH = REKENING1_REGEX_VALUE;
	String REKENING1_REGEX_GROUP = "^" + REKENING1_REGEX_MATCH + "$";
	String REKENING2_REGEX_VALUE = "(?!0)(\\d)";
	String REKENING2_REGEX_MATCH = REKENING1_REGEX_MATCH + "\\." + REKENING2_REGEX_VALUE;
	String REKENING2_REGEX_GROUP = "^" + REKENING2_REGEX_MATCH + "$";
	String REKENING3_REGEX_VALUE = "(?!0{2})(\\d{2})";
	String REKENING3_REGEX_MATCH = REKENING2_REGEX_MATCH + "\\." + REKENING3_REGEX_VALUE;
	String REKENING3_REGEX_GROUP = "^" + REKENING3_REGEX_MATCH + "$";
	String REKENING4_REGEX_VALUE = "(?!0{2})(\\d{2})";
	String REKENING4_REGEX_MATCH = REKENING3_REGEX_MATCH + "\\." + REKENING4_REGEX_VALUE;
	String REKENING4_REGEX_GROUP = "^" + REKENING4_REGEX_MATCH + "$";
	String REKENING5_REGEX_VALUE = "((?!0{2})\\d{2}|(?!0{3})\\d{3})";
	String REKENING5_REGEX_MATCH = REKENING4_REGEX_MATCH + "\\." + REKENING5_REGEX_VALUE;
	String REKENING5_REGEX_GROUP = "^" + REKENING5_REGEX_MATCH + "$";
	String REKENING6_REGEX_VALUE = "((?!0{4})\\d{4}|(?!0{5})\\d{5})";
	String REKENING6_REGEX_MATCH = REKENING5_REGEX_MATCH + "\\." + REKENING6_REGEX_VALUE;
	String REKENING6_REGEX_GROUP = "^" + REKENING6_REGEX_MATCH + "$";

	String getRekening1Part();

	default String getRekening1Code() {
		return this.getRekening1Part();
	}

	String getRekening2Part();

	default String getRekening2Code() {
		if (this.getRekening1Code() == null) return null;
		if (this.getRekening2Part() == null) return null;
		return this.getRekening1Code() + "." + this.getRekening2Part();
	}

	String getRekening3Part();

	default String getRekening3Code() {
		if (this.getRekening2Code() == null) return null;
		if (this.getRekening3Part() == null) return null;
		return this.getRekening2Code() + "." + this.getRekening3Part();
	}

	String getRekening4Part();

	default String getRekening4Code() {
		if (this.getRekening3Code() == null) return null;
		if (this.getRekening4Part() == null) return null;
		return this.getRekening3Code() + "." + this.getRekening4Part();
	}

	String getRekening5Part();

	default String getRekening5Code() {
		if (this.getRekening4Code() == null) return null;
		if (this.getRekening5Part() == null) return null;
		return this.getRekening4Code() + "." + this.getRekening5Part();
	}

	String getRekening6Part();

	default String getRekening6Code() {
		if (this.getRekening5Code() == null) return null;
		if (this.getRekening6Part() == null) return null;
		return this.getRekening5Code() + "." + this.getRekening6Part();
	}

	default RekeningClassificationType getType() {
		return RekeningClassificationType.fromValue(this.getRekening1Code());
	}

	default RekeningClassificationLevel getLevel() {
		if (this.getRekening6Code() != null) return RekeningClassificationLevel.SUBRINCIAN;
		if (this.getRekening5Code() != null) return RekeningClassificationLevel.RINCIAN;
		if (this.getRekening4Code() != null) return RekeningClassificationLevel.OBJEK;
		if (this.getRekening3Code() != null) return RekeningClassificationLevel.JENIS;
		if (this.getRekening2Code() != null) return RekeningClassificationLevel.KELOMPOK;
		if (this.getRekening1Code() != null) return RekeningClassificationLevel.AKUN;
		return null;
	}

}