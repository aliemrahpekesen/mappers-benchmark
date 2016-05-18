package com.ama.benchmark;

import com.ama.entity.MemberDTO;
import com.ama.model.EmailAddress;
import com.ama.model.EmailType;
import com.ama.model.Gender;
import com.ama.model.Member;
import com.ama.service.OrikaMemberMapper;
import com.ama.util.DateTimeOps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

/**
 * Created by emrah.pekesen on 11.05.2016.
 */
@Component
public class OrikaMapping implements  IMapper {

    @Autowired
    private OrikaMemberMapper orikaMemberMapper;

    private static long counter=1;
    @Override
    public void checkMappingAndReturnAvgInMiliseconds(long times) {
        long totalOfMiliSeconds = 0;
        long startTimeInMiliSeconds = 0;
        long endTimeInMiliSeconds = 0;


        try {
            for (int i = 0; i < times; i++) {
                startTimeInMiliSeconds = DateTimeOps.getCurrentTimeInMiliSeconds();
                Member member = new Member();
                MemberDTO memberDTO;

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

                memberDTO=orikaMemberMapper.map(member);
                endTimeInMiliSeconds = DateTimeOps.getCurrentTimeInMiliSeconds();
                totalOfMiliSeconds += endTimeInMiliSeconds - startTimeInMiliSeconds;
            }

            System.out.println("Orika // Total Miliseconds   : " + totalOfMiliSeconds);
            System.out.println("Orika // Times               : " + times);
            System.out.println("Orika // Average Miliseconds : " + (double) totalOfMiliSeconds / (double) times);
            counter=1;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
