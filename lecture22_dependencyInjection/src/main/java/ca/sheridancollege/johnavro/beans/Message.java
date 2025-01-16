package ca.sheridancollege.johnavro.beans;

import org.springframework.stereotype.Component;

@Component
public class Message {
	private String sayThis="Yo!! Chill :-[]";

	public String getSayThis() {
		return sayThis;
	}

	public void setSayThis(String sayThis) {
		this.sayThis = sayThis;
	}

	public Message() {
		super();
		this.sayThis=sayThis;
	}

	@Override
	public String toString() {
		return "Message [sayThis=" + sayThis + "]";
	}
	
}
