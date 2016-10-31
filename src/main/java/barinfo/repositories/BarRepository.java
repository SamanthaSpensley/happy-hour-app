package barinfo.repositories;

import barinfo.models.BarInfo;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BarRepository extends JpaRepository<BarInfo, Long> {
    List<BarInfo>findAll();
}