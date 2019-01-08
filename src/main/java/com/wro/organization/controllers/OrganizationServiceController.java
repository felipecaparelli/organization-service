package com.wro.organization.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wro.organization.model.Organization;
import com.wro.organization.services.OrganizationService;

@RestController
@RequestMapping(value = "/v1/organizations")
public class OrganizationServiceController {
	
	@Autowired
	private OrganizationService orgService;

	@RequestMapping(value = "/{organizationId}", method = RequestMethod.GET)
	public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
		return orgService.getOrg(organizationId);
	}

}
