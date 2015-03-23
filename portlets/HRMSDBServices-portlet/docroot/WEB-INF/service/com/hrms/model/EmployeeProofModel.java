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

package com.hrms.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmployeeProof service. Represents a row in the &quot;HRMS_EmployeeProof&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hrms.model.impl.EmployeeProofModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hrms.model.impl.EmployeeProofImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeProof
 * @see com.hrms.model.impl.EmployeeProofImpl
 * @see com.hrms.model.impl.EmployeeProofModelImpl
 * @generated
 */
public interface EmployeeProofModel extends BaseModel<EmployeeProof> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee proof model instance should use the {@link EmployeeProof} interface instead.
	 */

	/**
	 * Returns the primary key of this employee proof.
	 *
	 * @return the primary key of this employee proof
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee proof.
	 *
	 * @param primaryKey the primary key of this employee proof
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the employeeproof no of this employee proof.
	 *
	 * @return the employeeproof no of this employee proof
	 */
	public long getEmployeeproofNo();

	/**
	 * Sets the employeeproof no of this employee proof.
	 *
	 * @param employeeproofNo the employeeproof no of this employee proof
	 */
	public void setEmployeeproofNo(long employeeproofNo);

	/**
	 * Returns the proof ID of this employee proof.
	 *
	 * @return the proof ID of this employee proof
	 */
	public long getProofId();

	/**
	 * Sets the proof ID of this employee proof.
	 *
	 * @param proofId the proof ID of this employee proof
	 */
	public void setProofId(long proofId);

	/**
	 * Returns the user ID of this employee proof.
	 *
	 * @return the user ID of this employee proof
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this employee proof.
	 *
	 * @param userId the user ID of this employee proof
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employee proof.
	 *
	 * @return the user uuid of this employee proof
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this employee proof.
	 *
	 * @param userUuid the user uuid of this employee proof
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the expiration date of this employee proof.
	 *
	 * @return the expiration date of this employee proof
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this employee proof.
	 *
	 * @param expirationDate the expiration date of this employee proof
	 */
	public void setExpirationDate(Date expirationDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EmployeeProof employeeProof);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmployeeProof> toCacheModel();

	@Override
	public EmployeeProof toEscapedModel();

	@Override
	public EmployeeProof toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}