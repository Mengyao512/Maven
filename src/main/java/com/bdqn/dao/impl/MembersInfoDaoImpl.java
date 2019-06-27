package com.bdqn.dao.impl;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.MembersInfoDao;
import com.bdqn.entity.MembersInfo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MembersInfoDaoImpl extends BaseDao implements MembersInfoDao {
    @Override
    public List<MembersInfo> getListMembersInfo() {
        List<MembersInfo> list = new ArrayList<MembersInfo>();
        String sql = "select * from membersInfo";
        ResultSet rs = null;
        MembersInfo membersInfo = null;
        try {
            rs = this.executeQuery(sql);
            while (rs.next()){
                membersInfo = new MembersInfo();
                membersInfo.setId(rs.getInt("id"));
                membersInfo.setMname(rs.getString("mname"));
                membersInfo.setMgender(rs.getString("mgender"));
                membersInfo.setMage(rs.getInt("mage"));
                membersInfo.setMaddress(rs.getString("maddress"));
                membersInfo.setMemail(rs.getString("memail"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MembersInfo getMembersInfoById(int id) {
        String sql = "select * from membersInfo where id=?";
        Object[]objects= {id};
        ResultSet rs = null;
        MembersInfo membersInfo = null;
        try {
            rs=this.executeQuery(sql);
            membersInfo = new MembersInfo();
            membersInfo.setId(rs.getInt("id"));
        }catch (Exception e){
            e.printStackTrace();
        }
        return membersInfo;
    }

    @Override
    public int updateMembersInfo(MembersInfo membersInfo) {
        String sql = "update membersInfo set mname=?,mgender=?,mage=?,maddress=?,memail=? where id =?";
        Object[]objects ={membersInfo.getMname(),membersInfo.getMgender(),membersInfo.getMage(),membersInfo.getMaddress(),membersInfo.getMemail(),membersInfo.getId()};
        return this.executeUpdate(sql,objects);
    }

    @Override
    public int deleteMembersInfoById(int id) {
        String sql = "delete from membersInfo where id=?";
        Object[]objects ={id};
        return this.executeUpdate(sql,objects);
    }
}
