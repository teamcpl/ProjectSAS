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

package com.tcpl.sas.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link EvalVendorLocalService}.
 *
 * @author Rakshansh
 * @see EvalVendorLocalService
 * @generated
 */
@ProviderType
public class EvalVendorLocalServiceWrapper
	implements EvalVendorLocalService, ServiceWrapper<EvalVendorLocalService> {

	public EvalVendorLocalServiceWrapper(
		EvalVendorLocalService evalVendorLocalService) {

		_evalVendorLocalService = evalVendorLocalService;
	}

	/**
	 * Adds the eval vendor to the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendor the eval vendor
	 * @return the eval vendor that was added
	 */
	@Override
	public com.tcpl.sas.model.EvalVendor addEvalVendor(
		com.tcpl.sas.model.EvalVendor evalVendor) {

		return _evalVendorLocalService.addEvalVendor(evalVendor);
	}

	/**
	 * Creates a new eval vendor with the primary key. Does not add the eval vendor to the database.
	 *
	 * @param evalVendorId the primary key for the new eval vendor
	 * @return the new eval vendor
	 */
	@Override
	public com.tcpl.sas.model.EvalVendor createEvalVendor(long evalVendorId) {
		return _evalVendorLocalService.createEvalVendor(evalVendorId);
	}

	/**
	 * Deletes the eval vendor from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendor the eval vendor
	 * @return the eval vendor that was removed
	 */
	@Override
	public com.tcpl.sas.model.EvalVendor deleteEvalVendor(
		com.tcpl.sas.model.EvalVendor evalVendor) {

		return _evalVendorLocalService.deleteEvalVendor(evalVendor);
	}

	/**
	 * Deletes the eval vendor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor that was removed
	 * @throws PortalException if a eval vendor with the primary key could not be found
	 */
	@Override
	public com.tcpl.sas.model.EvalVendor deleteEvalVendor(long evalVendorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evalVendorLocalService.deleteEvalVendor(evalVendorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evalVendorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _evalVendorLocalService.dynamicQuery();
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

		return _evalVendorLocalService.dynamicQuery(dynamicQuery);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _evalVendorLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _evalVendorLocalService.dynamicQuery(
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

		return _evalVendorLocalService.dynamicQueryCount(dynamicQuery);
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

		return _evalVendorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.tcpl.sas.model.EvalVendor fetchEvalVendor(long evalVendorId) {
		return _evalVendorLocalService.fetchEvalVendor(evalVendorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _evalVendorLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the eval vendor with the primary key.
	 *
	 * @param evalVendorId the primary key of the eval vendor
	 * @return the eval vendor
	 * @throws PortalException if a eval vendor with the primary key could not be found
	 */
	@Override
	public com.tcpl.sas.model.EvalVendor getEvalVendor(long evalVendorId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evalVendorLocalService.getEvalVendor(evalVendorId);
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
	public java.util.List<com.tcpl.sas.model.EvalVendor> getEvalVendors(
		int start, int end) {

		return _evalVendorLocalService.getEvalVendors(start, end);
	}

	/**
	 * Returns the number of eval vendors.
	 *
	 * @return the number of eval vendors
	 */
	@Override
	public int getEvalVendorsCount() {
		return _evalVendorLocalService.getEvalVendorsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _evalVendorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _evalVendorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _evalVendorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the eval vendor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param evalVendor the eval vendor
	 * @return the eval vendor that was updated
	 */
	@Override
	public com.tcpl.sas.model.EvalVendor updateEvalVendor(
		com.tcpl.sas.model.EvalVendor evalVendor) {

		return _evalVendorLocalService.updateEvalVendor(evalVendor);
	}

	@Override
	public EvalVendorLocalService getWrappedService() {
		return _evalVendorLocalService;
	}

	@Override
	public void setWrappedService(
		EvalVendorLocalService evalVendorLocalService) {

		_evalVendorLocalService = evalVendorLocalService;
	}

	private EvalVendorLocalService _evalVendorLocalService;

}