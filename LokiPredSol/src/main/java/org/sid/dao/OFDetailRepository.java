package org.sid.dao;

import java.util.List;

import org.sid.entities.OFDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OFDetailRepository extends JpaRepository<OFDetail, Long>{

	@Query(value="select * from open_fault_detail f where f.acf_regcod_nospace LIKE %:keyword%", nativeQuery = true)
	List<OFDetail> findByKeyword(@Param("keyword") String keyword);
}
