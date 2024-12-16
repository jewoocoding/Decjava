package com.dec.day11.oop.interfacepkg.musician;

public class Stage {	
	public static void main(String[] args) {
		Musician musician = new Musician();
		musician.play(new Cello());
		musician.play(new Drum());
		musician.play(new Guitar());
	}
}
