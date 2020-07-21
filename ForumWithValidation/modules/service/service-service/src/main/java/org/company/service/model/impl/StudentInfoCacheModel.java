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

package org.company.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.company.service.model.StudentInfo;

/**
 * The cache model class for representing StudentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class StudentInfoCacheModel
	implements CacheModel<StudentInfo>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StudentInfoCacheModel)) {
			return false;
		}

		StudentInfoCacheModel studentInfoCacheModel =
			(StudentInfoCacheModel)obj;

		if (studentId == studentInfoCacheModel.studentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, studentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{studentId=");
		sb.append(studentId);
		sb.append(", firstname=");
		sb.append(firstname);
		sb.append(", lastname=");
		sb.append(lastname);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", dateofbirth=");
		sb.append(dateofbirth);
		sb.append(", course=");
		sb.append(course);
		sb.append(", intake=");
		sb.append(intake);
		sb.append(", address=");
		sb.append(address);
		sb.append(", city=");
		sb.append(city);
		sb.append(", postcode=");
		sb.append(postcode);
		sb.append(", country=");
		sb.append(country);
		sb.append(", email=");
		sb.append(email);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StudentInfo toEntityModel() {
		StudentInfoImpl studentInfoImpl = new StudentInfoImpl();

		studentInfoImpl.setStudentId(studentId);

		if (firstname == null) {
			studentInfoImpl.setFirstname("");
		}
		else {
			studentInfoImpl.setFirstname(firstname);
		}

		if (lastname == null) {
			studentInfoImpl.setLastname("");
		}
		else {
			studentInfoImpl.setLastname(lastname);
		}

		if (gender == null) {
			studentInfoImpl.setGender("");
		}
		else {
			studentInfoImpl.setGender(gender);
		}

		if (dateofbirth == null) {
			studentInfoImpl.setDateofbirth("");
		}
		else {
			studentInfoImpl.setDateofbirth(dateofbirth);
		}

		if (course == null) {
			studentInfoImpl.setCourse("");
		}
		else {
			studentInfoImpl.setCourse(course);
		}

		if (intake == null) {
			studentInfoImpl.setIntake("");
		}
		else {
			studentInfoImpl.setIntake(intake);
		}

		if (address == null) {
			studentInfoImpl.setAddress("");
		}
		else {
			studentInfoImpl.setAddress(address);
		}

		if (city == null) {
			studentInfoImpl.setCity("");
		}
		else {
			studentInfoImpl.setCity(city);
		}

		if (postcode == null) {
			studentInfoImpl.setPostcode("");
		}
		else {
			studentInfoImpl.setPostcode(postcode);
		}

		if (country == null) {
			studentInfoImpl.setCountry("");
		}
		else {
			studentInfoImpl.setCountry(country);
		}

		if (email == null) {
			studentInfoImpl.setEmail("");
		}
		else {
			studentInfoImpl.setEmail(email);
		}

		if (mobile == null) {
			studentInfoImpl.setMobile("");
		}
		else {
			studentInfoImpl.setMobile(mobile);
		}

		studentInfoImpl.resetOriginalValues();

		return studentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		studentId = objectInput.readLong();
		firstname = objectInput.readUTF();
		lastname = objectInput.readUTF();
		gender = objectInput.readUTF();
		dateofbirth = objectInput.readUTF();
		course = objectInput.readUTF();
		intake = objectInput.readUTF();
		address = objectInput.readUTF();
		city = objectInput.readUTF();
		postcode = objectInput.readUTF();
		country = objectInput.readUTF();
		email = objectInput.readUTF();
		mobile = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(studentId);

		if (firstname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstname);
		}

		if (lastname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastname);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (dateofbirth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dateofbirth);
		}

		if (course == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(course);
		}

		if (intake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(intake);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (postcode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postcode);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}
	}

	public long studentId;
	public String firstname;
	public String lastname;
	public String gender;
	public String dateofbirth;
	public String course;
	public String intake;
	public String address;
	public String city;
	public String postcode;
	public String country;
	public String email;
	public String mobile;

}