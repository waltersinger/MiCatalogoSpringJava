package com.walter.minicatalogo.entity;

public class Respuesta {
	
	private int idStatus;
	private String newId;
	private String messageStatus;
	
	
	
	public Respuesta() {
		
	}

	public Respuesta(int idStatus,String newId, String messageStatus) {
		this.idStatus=idStatus;
		this.newId = newId;
		this.messageStatus = messageStatus;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getNewId() {
		return newId;
	}

	public void setNewId(String newId) {
		this.newId = newId;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}
	
	

}
