package com.bdqn.service;

import com.bdqn.entity.MembersInfo;

import java.util.List;

public interface MembersInfoService {
    public List<MembersInfo> getMembersInfoList();
    public MembersInfo getMembersInfoByid(int id);
    public int updateMembersInfoById(MembersInfo membersInfo);
    public int deleteMembersInfoById(int id);

}
