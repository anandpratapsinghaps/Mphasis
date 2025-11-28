package com.example.abstractfactory;

//This is the blueprint for creating families of objects.
/**
 * It guarantees that any factory will produce:
 * a Sound
 * a Type
 */
interface AnimalFactory {
	Sound createSound();

	Type createType();
}
