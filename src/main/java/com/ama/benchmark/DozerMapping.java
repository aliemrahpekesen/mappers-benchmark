package com.ama.benchmark;

import com.ama.entity.MemberDTO;
import com.ama.model.EmailAddress;
import com.ama.model.EmailType;
import com.ama.model.Gender;
import com.ama.model.Member;
import com.ama.util.DateTimeOps;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by emrah.pekesen on 09.05.2016.
 */

@Component
public class DozerMapping implements IMapper {

    @Autowired
    private DozerBeanMapper dozerMapper;

    private static long counter=1;

    public void checkMappingAndReturnAvgInMiliseconds(long times) {
        long totalOfMiliSeconds = 0;
        long startTimeInMiliSeconds = 0;
        long endTimeInMiliSeconds = 0;


        try {
            for (int i = 0; i < times; i++) {
                startTimeInMiliSeconds = DateTimeOps.getCurrentTimeInMiliSeconds();
                Member member = new Member();
                MemberDTO memberDTO = new MemberDTO();

                member.setId(UUID.randomUUID().getLeastSignificantBits());
                member.setFirstName("Ali");
                member.setMiddleName("Emrah");
                member.setLastName("PEKESEN");
                member.setGender(Gender.Male);
                member.setBirthDate(new GregorianCalendar(1986, 02, 11).getTime());

                List<EmailAddress> emails = new ArrayList<>();
                EmailAddress personal = new EmailAddress();
                personal.setId(UUID.randomUUID().getLeastSignificantBits());
                personal.setEmailAddress("aliemrahpekesen@gmail.com");
                personal.setEmailType(EmailType.Personal);
                personal.setPreferred(true);
                emails.add(personal);
                EmailAddress business = new EmailAddress();
                business.setId(UUID.randomUUID().getLeastSignificantBits());
                business.setEmailAddress("emrah.pekesen@amadeus.com");
                business.setEmailType(EmailType.Business);
                business.setPreferred(false);
                emails.add(business);

                member.setEmailList(emails);

                dozerMapper.map(member, memberDTO);

                endTimeInMiliSeconds = DateTimeOps.getCurrentTimeInMiliSeconds();
                totalOfMiliSeconds += endTimeInMiliSeconds - startTimeInMiliSeconds;
                counter=1;
            }

            System.out.println("Dozer // Total Miliseconds  : " + totalOfMiliSeconds);
            System.out.println("Dozer // Times              : " + times);
            System.out.println("Dozer // Average Milisecods : " + (double) totalOfMiliSeconds / (double) times);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
