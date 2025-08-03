package com.rendyrobbani.espresso.common.data.person;

import com.rendyrobbani.espresso.common.base.NIP;
import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.data.pangkat.PangkatASN;

import java.time.LocalDateTime;

public interface PegawaiASN extends Pegawai, NIP {

	PangkatASN getPangkat();

	@Override
	default LocalDateTime getBirthDate() {
		return NIP.super.getBirthDate();
	}

	@Override
	default LocalDateTime getStartDate() {
		return NIP.super.getStartDate();
	}

	@Override
	default Gender getGender() {
		return NIP.super.getGender();
	}

}