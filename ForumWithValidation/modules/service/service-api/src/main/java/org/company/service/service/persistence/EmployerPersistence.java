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

package org.company.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.company.service.exception.NoSuchEmployerException;
import org.company.service.model.Employer;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the employer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployerUtil
 * @generated
 */
@ProviderType
public interface EmployerPersistence extends BasePersistence<Employer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmployerUtil} to access the employer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the employer in the entity cache if it is enabled.
	 *
	 * @param employer the employer
	 */
	public void cacheResult(Employer employer);

	/**
	 * Caches the employers in the entity cache if it is enabled.
	 *
	 * @param employers the employers
	 */
	public void cacheResult(java.util.List<Employer> employers);

	/**
	 * Creates a new employer with the primary key. Does not add the employer to the database.
	 *
	 * @param employerId the primary key for the new employer
	 * @return the new employer
	 */
	public Employer create(long employerId);

	/**
	 * Removes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employerId the primary key of the employer
	 * @return the employer that was removed
	 * @throws NoSuchEmployerException if a employer with the primary key could not be found
	 */
	public Employer remove(long employerId) throws NoSuchEmployerException;

	public Employer updateImpl(Employer employer);

	/**
	 * Returns the employer with the primary key or throws a <code>NoSuchEmployerException</code> if it could not be found.
	 *
	 * @param employerId the primary key of the employer
	 * @return the employer
	 * @throws NoSuchEmployerException if a employer with the primary key could not be found
	 */
	public Employer findByPrimaryKey(long employerId)
		throws NoSuchEmployerException;

	/**
	 * Returns the employer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employerId the primary key of the employer
	 * @return the employer, or <code>null</code> if a employer with the primary key could not be found
	 */
	public Employer fetchByPrimaryKey(long employerId);

	/**
	 * Returns all the employers.
	 *
	 * @return the employers
	 */
	public java.util.List<Employer> findAll();

	/**
	 * Returns a range of all the employers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employers
	 * @param end the upper bound of the range of employers (not inclusive)
	 * @return the range of employers
	 */
	public java.util.List<Employer> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the employers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employers
	 * @param end the upper bound of the range of employers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employers
	 */
	public java.util.List<Employer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employer>
			orderByComparator);

	/**
	 * Returns an ordered range of all the employers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmployerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employers
	 * @param end the upper bound of the range of employers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of employers
	 */
	public java.util.List<Employer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Employer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the employers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of employers.
	 *
	 * @return the number of employers
	 */
	public int countAll();

}