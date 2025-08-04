package com.rendyrobbani.espresso.classification.program;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ProgramClassificationFactory {

	@Getter
	private static final class ProgramClassificationImpl implements ProgramClassification {

		private final String urusanPart;

		private final String urusanCode;

		private final String bidangPart;

		private final String bidangCode;

		private final String programPart;

		private final String programCode;

		private ProgramClassificationImpl(String urusanPart, String bidangPart, String programPart) {
			this.urusanPart = urusanPart;
			this.bidangPart = bidangPart;
			this.programPart = programPart;

			this.urusanCode = this.urusanPart;
			this.bidangCode = this.urusanCode + "." + this.bidangPart;
			this.programCode = this.bidangCode + "." + this.programPart;
		}

	}

	public static ProgramClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");
		var matcher = Pattern.compile(ProgramClassification.PROGRAM_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new ProgramClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3));
		throw new IllegalArgumentException("Invalid code");
	}

}