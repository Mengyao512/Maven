package com.bdqn.dao;

import com.bdqn.entity.MembersInfo;

import java.util.List;

public interface MembersInfoDao {
    public List<MembersInfo> getListMembersInfo();
    public MembersInfo getMembersInfoById(int id);
    public int updateMembersInfo(MembersInfo membersInfo);
    public int deleteMembersInfoById(int id);
}
