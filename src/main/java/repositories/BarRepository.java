package repositories;

import models.BarInfo;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarRepository extends JpaRepository<BarInfo, Long> {
//    @Query("SELECT * FROM BarInfo")
    List<BarInfo>findAll();
}