package com.blazon.resourceadapter.operations;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.blazon.resourceadapter.api.provisioning.account.operations.RevokeAccountOperation;
import com.blazon.resourceadapter.api.provisioning.dto.ProvisioningResult;
import com.blazon.resourceadapter.api.provisioning.tracking.util.Tracking;

@Component
public class RevokeAccount extends RevokeAccountOperation {

	@Override
	public ProvisioningResult revokeAccount(Map<String, Object> account, Tracking tracking) {
		// TODO Auto-generated method stub
		return null;
	}

}