package com.d3vshub.delivery.repository;

import com.d3vshub.delivery.model.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Long> {


}
