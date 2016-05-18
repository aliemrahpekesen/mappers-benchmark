package com.ama;

import com.ama.benchmark.IMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class AmaBenchMarkingApplication {

    public static void main(String[] args) {
        String mappingType = args[0];
        long times = Integer.parseInt(args[1]);
        ConfigurableApplicationContext app = SpringApplication.run(AmaBenchMarkingApplication.class);
        if ("-d".equals(mappingType))
            mappingType = "dozerMapping";
        else if ("-m".equals(mappingType))
            mappingType = "manualMemberMapping";
        else if("-s".equals(mappingType))
            mappingType="selmaMapping";
        else if("-o".equals(mappingType))
            mappingType="orikaMapping";
        else if("-ms".equals(mappingType))
            mappingType="mapStructMapping";
        else {
            System.out.println("-d : DOZER // -s : SELMA // -o : ORIKA // -m : MANUAL // -ms : MAPSTRUCT // Please try again..");
            return;
        }
        ((IMapper) app.getBean(mappingType)).checkMappingAndReturnAvgInMiliseconds(times);
    }


}


