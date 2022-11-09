package com.practicalunittesting.chp05_Mocks_Stubs_Test_Spies.types;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface TemplateEngine {
	String prepareMessage(Template template, Client client);
}
