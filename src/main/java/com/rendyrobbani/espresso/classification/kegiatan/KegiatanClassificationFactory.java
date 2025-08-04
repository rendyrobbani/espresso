package com.rendyrobbani.espresso.classification.kegiatan;

import com.rendyrobbani.espresso.classification.fungsi.SubfungsiClassification;
import com.rendyrobbani.espresso.classification.fungsi.SubfungsiClassificationFactory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class KegiatanClassificationFactory {

	@Getter
	private static final class KegiatanClassificationImpl implements KegiatanClassification {

		private final String urusanPart;

		private final String urusanCode;

		private final String bidangPart;

		private final String bidangCode;

		private final String programPart;

		private final String programCode;

		private final String kegiatanPart;

		private final String kegiatanCode;

		private final SubfungsiClassification subfungsi;

		private KegiatanClassificationImpl(String urusanPart, String bidangPart, String programPart, String kegiatanPart) {
			this.urusanPart = urusanPart;
			this.bidangPart = bidangPart;
			this.programPart = programPart;
			this.kegiatanPart = kegiatanPart;

			this.urusanCode = this.urusanPart;
			this.bidangCode = this.urusanCode + "." + this.bidangPart;
			this.programCode = this.bidangCode + "." + this.programPart;
			this.kegiatanCode = this.programCode + "." + this.kegiatanPart;

			this.subfungsi = SubfungsiClassificationFactory.classifyFromKegiatanCode(this.kegiatanCode);
		}

	}

	public static KegiatanClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");
		var matcher = Pattern.compile(KegiatanClassification.KEGIATAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new KegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4));
		throw new IllegalArgumentException("Invalid code");
	}

}