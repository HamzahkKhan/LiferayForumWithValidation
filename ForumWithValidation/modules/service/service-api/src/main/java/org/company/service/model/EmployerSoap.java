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
public class EmployerSoap implements Serializable {

	public static EmployerSoap toSoapModel(Employer model) {
		EmployerSoap soapModel = new EmployerSoap();

		soapModel.setEmployerId(model.getEmployerId());
		soapModel.setName(model.getName());
		soapModel.setSurname(model.getSurname());
		soapModel.setAge(model.getAge());

		return soapModel;
	}

	public static EmployerSoap[] toSoapModels(Employer[] models) {
		EmployerSoap[] soapModels = new EmployerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmployerSoap[][] toSoapModels(Employer[][] models) {
		EmployerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmployerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmployerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmployerSoap[] toSoapModels(List<Employer> models) {
		List<EmployerSoap> soapModels = new ArrayList<EmployerSoap>(
			models.size());

		for (Employer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmployerSoap[soapModels.size()]);
	}

	public EmployerSoap() {
	}

	public long getPrimaryKey() {
		return _employerId;
	}

	public void setPrimaryKey(long pk) {
		setEmployerId(pk);
	}

	public long getEmployerId() {
		return _employerId;
	}

	public void setEmployerId(long employerId) {
		_employerId = employerId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public long getAge() {
		return _age;
	}

	public void setAge(long age) {
		_age = age;
	}

	private long _employerId;
	private String _name;
	private String _surname;
	private long _age;

}