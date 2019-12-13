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

package com.tcpl.sas.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.tcpl.sas.model.EvalVendor;
import com.tcpl.sas.service.EvalVendorLocalService;
import com.tcpl.sas.service.persistence.EvalVendorPersistence;
import com.tcpl.sas.service.persistence.RequirementDataPersistence;
import com.tcpl.sas.service.persistence.SkillSetPersistence;
import com.tcpl.sas.service.persistence.SourceVendorPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the eval vendor local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.tcpl.sas.service.impl.EvalVendorLocalServiceImpl}.
 * </p>
 *
 * @author Rakshansh
 * @see com.tcpl.sas.service.impl.EvalVendorLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class EvalVendorLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements EvalVendorLocalService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EvalVendorLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.tcpl.sas.service.EvalVendorLocalServiceUtil</code>.
	 */

	/**
	 * Adds the eval vendor to the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendor the eval vendor
	 * @return the eval vendor that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EvalVendor addEvalVendor(EvalVendor evalVendor) {
		evalVendor.setNew(true);

		return evalVendorPersistence.update(evalVendor);
	}

	/**
	 * Creates a new eval vendor with the primary key. Does not add the eval vendor to the database.
	 *
	 * @param evalVendorId the primary key for the new eval vendor
	 * @return the new eval vendor
	 */
	@Override
	@Transactional(enabled = false)
	public EvalVendor createEvalVendor(long evalVendorId) {
		return evalVendorPersistence.create(evalVendorId);
	}

	/**
	 * Deletes the eval vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor that was removed
	 * @throws PortalException if a eval vendor with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EvalVendor deleteEvalVendor(long evalVendorId)
		throws PortalException {

		return evalVendorPersistence.remove(evalVendorId);
	}

	/**
	 * Deletes the eval vendor from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendor the eval vendor
	 * @return the eval vendor that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public EvalVendor deleteEvalVendor(EvalVendor evalVendor) {
		return evalVendorPersistence.remove(evalVendor);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			EvalVendor.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return evalVendorPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return evalVendorPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return evalVendorPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return evalVendorPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return evalVendorPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public EvalVendor fetchEvalVendor(long evalVendorId) {
		return evalVendorPersistence.fetchByPrimaryKey(evalVendorId);
	}

	/**
	 * Returns the eval vendor with the primary key.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor
	 * @throws PortalException if a eval vendor with the primary key could not be found
	 */
	@Override
	public EvalVendor getEvalVendor(long evalVendorId) throws PortalException {
		return evalVendorPersistence.findByPrimaryKey(evalVendorId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(evalVendorLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EvalVendor.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("evalVendorId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			evalVendorLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(EvalVendor.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"evalVendorId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(evalVendorLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(EvalVendor.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("evalVendorId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return evalVendorLocalService.deleteEvalVendor(
			(EvalVendor)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return evalVendorPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the eval vendors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.tcpl.sas.model.impl.EvalVendorModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eval vendors
	 * @param end the upper bound of the range of eval vendors (not inclusive)
	 * @return the range of eval vendors
	 */
	@Override
	public List<EvalVendor> getEvalVendors(int start, int end) {
		return evalVendorPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of eval vendors.
	 *
	 * @return the number of eval vendors
	 */
	@Override
	public int getEvalVendorsCount() {
		return evalVendorPersistence.countAll();
	}

	/**
	 * Updates the eval vendor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendor the eval vendor
	 * @return the eval vendor that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public EvalVendor updateEvalVendor(EvalVendor evalVendor) {
		return evalVendorPersistence.update(evalVendor);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			EvalVendorLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		evalVendorLocalService = (EvalVendorLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EvalVendorLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return EvalVendor.class;
	}

	protected String getModelClassName() {
		return EvalVendor.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = evalVendorPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	protected EvalVendorLocalService evalVendorLocalService;

	@Reference
	protected EvalVendorPersistence evalVendorPersistence;

	@Reference
	protected RequirementDataPersistence requirementDataPersistence;

	@Reference
	protected SkillSetPersistence skillSetPersistence;

	@Reference
	protected SourceVendorPersistence sourceVendorPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}