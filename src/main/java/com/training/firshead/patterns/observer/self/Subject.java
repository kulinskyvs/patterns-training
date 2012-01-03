/**
 * 
 */
package com.training.firshead.patterns.observer.self;


/**
 * @author vkulinsky
 * date: 03.01.2012
 * time: 23:21:45
 *
 */
public interface Subject {

	void registerObserver(Observer observer);
	
	void deleteObserver(Observer observer);
	
	void notifyObservers();
}
