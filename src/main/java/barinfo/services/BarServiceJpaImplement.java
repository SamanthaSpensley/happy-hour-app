package barinfo.services;

import barinfo.models.BarInfo;
import barinfo.repositories.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BarServiceJpaImplement implements BarService {
    @Resource
    private BarRepository barRepo;

    @Override
    @Transactional
    public List<BarInfo> findAll() {
        return this.barRepo.findAll();
    }

    @Override
    @Transactional
    public BarInfo create(BarInfo barInfo) {
        return this.barRepo.save(barInfo);
    }
}