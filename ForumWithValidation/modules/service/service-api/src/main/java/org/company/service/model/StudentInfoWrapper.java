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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StudentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentInfo
 * @generated
 */
public class StudentInfoWrapper
	extends BaseModelWrapper<StudentInfo>
	implements ModelWrapper<StudentInfo>, StudentInfo {

	public StudentInfoWrapper(StudentInfo studentInfo) {
		super(studentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("studentId", getStudentId());
		attributes.put("firstname", getFirstname());
		attributes.put("lastname", getLastname());
		attributes.put("gender", getGender());
		attributes.put("dateofbirth", getDateofbirth());
		attributes.put("course", getCourse());
		attributes.put("intake", getIntake());
		attributes.put("address", getAddress());
		attributes.put("city", getCity());
		attributes.put("postcode", getPostcode());
		attributes.put("country", getCountry());
		attributes.put("email", getEmail());
		attributes.put("mobile", getMobile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long studentId = (Long)attributes.get("studentId");

		if (studentId != null) {
			setStudentId(studentId);
		}

		String firstname = (String)attributes.get("firstname");

		if (firstname != null) {
			setFirstname(firstname);
		}

		String lastname = (String)attributes.get("lastname");

		if (lastname != null) {
			setLastname(lastname);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String dateofbirth = (String)attributes.get("dateofbirth");

		if (dateofbirth != null) {
			setDateofbirth(dateofbirth);
		}

		String course = (String)attributes.get("course");

		if (course != null) {
			setCourse(course);
		}

		String intake = (String)attributes.get("intake");

		if (intake != null) {
			setIntake(intake);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String postcode = (String)attributes.get("postcode");

		if (postcode != null) {
			setPostcode(postcode);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}
	}

	/**
	 * Returns the address of this student info.
	 *
	 * @return the address of this student info
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the city of this student info.
	 *
	 * @return the city of this student info
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the country of this student info.
	 *
	 * @return the country of this student info
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the course of this student info.
	 *
	 * @return the course of this student info
	 */
	@Override
	public String getCourse() {
		return model.getCourse();
	}

	/**
	 * Returns the dateofbirth of this student info.
	 *
	 * @return the dateofbirth of this student info
	 */
	@Override
	public String getDateofbirth() {
		return model.getDateofbirth();
	}

	/**
	 * Returns the email of this student info.
	 *
	 * @return the email of this student info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the firstname of this student info.
	 *
	 * @return the firstname of this student info
	 */
	@Override
	public String getFirstname() {
		return model.getFirstname();
	}

	/**
	 * Returns the gender of this student info.
	 *
	 * @return the gender of this student info
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the intake of this student info.
	 *
	 * @return the intake of this student info
	 */
	@Override
	public String getIntake() {
		return model.getIntake();
	}

	/**
	 * Returns the lastname of this student info.
	 *
	 * @return the lastname of this student info
	 */
	@Override
	public String getLastname() {
		return model.getLastname();
	}

	/**
	 * Returns the mobile of this student info.
	 *
	 * @return the mobile of this student info
	 */
	@Override
	public String getMobile() {
		return model.getMobile();
	}

	/**
	 * Returns the postcode of this student info.
	 *
	 * @return the postcode of this student info
	 */
	@Override
	public String getPostcode() {
		return model.getPostcode();
	}

	/**
	 * Returns the primary key of this student info.
	 *
	 * @return the primary key of this student info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the student ID of this student info.
	 *
	 * @return the student ID of this student info
	 */
	@Override
	public long getStudentId() {
		return model.getStudentId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this student info.
	 *
	 * @param address the address of this student info
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the city of this student info.
	 *
	 * @param city the city of this student info
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the country of this student info.
	 *
	 * @param country the country of this student info
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the course of this student info.
	 *
	 * @param course the course of this student info
	 */
	@Override
	public void setCourse(String course) {
		model.setCourse(course);
	}

	/**
	 * Sets the dateofbirth of this student info.
	 *
	 * @param dateofbirth the dateofbirth of this student info
	 */
	@Override
	public void setDateofbirth(String dateofbirth) {
		model.setDateofbirth(dateofbirth);
	}

	/**
	 * Sets the email of this student info.
	 *
	 * @param email the email of this student info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the firstname of this student info.
	 *
	 * @param firstname the firstname of this student info
	 */
	@Override
	public void setFirstname(String firstname) {
		model.setFirstname(firstname);
	}

	/**
	 * Sets the gender of this student info.
	 *
	 * @param gender the gender of this student info
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the intake of this student info.
	 *
	 * @param intake the intake of this student info
	 */
	@Override
	public void setIntake(String intake) {
		model.setIntake(intake);
	}

	/**
	 * Sets the lastname of this student info.
	 *
	 * @param lastname the lastname of this student info
	 */
	@Override
	public void setLastname(String lastname) {
		model.setLastname(lastname);
	}

	/**
	 * Sets the mobile of this student info.
	 *
	 * @param mobile the mobile of this student info
	 */
	@Override
	public void setMobile(String mobile) {
		model.setMobile(mobile);
	}

	/**
	 * Sets the postcode of this student info.
	 *
	 * @param postcode the postcode of this student info
	 */
	@Override
	public void setPostcode(String postcode) {
		model.setPostcode(postcode);
	}

	/**
	 * Sets the primary key of this student info.
	 *
	 * @param primaryKey the primary key of this student info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the student ID of this student info.
	 *
	 * @param studentId the student ID of this student info
	 */
	@Override
	public void setStudentId(long studentId) {
		model.setStudentId(studentId);
	}

	@Override
	protected StudentInfoWrapper wrap(StudentInfo studentInfo) {
		return new StudentInfoWrapper(studentInfo);
	}

}