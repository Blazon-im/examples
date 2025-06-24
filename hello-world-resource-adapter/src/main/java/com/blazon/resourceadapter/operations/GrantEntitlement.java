package com.blazon.resourceadapter.operations;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.blazon.resourceadapter.api.provisioning.dto.ProvisioningResult;
import com.blazon.resourceadapter.api.provisioning.entitlement.operations.GrantEntitlementOperation;
import com.blazon.resourceadapter.api.provisioning.tracking.util.Tracking;

@Component
public class GrantEntitlement extends GrantEntitlementOperation {

	@Override
	public ProvisioningResult grantEntitlement(Map<String, Object> account, Map<String, Object> entitlement, Tracking tracking) {
		// TODO Auto-generated method stub
		return null;
	}

}