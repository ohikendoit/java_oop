package com.ktdsuniversity.edu.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.vo.MemberVO;

public class ListMemberDAOImpl implements MemberDAO {

		private List<MemberVO> dataSource;
		
		public ListMemberDAOImpl() {
			dataSource = new ArrayList<>();
		}

		@Override
		public int create(MemberVO memberVO) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<MemberVO> readAll() {
			// TODO Auto-generated method stub
			return null;
		}

		
}
