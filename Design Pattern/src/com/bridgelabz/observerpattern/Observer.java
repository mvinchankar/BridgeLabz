package com.bridgelabz.observerpattern;

public interface Observer {
	
	/**
	 * method to update the observer, used by subject
	 */
	public void update();
	
	/**
	 * attach with subject to observe
	 * @param sub
	 */
	public void setSubject(Subject sub);
}