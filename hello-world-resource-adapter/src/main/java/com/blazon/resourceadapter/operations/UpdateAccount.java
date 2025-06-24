package com.blazon.resourceadapter.operations;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.blazon.resourceadapter.api.provisioning.account.operations.UpdateAccountOperation;
import com.blazon.resourceadapter.api.provisioning.dto.ProvisioningResult;
import com.blazon.resourceadapter.api.provisioning.tracking.util.Tracking;

@Component
public class UpdateAccount extends UpdateAccountOperation {

	@Override
	public ProvisioningResult updateAccount(Map<String, Object> account, Tracking tracking) {
		// TODO Auto-generated method stub
		return null;
	}

}