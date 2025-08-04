package com.rendyrobbani.espresso.classification.rekening;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RekeningClassificationFactory {

	@Getter
	@SuppressWarnings("ClassCanBeRecord")
	private static final class RekeningClassificationImpl implements RekeningClassification {

		private final String rekening1Part;

		private final String rekening2Part;

		private final String rekening3Part;

		private final String rekening4Part;

		private final String rekening5Part;

		private final String rekening6Part;

		public RekeningClassificationImpl(String rekening1Part, String rekening2Part, String rekening3Part, String rekening4Part, String rekening5Part, String rekening6Part) {
			this.rekening1Part = rekening1Part;
			this.rekening2Part = rekening2Part;
			this.rekening3Part = rekening3Part;
			this.rekening4Part = rekening4Part;
			this.rekening5Part = rekening5Part;
			this.rekening6Part = rekening6Part;
		}

	}

	public static RekeningClassification classify(String code) {
		if (code == null) throw new IllegalArgumentException("code cannot be null");

		var codes = new ArrayList<String>();
		for (int level = 6; level > 0; level--) {
			var regex = switch (level) {
				case 1 -> RekeningClassification.REKENING1_REGEX_GROUP;
				case 2 -> RekeningClassification.REKENING2_REGEX_GROUP;
				case 3 -> RekeningClassification.REKENING3_REGEX_GROUP;
				case 4 -> RekeningClassification.REKENING4_REGEX_GROUP;
				case 5 -> RekeningClassification.REKENING5_REGEX_GROUP;
				case 6 -> RekeningClassification.REKENING6_REGEX_GROUP;
				default -> throw new IllegalArgumentException("invalid level");
			};
			var matcher = Pattern.compile(regex).matcher(code);
			if (matcher.matches()) {
				for (int i = 1; i <= matcher.groupCount(); i++) codes.add(matcher.group(i));
				break;
			}
		}

		System.out.println(codes);

		if (!codes.isEmpty()) return new RekeningClassificationImpl(
				codes.get(0),
				codes.size() > 1 ? codes.get(1) : null,
				codes.size() > 2 ? codes.get(2) : null,
				codes.size() > 3 ? codes.get(3) : null,
				codes.size() > 4 ? codes.get(4) : null,
				codes.size() > 5 ? codes.get(5) : null
		);

		throw new IllegalArgumentException("Invalid code");
	}

}