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

package org.company.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployerLocalService
 * @generated
 */
public class EmployerLocalServiceWrapper
	implements EmployerLocalService, ServiceWrapper<EmployerLocalService> {

	public EmployerLocalServiceWrapper(
		EmployerLocalService employerLocalService) {

		_employerLocalService = employerLocalService;
	}

	/**
	 * Adds the employer to the database. Also notifies the appropriate model listeners.
	 *
	 * @param employer the employer
	 * @return the employer that was added
	 */
	@Override
	public org.company.service.model.Employer addEmployer(
		org.company.service.model.Employer employer) {

		return _employerLocalService.addEmployer(employer);
	}

	/**
	 * Creates a new employer with the primary key. Does not add the employer to the database.
	 *
	 * @param employerId the primary key for the new employer
	 * @return the new employer
	 */
	@Override
	public org.company.service.model.Employer createEmployer(long employerId) {
		return _employerLocalService.createEmployer(employerId);
	}

	/**
	 * Deletes the employer from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employer the employer
	 * @return the employer that was removed
	 */
	@Override
	public org.company.service.model.Employer deleteEmployer(
		org.company.service.model.Employer employer) {

		return _employerLocalService.deleteEmployer(employer);
	}

	/**
	 * Deletes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employerId the primary key of the employer
	 * @return the employer that was removed
	 * @throws PortalException if a employer with the primary key could not be found
	 */
	@Override
	public org.company.service.model.Employer deleteEmployer(long employerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employerLocalService.deleteEmployer(employerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employerLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>org.company.service.model.impl.EmployerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _employerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>org.company.service.model.impl.EmployerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _employerLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _employerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _employerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public org.company.service.model.Employer fetchEmployer(long employerId) {
		return _employerLocalService.fetchEmployer(employerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _employerLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the employer with the primary key.
	 *
	 * @param employerId the primary key of the employer
	 * @return the employer
	 * @throws PortalException if a employer with the primary key could not be found
	 */
	@Override
	public org.company.service.model.Employer getEmployer(long employerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employerLocalService.getEmployer(employerId);
	}

	/**
	 * Returns a range of all the employers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>org.company.service.model.impl.EmployerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of employers
	 * @param end the upper bound of the range of employers (not inclusive)
	 * @return the range of employers
	 */
	@Override
	public java.util.List<org.company.service.model.Employer> getEmployers(
		int start, int end) {

		return _employerLocalService.getEmployers(start, end);
	}

	/**
	 * Returns the number of employers.
	 *
	 * @return the number of employers
	 */
	@Override
	public int getEmployersCount() {
		return _employerLocalService.getEmployersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _employerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the employer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param employer the employer
	 * @return the employer that was updated
	 */
	@Override
	public org.company.service.model.Employer updateEmployer(
		org.company.service.model.Employer employer) {

		return _employerLocalService.updateEmployer(employer);
	}

	@Override
	public EmployerLocalService getWrappedService() {
		return _employerLocalService;
	}

	@Override
	public void setWrappedService(EmployerLocalService employerLocalService) {
		_employerLocalService = employerLocalService;
	}

	private EmployerLocalService _employerLocalService;

}