package com.ama.service;

import com.ama.entity.MemberDTO;
import com.ama.model.Member;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

/**
 * Created by emrah.pekesen on 11.05.2016.
 */
@Component
public class OrikaMemberMapper {
    public MemberDTO map(Member member) {
        MemberDTO memberDTO;
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        memberDTO = mapper.map(member, MemberDTO.class);
        return memberDTO;
    }
}
