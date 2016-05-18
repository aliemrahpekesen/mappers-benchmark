package com.ama.benchmark;

import com.ama.entity.MemberDTO;
import com.ama.model.EmailAddress;
import com.ama.model.EmailType;
import com.ama.model.Gender;
import com.ama.model.Member;
import com.ama.service.ManualMemberMapper;
import com.ama.util.DateTimeOps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

/**
 * Created by emrah.pekesen on 10.05.2016.
 */
@Component
public class ManualMemberMapping implements IMapper {

    @Autowired
    private ManualMemberMapper manualMemberMapper;

    private static long counter=1;

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

                memberDTO=manualMemberMapper.map(member);

                endTimeInMiliSeconds = DateTimeOps.getCurrentTimeInMiliSeconds();
                totalOfMiliSeconds += endTimeInMiliSeconds - startTimeInMiliSeconds;
            }

            System.out.println("Manual Map // Total Miliseconds   : " + totalOfMiliSeconds);
            System.out.println("Manual Map // Times               : " + times);
            System.out.println("Manual Map // Average Miliseconds : " + (double) totalOfMiliSeconds / (double) times);
            counter=1;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
