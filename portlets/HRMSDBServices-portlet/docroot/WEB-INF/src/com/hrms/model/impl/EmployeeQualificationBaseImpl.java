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

package com.hrms.model.impl;

import com.hrms.model.EmployeeQualification;

import com.hrms.service.EmployeeQualificationLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the EmployeeQualification service. Represents a row in the &quot;HRMS_EmployeeQualification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeQualificationImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeQualificationImpl
 * @see com.hrms.model.EmployeeQualification
 * @generated
 */
public abstract class EmployeeQualificationBaseImpl
	extends EmployeeQualificationModelImpl implements EmployeeQualification {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee qualification model instance should use the {@link EmployeeQualification} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmployeeQualificationLocalServiceUtil.addEmployeeQualification(this);
		}
		else {
			EmployeeQualificationLocalServiceUtil.updateEmployeeQualification(this);
		}
	}
}