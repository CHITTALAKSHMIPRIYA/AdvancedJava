package com.bridgelabz;

public class TextEditor {
	private SpellChecker spellChecker;
	
	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void spellCheck()
	{
		spellChecker.CheckSpelling();
	}

}
