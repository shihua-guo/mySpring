package com.briup.ioc.proEdit;

import java.beans.PropertyEditorSupport;

import com.briup.bean.Address;
public class AddressEdit extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		String[] strAll = text.split(",");
		String city = strAll[0];
		String country = strAll[1];
		String street = strAll[2];
		Address a  = new Address(city,country,street);
		setValue(a);//把设置的好对象set进去
	}
	@Override
	public String getAsText() {
		return super.getAsText();
	}
	

}
