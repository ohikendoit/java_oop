package com.ktdsuniversity.edu.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.vo.MemberVO;

public class MapMemberDAOImpl implements MemberDAO{

	private Map<String, MemberVO> dataSource;
	
	public MapMemberDAOImpl() {
		dataSource = new HashMap<>();
	}
	
	@Override
	public int create(MemberVO memberVO) {
		// TODO Auto-generated method stub
		dataSource.put(memberVO.getId(), memberVO);
		return 1;
	}

	@Override
	public List<MemberVO> readAll() {
		// TODO Auto-generated method stub
		return dataSource.entrySet()
						  .stream()
						  .map(entry -> entry.getValue())
						  .collect(Collectors.toList());
		
	}

}
