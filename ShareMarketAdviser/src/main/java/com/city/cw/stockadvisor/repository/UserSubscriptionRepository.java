package com.city.cw.stockadvisor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.city.cw.stockadvisor.model.UserSubscription;

@Repository
public interface UserSubscriptionRepository extends JpaRepository<UserSubscription,Long>{
	List<UserSubscription> findAllByUserID(Long userID);
	
	void deleteAllByUserID(Long userID);

	void deleteAllBySubID(Long subId);
	
}
