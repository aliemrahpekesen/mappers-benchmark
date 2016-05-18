package com.ama.service;

import com.ama.entity.MemberDTO;
import com.ama.model.Member;
import org.springframework.stereotype.Component;

/**
 * @author emrah.pekesen
 */
@Component
public class MapStructMemberMapper {
    public MemberDTO map(Member member) {
        MemberDTO memberDTO= IMapStructMemberMapper.mapper.toMemberDTO(member);
        return memberDTO;
    }
}
