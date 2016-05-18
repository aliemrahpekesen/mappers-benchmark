package com.ama.service;

import com.ama.entity.MemberDTO;
import com.ama.model.Member;
import fr.xebia.extras.selma.Selma;
import org.springframework.stereotype.Component;

/**
 * @author emrah.pekesen
 */
@Component
public class SelmaMemberMapper {
    public MemberDTO map(Member member) {
        ISelmaMemberMapper mapper = Selma.mapper(ISelmaMemberMapper.class);
        MemberDTO memberDTO= mapper.asMemberDTO(member);
        return memberDTO;
    }
}
