package com.rendyrobbani.espresso.identify.factory;

import com.rendyrobbani.espresso.identify.Gender;
import com.rendyrobbani.espresso.identify.NIP;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NIPFactory {

	@Getter
	private static final class NIPImpl implements NIP {

		private final String value;

		private final LocalDate birthDate;

		private final LocalDate startDate;

		private final Gender gender;

		private final Integer number;

		public NIPImpl(String value) {
			if (value == null) throw new IllegalArgumentException("NIP cannot be null");
			if (value.isBlank()) throw new IllegalArgumentException("NIP cannot be blank");
			if (!value.matches(REGEX)) throw new IllegalArgumentException("Invalid NIP");
			this.value = value;
			this.birthDate = NIP.super.getBirthDate();
			this.startDate = NIP.super.getStartDate();
			this.gender = NIP.super.getGender();
			this.number = NIP.super.getNumber();
		}

	}

	public static NIP create(String value) {
		return new NIPImpl(value);
	}

}