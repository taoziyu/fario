/**
 * 
 */
package com.taobao.fario.server.service;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author taichan
 * 
 */

public class LocationInfo {
	private static final String TAG = "LocationInfo";

	private String time;
	private String latitude;
	private String longitude;
	// private String speed;
	// private String bearing;
	private String altitude;
	private String accuracy;
	private String username;

	/**
	 * @param time
	 * @param latitude
	 * @param longitude
	 * @param altitude
	 * @param accuracy
	 * @param username
	 */
	public LocationInfo(String time, String latitude, String longitude,
			String altitude, String accuracy, String username) {
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.accuracy = accuracy;
		this.username = username;
	}

	@Override
	public String toString() {
		SimpleDateFormat timeFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date = new Date(Long.parseLong(this.time));

		StringBuffer sb = new StringBuffer();
		sb.append("Time: ").append(timeFormat.format(date)).append("\n")
				.append("Latitude: ").append(this.latitude).append("\n")
				.append("Longitude: ").append(this.longitude).append("\n")
				.append("Altitude: ").append(this.altitude).append("\n")
				.append("Accuracy: ").append(this.accuracy).append("\n")
				.append("Username: ").append(this.username).append("\n");

		return sb.toString();
	}

}
