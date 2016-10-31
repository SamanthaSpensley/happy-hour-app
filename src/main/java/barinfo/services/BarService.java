package barinfo.services;

import barinfo.models.BarInfo;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface BarService {
    List<BarInfo> findAll();
    BarInfo create(BarInfo barInfo);
}
