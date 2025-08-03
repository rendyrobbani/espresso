package com.rendyrobbani.espresso.common.impl.classify.subkegiatan;

import com.rendyrobbani.espresso.common.data.classify.fungsi.FungsiClassification;
import com.rendyrobbani.espresso.common.data.classify.subkegiatan.SubkegiatanClassification;
import com.rendyrobbani.espresso.common.data.classify.subkegiatan.SubkegiatanClassificationLevel;
import lombok.Getter;

@Getter
public class SubkegiatanClassificationImpl implements SubkegiatanClassification {

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

	private final SubkegiatanClassificationLevel level;

	private final FungsiClassification fungsi;

	public SubkegiatanClassificationImpl(String urusanPart, String bidangPart, String programPart, String kegiatanPart, String subkegiatanPart, SubkegiatanClassificationLevel level, FungsiClassification fungsi) {
		this.urusanPart = urusanPart;
		this.urusanCode = urusanPart;
		this.bidangPart = bidangPart;
		this.bidangCode = bidangPart != null ? this.urusanCode + "." + bidangPart : null;
		this.programPart = programPart;
		this.programCode = programPart != null ? this.bidangCode + "." + programPart : null;
		this.kegiatanPart = kegiatanPart;
		this.kegiatanCode = kegiatanPart != null ? this.programCode + "." + kegiatanPart : null;
		this.subkegiatanPart = subkegiatanPart;
		this.subkegiatanCode = subkegiatanPart != null ? this.kegiatanCode + "." + subkegiatanPart : null;
		this.level = level;
		this.fungsi = fungsi;
	}

	public SubkegiatanClassificationImpl(String urusanPart, String bidangPart, String programPart, String kegiatanPart, SubkegiatanClassificationLevel level, FungsiClassification fungsi) {
		this(urusanPart, bidangPart, programPart, kegiatanPart, null, level, fungsi);
	}

	public SubkegiatanClassificationImpl(String urusanPart, String bidangPart, String programPart) {
		this(urusanPart, bidangPart, programPart, null, null, null, null);
	}

	public SubkegiatanClassificationImpl(String urusanPart, String bidangPart) {
		this(urusanPart, bidangPart, null, null, null, null, null);
	}

	public SubkegiatanClassificationImpl(String urusanPart) {
		this(urusanPart, null, null, null, null, null, null);
	}

	public SubkegiatanClassificationImpl() {
		this(null, null, null, null, null, null, null);
	}

}