package org.sid.dao;

import org.sid.entities.SharedRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharedRequestRepository extends JpaRepository<SharedRequest, Long>{

}
