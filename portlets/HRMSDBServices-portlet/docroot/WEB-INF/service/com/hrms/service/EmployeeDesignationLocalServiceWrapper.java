/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.hrms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeDesignationLocalService}.
 *
 * @author yashpalsinh
 * @see EmployeeDesignationLocalService
 * @generated
 */
public class EmployeeDesignationLocalServiceWrapper
	implements EmployeeDesignationLocalService,
		ServiceWrapper<EmployeeDesignationLocalService> {
	public EmployeeDesignationLocalServiceWrapper(
		EmployeeDesignationLocalService employeeDesignationLocalService) {
		_employeeDesignationLocalService = employeeDesignationLocalService;
	}

	/**
	* Adds the employee designation to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignation the employee designation
	* @return the employee designation that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDesignation addEmployeeDesignation(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.addEmployeeDesignation(employeeDesignation);
	}

	/**
	* Creates a new employee designation with the primary key. Does not add the employee designation to the database.
	*
	* @param employeeDesignationId the primary key for the new employee designation
	* @return the new employee designation
	*/
	@Override
	public com.hrms.model.EmployeeDesignation createEmployeeDesignation(
		long employeeDesignationId) {
		return _employeeDesignationLocalService.createEmployeeDesignation(employeeDesignationId);
	}

	/**
	* Deletes the employee designation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation that was removed
	* @throws PortalException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDesignation deleteEmployeeDesignation(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.deleteEmployeeDesignation(employeeDesignationId);
	}

	/**
	* Deletes the employee designation from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignation the employee designation
	* @return the employee designation that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDesignation deleteEmployeeDesignation(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.deleteEmployeeDesignation(employeeDesignation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeDesignationLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.hrms.model.EmployeeDesignation fetchEmployeeDesignation(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.fetchEmployeeDesignation(employeeDesignationId);
	}

	/**
	* Returns the employee designation with the primary key.
	*
	* @param employeeDesignationId the primary key of the employee designation
	* @return the employee designation
	* @throws PortalException if a employee designation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDesignation getEmployeeDesignation(
		long employeeDesignationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.getEmployeeDesignation(employeeDesignationId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee designations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.EmployeeDesignationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee designations
	* @param end the upper bound of the range of employee designations (not inclusive)
	* @return the range of employee designations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hrms.model.EmployeeDesignation> getEmployeeDesignations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.getEmployeeDesignations(start,
			end);
	}

	/**
	* Returns the number of employee designations.
	*
	* @return the number of employee designations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeDesignationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.getEmployeeDesignationsCount();
	}

	/**
	* Updates the employee designation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeDesignation the employee designation
	* @return the employee designation that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.EmployeeDesignation updateEmployeeDesignation(
		com.hrms.model.EmployeeDesignation employeeDesignation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.updateEmployeeDesignation(employeeDesignation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeDesignationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeDesignationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeDesignationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List getSerachEmployeeDesignations(
		java.lang.String designationName, java.lang.String status,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.getSerachEmployeeDesignations(designationName,
			status, andSearch, start, end, orderByComparator);
	}

	@Override
	public int getSearchEmployeeDesignationsCount(
		java.lang.String designationName, java.lang.String status,
		boolean andSearch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.getSearchEmployeeDesignationsCount(designationName,
			status, andSearch);
	}

	@Override
	public java.util.List<com.hrms.model.EmployeeDesignation> findByStatus(
		boolean stat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeDesignationLocalService.findByStatus(stat);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeDesignationLocalService getWrappedEmployeeDesignationLocalService() {
		return _employeeDesignationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeDesignationLocalService(
		EmployeeDesignationLocalService employeeDesignationLocalService) {
		_employeeDesignationLocalService = employeeDesignationLocalService;
	}

	@Override
	public EmployeeDesignationLocalService getWrappedService() {
		return _employeeDesignationLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeDesignationLocalService employeeDesignationLocalService) {
		_employeeDesignationLocalService = employeeDesignationLocalService;
	}

	private EmployeeDesignationLocalService _employeeDesignationLocalService;
}