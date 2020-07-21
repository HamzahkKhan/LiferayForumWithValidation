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

import org.company.service.model.Employer;

/**
 * The cache model class for representing Employer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployerCacheModel
	implements CacheModel<Employer>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployerCacheModel)) {
			return false;
		}

		EmployerCacheModel employerCacheModel = (EmployerCacheModel)obj;

		if (employerId == employerCacheModel.employerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{employerId=");
		sb.append(employerId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", age=");
		sb.append(age);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employer toEntityModel() {
		EmployerImpl employerImpl = new EmployerImpl();

		employerImpl.setEmployerId(employerId);

		if (name == null) {
			employerImpl.setName("");
		}
		else {
			employerImpl.setName(name);
		}

		if (surname == null) {
			employerImpl.setSurname("");
		}
		else {
			employerImpl.setSurname(surname);
		}

		employerImpl.setAge(age);

		employerImpl.resetOriginalValues();

		return employerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employerId = objectInput.readLong();
		name = objectInput.readUTF();
		surname = objectInput.readUTF();

		age = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(employerId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (surname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surname);
		}

		objectOutput.writeLong(age);
	}

	public long employerId;
	public String name;
	public String surname;
	public long age;

}