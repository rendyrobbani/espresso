package com.rendyrobbani.espresso.classification.kegiatan;

import com.rendyrobbani.espresso.classification.fungsi.SubfungsiClassification;
import com.rendyrobbani.espresso.classification.fungsi.SubfungsiClassificationFactory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SubkegiatanClassificationFactory {

	@Getter
	private static final class SubkegiatanClassificationImpl implements SubkegiatanClassification {

		private final String urusanPart;

		private final String urusanCode;

		private final String bidangPart;

		private final String bidangCode;

		private final String programPart;

		private final String programCode;

		private final String kegiatanPart;

		private final String kegiatanCode;

		private final String subkegiatanPart;

		private final String subkegiatanCode;

		private final SubfungsiClassification subfungsi;

		private SubkegiatanClassificationImpl(String urusanPart, String bidangPart, String programPart, String kegiatanPart, String subkegiatanPart) {
			this.urusanPart = urusanPart;
			this.bidangPart = bidangPart;
			this.programPart = programPart;
			this.kegiatanPart = kegiatanPart;
			this.subkegiatanPart = subkegiatanPart;

			this.urusanCode = this.urusanPart;
			this.bidangCode = this.urusanCode + "." + this.bidangPart;
			this.programCode = this.bidangCode + "." + this.programPart;
			this.kegiatanCode = this.programCode + "." + this.kegiatanPart;
			this.subkegiatanCode = this.kegiatanCode + "." + this.subkegiatanPart;

			this.subfungsi = SubfungsiClassificationFactory.classifyFromKegiatanCode(this.kegiatanCode);
		}

	}

	public static SubkegiatanClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");
		var matcher = Pattern.compile(SubkegiatanClassification.SUBKEGIATAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5));
		throw new IllegalArgumentException("Invalid code");
	}

}