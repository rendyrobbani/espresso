package com.rendyrobbani.espresso.common.data.person;

import com.rendyrobbani.espresso.common.data.gender.Gender;

import java.time.LocalDateTime;

public interface Pegawai extends Personal {

	LocalDateTime getBirthDate();

	LocalDateTime getStartDate();

	Gender getGender();

}