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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.company.service.model.Employer;
import org.company.service.model.EmployerModel;

/**
 * The base model implementation for the Employer service. Represents a row in the &quot;asif_Employer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>EmployerModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployerImpl
 * @generated
 */
public class EmployerModelImpl
	extends BaseModelImpl<Employer> implements EmployerModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employer model instance should use the <code>Employer</code> interface instead.
	 */
	public static final String TABLE_NAME = "asif_Employer";

	public static final Object[][] TABLE_COLUMNS = {
		{"employerId", Types.BIGINT}, {"name", Types.VARCHAR},
		{"surname", Types.VARCHAR}, {"age", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("employerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("surname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("age", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table asif_Employer (employerId LONG not null primary key,name VARCHAR(75) null,surname VARCHAR(75) null,age LONG)";

	public static final String TABLE_SQL_DROP = "drop table asif_Employer";

	public static final String ORDER_BY_JPQL =
		" ORDER BY employer.employerId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY asif_Employer.employerId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	public EmployerModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Employer.class;
	}

	@Override
	public String getModelClassName() {
		return Employer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Employer, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Employer, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employer, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Employer)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Employer, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Employer, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Employer)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Employer, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Employer, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Employer>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Employer.class.getClassLoader(), Employer.class,
			ModelWrapper.class);

		try {
			Constructor<Employer> constructor =
				(Constructor<Employer>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Employer, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Employer, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Employer, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Employer, Object>>();
		Map<String, BiConsumer<Employer, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Employer, ?>>();

		attributeGetterFunctions.put("employerId", Employer::getEmployerId);
		attributeSetterBiConsumers.put(
			"employerId", (BiConsumer<Employer, Long>)Employer::setEmployerId);
		attributeGetterFunctions.put("name", Employer::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Employer, String>)Employer::setName);
		attributeGetterFunctions.put("surname", Employer::getSurname);
		attributeSetterBiConsumers.put(
			"surname", (BiConsumer<Employer, String>)Employer::setSurname);
		attributeGetterFunctions.put("age", Employer::getAge);
		attributeSetterBiConsumers.put(
			"age", (BiConsumer<Employer, Long>)Employer::setAge);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getEmployerId() {
		return _employerId;
	}

	@Override
	public void setEmployerId(long employerId) {
		_employerId = employerId;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public String getSurname() {
		if (_surname == null) {
			return "";
		}
		else {
			return _surname;
		}
	}

	@Override
	public void setSurname(String surname) {
		_surname = surname;
	}

	@Override
	public long getAge() {
		return _age;
	}

	@Override
	public void setAge(long age) {
		_age = age;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Employer.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Employer toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Employer>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployerImpl employerImpl = new EmployerImpl();

		employerImpl.setEmployerId(getEmployerId());
		employerImpl.setName(getName());
		employerImpl.setSurname(getSurname());
		employerImpl.setAge(getAge());

		employerImpl.resetOriginalValues();

		return employerImpl;
	}

	@Override
	public int compareTo(Employer employer) {
		long primaryKey = employer.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Employer)) {
			return false;
		}

		Employer employer = (Employer)obj;

		long primaryKey = employer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Employer> toCacheModel() {
		EmployerCacheModel employerCacheModel = new EmployerCacheModel();

		employerCacheModel.employerId = getEmployerId();

		employerCacheModel.name = getName();

		String name = employerCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			employerCacheModel.name = null;
		}

		employerCacheModel.surname = getSurname();

		String surname = employerCacheModel.surname;

		if ((surname != null) && (surname.length() == 0)) {
			employerCacheModel.surname = null;
		}

		employerCacheModel.age = getAge();

		return employerCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Employer, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Employer, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employer, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Employer)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Employer, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Employer, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Employer, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Employer)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Employer>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _employerId;
	private String _name;
	private String _surname;
	private long _age;
	private Employer _escapedModel;

}