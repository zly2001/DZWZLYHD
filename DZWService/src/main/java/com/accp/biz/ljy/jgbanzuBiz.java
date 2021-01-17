package com.accp.biz.ljy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ljy.jgbanzu;
import com.accp.entity.Artisan;
import com.accp.entity.Stars;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class jgbanzuBiz {
	@Resource
	private jgbanzu dao;
	
	public List<Artisan> jgbzselect(String  tid){
		return dao.jgbzselect(tid);
	}
	public int deleteArtisan(String tid) {			
		return dao.deleteArtisan(tid);
		}
	public int insertSelective(Artisan artisan) {
		return dao.insertSelective(artisan);
	}
	public int updateByPrimaryKeySelective(Artisan Artisan) {
		return dao.updateByPrimaryKeySelective(Artisan);
	}
}
