package com.wro.organization.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wro.organization.model.Organization;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationRepository orgRepository;

	public Organization getOrg(String organizationId) {
		return orgRepository.findById(organizationId);
	}

}
