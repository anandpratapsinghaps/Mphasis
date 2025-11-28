package com.example.abstractfactory;

//Every animal sound must implement makeSound().
interface Sound {
	void makeSound();
}

//Every animal type must say whether it’s pet / wild.
interface Type {
	void showType();
}
