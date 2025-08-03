package com.rendyrobbani.espresso.factory.classify.subkegiatan;

import com.rendyrobbani.espresso.common.data.classify.subkegiatan.SubkegiatanClassification;
import com.rendyrobbani.espresso.common.impl.classify.subkegiatan.SubkegiatanClassificationImpl;
import com.rendyrobbani.espresso.common.impl.classify.subkegiatan.SubkegiatanClassificationLevelImpl;
import com.rendyrobbani.espresso.factory.classify.fungsi.FungsiClassificationFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SubkegiatanClassificationFactory {

	public static final String URUSAN_REGEX_VALUE = "([X0-9])";

	public static final String URUSAN_REGEX_GROUP = "^" + URUSAN_REGEX_VALUE + "$";

	public static final String BIDANG_REGEX_VALUE = URUSAN_REGEX_VALUE + "\\." + "([X0-9]{2})";

	public static final String BIDANG_REGEX_GROUP = "^" + BIDANG_REGEX_VALUE + "$";

	public static final String PROGRAM_REGEX_VALUE = BIDANG_REGEX_VALUE + "\\." + "([0-9]{2})";

	public static final String PROGRAM_REGEX_GROUP = "^" + PROGRAM_REGEX_VALUE + "$";

	public static final String KEGIATAN_REGEX_VALUE = PROGRAM_REGEX_VALUE + "\\." + "([0-9]\\.[0-9]{2})";

	public static final String KEGIATAN_REGEX_GROUP = "^" + KEGIATAN_REGEX_VALUE + "$";

	public static final String SUBKEGIATAN_REGEX_VALUE = KEGIATAN_REGEX_VALUE + "\\." + "([0-9]{4})";

	public static final String SUBKEGIATAN_REGEX_GROUP = "^" + SUBKEGIATAN_REGEX_VALUE + "$";

	public static SubkegiatanClassification classify(String code) {
		Matcher matcher;

		matcher = Pattern.compile(SUBKEGIATAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), SubkegiatanClassificationLevelImpl.SUBKEGIATAN, FungsiClassificationFactory.classifyFromKegiatanCode(code));

		matcher = Pattern.compile(KEGIATAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), null, SubkegiatanClassificationLevelImpl.KEGIATAN, FungsiClassificationFactory.classifyFromKegiatanCode(code));

		matcher = Pattern.compile(PROGRAM_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), null, null, SubkegiatanClassificationLevelImpl.PROGRAM, null);

		matcher = Pattern.compile(BIDANG_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), null, null, null, SubkegiatanClassificationLevelImpl.BIDANG, null);

		matcher = Pattern.compile(URUSAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), null, null, null, null, SubkegiatanClassificationLevelImpl.URUSAN, null);

		return null;
	}

}