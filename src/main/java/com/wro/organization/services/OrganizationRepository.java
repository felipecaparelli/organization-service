package com.wro.organization.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wro.organization.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {

	public Organization findById(String organizationId);
}
