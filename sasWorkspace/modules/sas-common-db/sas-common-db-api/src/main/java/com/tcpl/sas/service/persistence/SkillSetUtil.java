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

package com.tcpl.sas.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tcpl.sas.model.SkillSet;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the skill set service. This utility wraps <code>com.tcpl.sas.service.persistence.impl.SkillSetPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Rakshansh
 * @see SkillSetPersistence
 * @generated
 */
@ProviderType
public class SkillSetUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SkillSet skillSet) {
		getPersistence().clearCache(skillSet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, SkillSet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SkillSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SkillSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SkillSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SkillSet> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SkillSet update(SkillSet skillSet) {
		return getPersistence().update(skillSet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SkillSet update(
		SkillSet skillSet, ServiceContext serviceContext) {

		return getPersistence().update(skillSet, serviceContext);
	}

	/**
	 * Returns all the skill sets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching skill sets
	 */
	public static List<SkillSet> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the skill sets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SkillSetModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of skill sets
	 * @param end the upper bound of the range of skill sets (not inclusive)
	 * @return the range of matching skill sets
	 */
	public static List<SkillSet> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the skill sets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SkillSetModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of skill sets
	 * @param end the upper bound of the range of skill sets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching skill sets
	 */
	public static List<SkillSet> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SkillSet> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the skill sets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SkillSetModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of skill sets
	 * @param end the upper bound of the range of skill sets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching skill sets
	 */
	public static List<SkillSet> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SkillSet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first skill set in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching skill set
	 * @throws NoSuchSkillSetException if a matching skill set could not be found
	 */
	public static SkillSet findByUuid_First(
			String uuid, OrderByComparator<SkillSet> orderByComparator)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first skill set in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching skill set, or <code>null</code> if a matching skill set could not be found
	 */
	public static SkillSet fetchByUuid_First(
		String uuid, OrderByComparator<SkillSet> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last skill set in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching skill set
	 * @throws NoSuchSkillSetException if a matching skill set could not be found
	 */
	public static SkillSet findByUuid_Last(
			String uuid, OrderByComparator<SkillSet> orderByComparator)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last skill set in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching skill set, or <code>null</code> if a matching skill set could not be found
	 */
	public static SkillSet fetchByUuid_Last(
		String uuid, OrderByComparator<SkillSet> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the skill sets before and after the current skill set in the ordered set where uuid = &#63;.
	 *
	 * @param skillSetId the primary key of the current skill set
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next skill set
	 * @throws NoSuchSkillSetException if a skill set with the primary key could not be found
	 */
	public static SkillSet[] findByUuid_PrevAndNext(
			long skillSetId, String uuid,
			OrderByComparator<SkillSet> orderByComparator)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().findByUuid_PrevAndNext(
			skillSetId, uuid, orderByComparator);
	}

	/**
	 * Removes all the skill sets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of skill sets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching skill sets
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the skill set where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSkillSetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching skill set
	 * @throws NoSuchSkillSetException if a matching skill set could not be found
	 */
	public static SkillSet findByUUID_G(String uuid, long groupId)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the skill set where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching skill set, or <code>null</code> if a matching skill set could not be found
	 */
	public static SkillSet fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the skill set where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching skill set, or <code>null</code> if a matching skill set could not be found
	 */
	public static SkillSet fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the skill set where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the skill set that was removed
	 */
	public static SkillSet removeByUUID_G(String uuid, long groupId)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of skill sets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching skill sets
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Caches the skill set in the entity cache if it is enabled.
	 *
	 * @param skillSet the skill set
	 */
	public static void cacheResult(SkillSet skillSet) {
		getPersistence().cacheResult(skillSet);
	}

	/**
	 * Caches the skill sets in the entity cache if it is enabled.
	 *
	 * @param skillSets the skill sets
	 */
	public static void cacheResult(List<SkillSet> skillSets) {
		getPersistence().cacheResult(skillSets);
	}

	/**
	 * Creates a new skill set with the primary key. Does not add the skill set to the database.
	 *
	 * @param skillSetId the primary key for the new skill set
	 * @return the new skill set
	 */
	public static SkillSet create(long skillSetId) {
		return getPersistence().create(skillSetId);
	}

	/**
	 * Removes the skill set with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param skillSetId the primary key of the skill set
	 * @return the skill set that was removed
	 * @throws NoSuchSkillSetException if a skill set with the primary key could not be found
	 */
	public static SkillSet remove(long skillSetId)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().remove(skillSetId);
	}

	public static SkillSet updateImpl(SkillSet skillSet) {
		return getPersistence().updateImpl(skillSet);
	}

	/**
	 * Returns the skill set with the primary key or throws a <code>NoSuchSkillSetException</code> if it could not be found.
	 *
	 * @param skillSetId the primary key of the skill set
	 * @return the skill set
	 * @throws NoSuchSkillSetException if a skill set with the primary key could not be found
	 */
	public static SkillSet findByPrimaryKey(long skillSetId)
		throws com.tcpl.sas.exception.NoSuchSkillSetException {

		return getPersistence().findByPrimaryKey(skillSetId);
	}

	/**
	 * Returns the skill set with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param skillSetId the primary key of the skill set
	 * @return the skill set, or <code>null</code> if a skill set with the primary key could not be found
	 */
	public static SkillSet fetchByPrimaryKey(long skillSetId) {
		return getPersistence().fetchByPrimaryKey(skillSetId);
	}

	/**
	 * Returns all the skill sets.
	 *
	 * @return the skill sets
	 */
	public static List<SkillSet> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the skill sets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SkillSetModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of skill sets
	 * @param end the upper bound of the range of skill sets (not inclusive)
	 * @return the range of skill sets
	 */
	public static List<SkillSet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the skill sets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SkillSetModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of skill sets
	 * @param end the upper bound of the range of skill sets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of skill sets
	 */
	public static List<SkillSet> findAll(
		int start, int end, OrderByComparator<SkillSet> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the skill sets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>SkillSetModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of skill sets
	 * @param end the upper bound of the range of skill sets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of skill sets
	 */
	public static List<SkillSet> findAll(
		int start, int end, OrderByComparator<SkillSet> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the skill sets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of skill sets.
	 *
	 * @return the number of skill sets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SkillSetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SkillSetPersistence, SkillSetPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SkillSetPersistence.class);

		ServiceTracker<SkillSetPersistence, SkillSetPersistence>
			serviceTracker =
				new ServiceTracker<SkillSetPersistence, SkillSetPersistence>(
					bundle.getBundleContext(), SkillSetPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}