package services;

import models.BarInfo;
import repositories.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public class BarServiceJpaImplement implements BarService {
    @Autowired
    private BarRepository barRepo;

    @Override
    public List<BarInfo> findAll() {
        return this.barRepo.findAll();
    }

    @Override
    public BarInfo create(BarInfo barInfo) {
        return this.barRepo.save(barInfo);
    }
}