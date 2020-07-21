/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.company.service.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentInfoSoap implements Serializable {

	public static StudentInfoSoap toSoapModel(StudentInfo model) {
		StudentInfoSoap soapModel = new StudentInfoSoap();

		soapModel.setStudentId(model.getStudentId());
		soapModel.setFirstname(model.getFirstname());
		soapModel.setLastname(model.getLastname());
		soapModel.setGender(model.getGender());
		soapModel.setDateofbirth(model.getDateofbirth());
		soapModel.setCourse(model.getCourse());
		soapModel.setIntake(model.getIntake());
		soapModel.setAddress(model.getAddress());
		soapModel.setCity(model.getCity());
		soapModel.setPostcode(model.getPostcode());
		soapModel.setCountry(model.getCountry());
		soapModel.setEmail(model.getEmail());
		soapModel.setMobile(model.getMobile());

		return soapModel;
	}

	public static StudentInfoSoap[] toSoapModels(StudentInfo[] models) {
		StudentInfoSoap[] soapModels = new StudentInfoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StudentInfoSoap[][] toSoapModels(StudentInfo[][] models) {
		StudentInfoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StudentInfoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StudentInfoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StudentInfoSoap[] toSoapModels(List<StudentInfo> models) {
		List<StudentInfoSoap> soapModels = new ArrayList<StudentInfoSoap>(
			models.size());

		for (StudentInfo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StudentInfoSoap[soapModels.size()]);
	}

	public StudentInfoSoap() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public String getFirstname() {
		return _firstname;
	}

	public void setFirstname(String firstname) {
		_firstname = firstname;
	}

	public String getLastname() {
		return _lastname;
	}

	public void setLastname(String lastname) {
		_lastname = lastname;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getDateofbirth() {
		return _dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		_dateofbirth = dateofbirth;
	}

	public String getCourse() {
		return _course;
	}

	public void setCourse(String course) {
		_course = course;
	}

	public String getIntake() {
		return _intake;
	}

	public void setIntake(String intake) {
		_intake = intake;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getPostcode() {
		return _postcode;
	}

	public void setPostcode(String postcode) {
		_postcode = postcode;
	}

	public String getCountry() {
		return _country;
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	private long _studentId;
	private String _firstname;
	private String _lastname;
	private String _gender;
	private String _dateofbirth;
	private String _course;
	private String _intake;
	private String _address;
	private String _city;
	private String _postcode;
	private String _country;
	private String _email;
	private String _mobile;

}