package com.rendyrobbani.espresso.classification.urusan;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BidangClassificationFactory {

	@Getter
	private static final class BidangClassificationImpl implements BidangClassification {

		private final String urusanPart;

		private final String urusanCode;

		private final String bidangPart;

		private final String bidangCode;

		private BidangClassificationImpl(String urusanPart, String bidangPart) {
			this.urusanPart = urusanPart;
			this.bidangPart = bidangPart;

			this.urusanCode = this.urusanPart;
			this.bidangCode = this.urusanCode + "." + this.bidangPart;
		}

	}

	public static BidangClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");
		var matcher = Pattern.compile(BidangClassification.BIDANG_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new BidangClassificationImpl(matcher.group(1), matcher.group(2));
		throw new IllegalArgumentException("Invalid code");
	}

}