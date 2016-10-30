package services;

import models.BarInfo;
import java.util.List;

public interface BarService {
    List<BarInfo> findAll();
    BarInfo create(BarInfo barInfo);
}
