package com.tutiempolibro.customermanagement.commons;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Enum {

	FREE("FREE", 1),

	BRONCE("BRONCE", 2),

	PLATA("PLATA", 3),

	PREMIUN("PREMIUN", 4);

	public String value;
	public Integer anotherValue;

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	Enum(String value, Integer anotherValue) {
		this.value = value;
		this.anotherValue = anotherValue;
	}

	@JsonCreator
	public static Enum fromValue(String text) {
		for (Enum b : Enum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static Enum fromAnotherValue(Integer value) {
		return Arrays.asList(values()).stream().filter(val -> val.anotherValue == value).findAny().orElse(null);
	}

}