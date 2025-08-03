package com.rendyrobbani.espresso.common.data.pegawai;

import com.rendyrobbani.espresso.common.data.gender.Gender;
import com.rendyrobbani.espresso.common.data.person.Personal;

import java.time.LocalDate;

public interface Pegawai extends Personal {

	LocalDate getBirthDate();

	LocalDate getStartDate();

	Gender getGender();

}