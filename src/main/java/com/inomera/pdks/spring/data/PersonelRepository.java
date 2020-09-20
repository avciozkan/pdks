package com.inomera.pdks.spring.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inomera.pdks.model.Personel;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, String> {
	public Personel findByAd(String ad);

	public Personel findById(int per_id);
}
