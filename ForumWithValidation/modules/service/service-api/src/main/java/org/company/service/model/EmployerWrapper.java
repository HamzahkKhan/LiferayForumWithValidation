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
 * This class is a wrapper for {@link Employer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employer
 * @generated
 */
public class EmployerWrapper
	extends BaseModelWrapper<Employer>
	implements Employer, ModelWrapper<Employer> {

	public EmployerWrapper(Employer employer) {
		super(employer);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employerId", getEmployerId());
		attributes.put("name", getName());
		attributes.put("surname", getSurname());
		attributes.put("age", getAge());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employerId = (Long)attributes.get("employerId");

		if (employerId != null) {
			setEmployerId(employerId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		Long age = (Long)attributes.get("age");

		if (age != null) {
			setAge(age);
		}
	}

	/**
	 * Returns the age of this employer.
	 *
	 * @return the age of this employer
	 */
	@Override
	public long getAge() {
		return model.getAge();
	}

	/**
	 * Returns the employer ID of this employer.
	 *
	 * @return the employer ID of this employer
	 */
	@Override
	public long getEmployerId() {
		return model.getEmployerId();
	}

	/**
	 * Returns the name of this employer.
	 *
	 * @return the name of this employer
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this employer.
	 *
	 * @return the primary key of this employer
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the surname of this employer.
	 *
	 * @return the surname of this employer
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the age of this employer.
	 *
	 * @param age the age of this employer
	 */
	@Override
	public void setAge(long age) {
		model.setAge(age);
	}

	/**
	 * Sets the employer ID of this employer.
	 *
	 * @param employerId the employer ID of this employer
	 */
	@Override
	public void setEmployerId(long employerId) {
		model.setEmployerId(employerId);
	}

	/**
	 * Sets the name of this employer.
	 *
	 * @param name the name of this employer
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this employer.
	 *
	 * @param primaryKey the primary key of this employer
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the surname of this employer.
	 *
	 * @param surname the surname of this employer
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	@Override
	protected EmployerWrapper wrap(Employer employer) {
		return new EmployerWrapper(employer);
	}

}