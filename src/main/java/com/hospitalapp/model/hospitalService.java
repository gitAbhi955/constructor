package com.hospitalapp.model;

public interface hospitalService {
	
	public void connectDB();
	public boolean verifyLogin(String email,String password);

}
