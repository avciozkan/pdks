package com.inomera.pdks.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

public class PdksUtil {

	public static String getHourOfTime(Timestamp timestamp) {
		if (Objects.isNull(timestamp)) {
			return "";
		}
		return getOfTime(timestamp, "hh:mm:ss");
	}

	public static String getDateOfTime(Timestamp timestamp) {
		if (Objects.isNull(timestamp)) {
			return "";
		}
		return getOfTime(timestamp, "dd/MM/yyyy");
	}
	
	private static String getOfTime(Timestamp timestamp, String convert) {
		Date date = new Date(timestamp.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat(convert);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		String formattedDate = sdf.format(date);
		return formattedDate;
	}
}
