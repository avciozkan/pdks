package com.inomera.pdks.spring.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.inomera.pdks.model.PersonelGirisCikis;

@RepositoryRestController
public interface PersonelGirisCikisRepository extends CrudRepository<PersonelGirisCikis, Integer> {
	@Query("select t from PersonelGirisCikis t where t.personelid.id=:personelid order by giristarihi asc")
	public List<PersonelGirisCikis> findByPersonelID(@Param("personelid") int personelid);

	@Query("select t from PersonelGirisCikis t where t.personelid.id=:personelid and year(giristarihi)=:yil and month(giristarihi)=:ay order by giristarihi asc")
	public List<PersonelGirisCikis> findByPersonelID(@Param("personelid") int personelid, @Param("yil") int yil,
			@Param("ay") int ay);

}
