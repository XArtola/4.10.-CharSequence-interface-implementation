package com.zubiri.charSequence;

public class CharSequence2 implements CharSequence {
	
	private String sequence = "";
	
	public String getSequence() {
		
		return sequence;
	}
	
	public void setSecuence(String secuence){
		
		this.sequence = secuence;
		
	}
	
	public CharSequence2(String sequence) {
		
		this.sequence = sequence;
		
	}
	
	
	public char charAt(int index) {
		
		return sequence.charAt(index);
		
	}


	@Override
	public int length() {
		return sequence.length();
		
	}


	@Override
	public CharSequence subSequence(int arg0, int arg1) {
	
		return sequence.substring(arg0, arg1);
	}
	
	

}
