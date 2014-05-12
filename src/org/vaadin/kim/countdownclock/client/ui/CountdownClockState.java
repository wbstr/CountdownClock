package org.vaadin.kim.countdownclock.client.ui;

import com.vaadin.shared.AbstractComponentState;

public class CountdownClockState extends AbstractComponentState {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2111850091485279585L;

	/**
	 * Defines the format in which the countdown clock should show the remaining
	 * time
	 */
	private String timeFormat;

	/**
	 * Number of milliseconds to count
	 */
	private Long countdownTarget;

	public String getTimeFormat() {
		return timeFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public Long getCountdownTarget() {
		return countdownTarget;
	}

	public void setCountdownTarget(Long countdownTarget) {
		this.countdownTarget = countdownTarget;
	}

}
