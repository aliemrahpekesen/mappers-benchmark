package com.ama.benchmark;

import org.springframework.stereotype.Component;

/**
 * Created by emrah.pekesen on 10.05.2016.
 */
@Component
public interface IMapper {
    void checkMappingAndReturnAvgInMiliseconds(long times);
}
