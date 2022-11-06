package org.sid.billingservice.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.sid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {

}
