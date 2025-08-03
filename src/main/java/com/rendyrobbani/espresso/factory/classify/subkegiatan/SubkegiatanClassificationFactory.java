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

	public static SubkegiatanClassification classify(String code) {
		Matcher matcher;

		matcher = Pattern.compile(SubkegiatanClassification.SUBKEGIATAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), SubkegiatanClassificationLevelImpl.SUBKEGIATAN, FungsiClassificationFactory.classifyFromKegiatanCode(code));

		matcher = Pattern.compile(SubkegiatanClassification.KEGIATAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), null, SubkegiatanClassificationLevelImpl.KEGIATAN, FungsiClassificationFactory.classifyFromKegiatanCode(code));

		matcher = Pattern.compile(SubkegiatanClassification.PROGRAM_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), matcher.group(3), null, null, SubkegiatanClassificationLevelImpl.PROGRAM, null);

		matcher = Pattern.compile(SubkegiatanClassification.BIDANG_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), matcher.group(2), null, null, null, SubkegiatanClassificationLevelImpl.BIDANG, null);

		matcher = Pattern.compile(SubkegiatanClassification.URUSAN_REGEX_GROUP).matcher(code);
		if (matcher.matches()) return new SubkegiatanClassificationImpl(matcher.group(1), null, null, null, null, SubkegiatanClassificationLevelImpl.URUSAN, null);

		return null;
	}

}