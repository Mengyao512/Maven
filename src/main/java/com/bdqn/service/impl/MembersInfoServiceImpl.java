package com.bdqn.service.impl;

import com.bdqn.dao.MembersInfoDao;
import com.bdqn.dao.impl.MembersInfoDaoImpl;
import com.bdqn.entity.MembersInfo;
import com.bdqn.service.MembersInfoService;

import java.util.List;

public class MembersInfoServiceImpl implements MembersInfoService {
    MembersInfoDao membersInfoDao = new MembersInfoDaoImpl();
    @Override
    public List<MembersInfo> getMembersInfoList() {
        return membersInfoDao.getListMembersInfo();

    }

    @Override
    public MembersInfo getMembersInfoByid(int id) {
        MembersInfo membersInfo = membersInfoDao.getMembersInfoById(id);
        return membersInfo;
    }

    @Override
    public int updateMembersInfoById(MembersInfo membersInfo) {
        return membersInfoDao.updateMembersInfo(membersInfo);
    }

    @Override
    public int deleteMembersInfoById(int id) {
        return membersInfoDao.deleteMembersInfoById(id);
    }
}
