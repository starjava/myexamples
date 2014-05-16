package com.spring.mapper;

import org.apache.ibatis.annotations.Param;
import com.spring.entity.LoginLog;
/**
 * 登录日志Dao
 * 
 * @author Administrator
 *  
 */
public interface ILoginLogDao {


	/**
	 * 添加登录日志信息
	 * 
	 * @param loginlog
	 */
	public void insertLoginLog(@Param("loginlog") LoginLog loginlog);
}
