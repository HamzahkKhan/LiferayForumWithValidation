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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Employer service. Represents a row in the &quot;asif_Employer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>org.company.service.model.impl.EmployerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>org.company.service.model.impl.EmployerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employer
 * @generated
 */
@ProviderType
public interface EmployerModel extends BaseModel<Employer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employer model instance should use the {@link Employer} interface instead.
	 */

	/**
	 * Returns the primary key of this employer.
	 *
	 * @return the primary key of this employer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employer.
	 *
	 * @param primaryKey the primary key of this employer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the employer ID of this employer.
	 *
	 * @return the employer ID of this employer
	 */
	public long getEmployerId();

	/**
	 * Sets the employer ID of this employer.
	 *
	 * @param employerId the employer ID of this employer
	 */
	public void setEmployerId(long employerId);

	/**
	 * Returns the name of this employer.
	 *
	 * @return the name of this employer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employer.
	 *
	 * @param name the name of this employer
	 */
	public void setName(String name);

	/**
	 * Returns the surname of this employer.
	 *
	 * @return the surname of this employer
	 */
	@AutoEscape
	public String getSurname();

	/**
	 * Sets the surname of this employer.
	 *
	 * @param surname the surname of this employer
	 */
	public void setSurname(String surname);

	/**
	 * Returns the age of this employer.
	 *
	 * @return the age of this employer
	 */
	public long getAge();

	/**
	 * Sets the age of this employer.
	 *
	 * @param age the age of this employer
	 */
	public void setAge(long age);

}