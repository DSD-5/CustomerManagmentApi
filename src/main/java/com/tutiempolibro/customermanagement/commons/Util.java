package com.tutiempolibro.customermanagement.commons;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

public class Util {
	
	
	
	
    public static void generateTracking() {
	Thread.currentThread().setName(UUID.randomUUID().toString().replace("-", ""));
    }

    public static String getTracking() {
	return Thread.currentThread().getName();
    }

	/**
	 * Método de formato de fecha y hora utilizado en la clase LoggingAspect.
	 * 
	 * @return date
	 */
	public static String getDateTimeFormatter() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(Constant.DATE_TIME);
		LocalDateTime localDateTime = LocalDateTime.now();
		String date = dateTimeFormatter.format(localDateTime);
		return date;
	}

	/**
	 * Método de formato de fecha y hora utilizado en el response (Json).
	 * 
	 * @return OffsetDateTime
	 */
	public static OffsetDateTime getOffsetDateTime(Date date) {
		Instant instantFromDate = date.toInstant();
		ZoneOffset zoneOffSet = ZoneOffset.of("-05:00");
		OffsetDateTime offsetdatetime = instantFromDate.atOffset(zoneOffSet);

		return offsetdatetime;
	}

	public static String getDateFormat(Date date, String exp) {
		SimpleDateFormat sdf = new SimpleDateFormat(exp);
		return sdf.format(date);
	}
	
	
    public static String generateCodCliente(String idcliente) {
    	return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toUpperCase() + "-"+idcliente;
    }
	
}
