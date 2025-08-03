package com.rendyrobbani.espresso.common.data.pegawai;

import com.rendyrobbani.espresso.common.base.NIP;
import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;

import java.time.LocalDate;

public interface PegawaiASN extends Pegawai, NIP {

	PangkatASN getPangkat();

	@Override
	default LocalDate getBirthDate() {
		return NIP.super.getBirthDate();
	}

	@Override
	default LocalDate getStartDate() {
		return NIP.super.getStartDate();
	}

	@Override
	default Gender getGender() {
		return NIP.super.getGender();
	}

}