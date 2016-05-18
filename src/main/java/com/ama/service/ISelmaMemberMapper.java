package com.ama.service;

import com.ama.entity.MemberDTO;
import com.ama.model.Member;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

/**
 * @author emrah.pekesen
 */
@Mapper(withCustomFields = {
        @Field({"id", "id"}),
        @Field({"firstName", "firstName"}),
        @Field({"middleName", "middleName"}),
        @Field({"lastName", "lastName"}),
        @Field({"birthDate", "birthDate"}),
        @Field({"gender", "gender"}),
        @Field({"emailList", "emailList"})
})
public interface ISelmaMemberMapper {
    MemberDTO asMemberDTO(Member source);
}