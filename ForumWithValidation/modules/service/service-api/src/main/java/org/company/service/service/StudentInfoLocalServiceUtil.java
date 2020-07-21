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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for StudentInfo. This utility wraps
 * <code>org.company.service.service.impl.StudentInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StudentInfoLocalService
 * @generated
 */
public class StudentInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>org.company.service.service.impl.StudentInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the student info to the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentInfo the student info
	 * @return the student info that was added
	 */
	public static org.company.service.model.StudentInfo addStudentInfo(
		org.company.service.model.StudentInfo studentInfo) {

		return getService().addStudentInfo(studentInfo);
	}

	/**
	 * Creates a new student info with the primary key. Does not add the student info to the database.
	 *
	 * @param studentId the primary key for the new student info
	 * @return the new student info
	 */
	public static org.company.service.model.StudentInfo createStudentInfo(
		long studentId) {

		return getService().createStudentInfo(studentId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the student info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentId the primary key of the student info
	 * @return the student info that was removed
	 * @throws PortalException if a student info with the primary key could not be found
	 */
	public static org.company.service.model.StudentInfo deleteStudentInfo(
			long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStudentInfo(studentId);
	}

	/**
	 * Deletes the student info from the database. Also notifies the appropriate model listeners.
	 *
	 * @param studentInfo the student info
	 * @return the student info that was removed
	 */
	public static org.company.service.model.StudentInfo deleteStudentInfo(
		org.company.service.model.StudentInfo studentInfo) {

		return getService().deleteStudentInfo(studentInfo);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>org.company.service.model.impl.StudentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>org.company.service.model.impl.StudentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.company.service.model.StudentInfo fetchStudentInfo(
		long studentId) {

		return getService().fetchStudentInfo(studentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the student info with the primary key.
	 *
	 * @param studentId the primary key of the student info
	 * @return the student info
	 * @throws PortalException if a student info with the primary key could not be found
	 */
	public static org.company.service.model.StudentInfo getStudentInfo(
			long studentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getStudentInfo(studentId);
	}

	/**
	 * Returns a range of all the student infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>org.company.service.model.impl.StudentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of student infos
	 * @param end the upper bound of the range of student infos (not inclusive)
	 * @return the range of student infos
	 */
	public static java.util.List<org.company.service.model.StudentInfo>
		getStudentInfos(int start, int end) {

		return getService().getStudentInfos(start, end);
	}

	/**
	 * Returns the number of student infos.
	 *
	 * @return the number of student infos
	 */
	public static int getStudentInfosCount() {
		return getService().getStudentInfosCount();
	}

	/**
	 * Updates the student info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param studentInfo the student info
	 * @return the student info that was updated
	 */
	public static org.company.service.model.StudentInfo updateStudentInfo(
		org.company.service.model.StudentInfo studentInfo) {

		return getService().updateStudentInfo(studentInfo);
	}

	public static StudentInfoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<StudentInfoLocalService, StudentInfoLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(StudentInfoLocalService.class);

		ServiceTracker<StudentInfoLocalService, StudentInfoLocalService>
			serviceTracker =
				new ServiceTracker
					<StudentInfoLocalService, StudentInfoLocalService>(
						bundle.getBundleContext(),
						StudentInfoLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}