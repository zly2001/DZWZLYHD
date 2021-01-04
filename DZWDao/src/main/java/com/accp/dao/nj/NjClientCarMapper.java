package com.accp.dao.nj;

import java.util.List;

import com.accp.entity.Clientcar;

public interface NjClientCarMapper {
	/**
	 * 根据编号删除用户车辆
	 * @param cno
	 * @return
	 */
	  int deleteByPrimaryKey(String cno);
	  /**
	   * 新增用户下的所属车辆
	   * @param record
	   * @return
	   */
	    int insert(Clientcar record);
	    /**
	     * 新增用户写的所属车辆
	     * @param record
	     * @return
	     */
	    int insertSelective(Clientcar record);
	    /**
	     * 根据用户编号查询用户名下车辆
	     * @param cno
	     * @return
	     */
	    Clientcar selectByPrimaryKey(String cno);
	    /**
	     * 修改用户车辆
	     * @param record
	     * @return
	     */
	    int updateByPrimaryKeySelective(Clientcar record);
	    /**
	     * 修改用户车辆
	     * @param record
	     * @return
	     */
	    int updateByPrimaryKey(Clientcar record);
	    /**
	     * 查询所有用户车辆
	     * @return
	     */
	    List<Clientcar> queryAllClientCarMessage();
}
