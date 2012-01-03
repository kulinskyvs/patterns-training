/**
 * 
 */
package com.training.firshead.patterns.observer.self;


/**
 * @author vkulinsky
 * date: 03.01.2012
 * time: 23:21:55
 *
 */
public interface Observer {

	void update(float temp, float humidity, float pressure);
}
