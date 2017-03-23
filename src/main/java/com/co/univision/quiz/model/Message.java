package com.co.univision.quiz.model;

public class Message {
	private String id;
	private static final String message = "This is a quiz :)";
	
	
	public Message(String id) {
		this.id = id;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

    public String getMessage() {
		return message;
	}
}