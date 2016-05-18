package com.ama.service;

import com.ama.entity.MemberDTO;
import com.ama.model.Member;
import org.springframework.stereotype.Component;

/**
 * Created by emrah.pekesen on 10.05.2016.
 */
@Component
public class ManualMemberMapper {

    public MemberDTO map(Member member) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(member.getId());
        memberDTO.setFirstName(member.getFirstName());
        memberDTO.setMiddleName(member.getMiddleName());
        memberDTO.setLastName(member.getLastName());
        memberDTO.setGender(member.getGender());
        memberDTO.setBirthDate(member.getBirthDate());
        memberDTO.setEmailList(member.getEmailList());
        return memberDTO;
    }
}
