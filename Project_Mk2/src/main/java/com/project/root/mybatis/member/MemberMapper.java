package com.project.root.mybatis.member;

import com.project.root.member.dto.MemberDTO;

public interface MemberMapper {

	public MemberDTO user_check(String id);

}
