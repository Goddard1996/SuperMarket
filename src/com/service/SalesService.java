package com.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.entity.Member;
import com.entity.Sales;
import com.entity.SalesInfo;

/**
 * 商品销售信息记录Service接口
 * @author Goddard
 *
 */
public interface SalesService {
	/**
	 * 从dao层获得最大单号查询记录
	 * @return	sales对象 为空没有找到
	 */
	public Sales querySalesID(long gid) ; 
	
	
	/**
	 * 添加一条销售记录
	 * @param sales	销售记录
	 * @param mapGoods	商品集合
	 * @return	是否添加成功
	 */
	public boolean addSales(Sales sales,Map<Integer,Integer> mapGoods); 
	
	/**
	 * 获取全部页面
	 * @param 
	 * @return
	 */
	public Map<Sales,List<SalesInfo>>  getALLByMid(List<? extends Object> list,Date date1,Date date2);
	
	
	/**
	 * 根据时间查询记录
	 * @return
	 */
	public Map<Sales, List<SalesInfo>> getALLByDate(Date date);
	

	/**
	 * 查询前10销售的商品id和数量
	 * @return
	 */
	public Map<Integer, Integer> queryGid(Date date1 ,Date date2);
	
	/**
	 * 从dao层获取所有销售记录
	 * @return List<Sales>
	 */
	public List<Sales> queryAlls();
	
	/**
	 * 根据模糊salesid字段从数据控中获取Sales
	 * @param salesid 模糊字段 	
	 * @return List<Sales>
	 */
	public List<Sales> queryByFuzzyId(long salesid);
	
	public boolean addSales(Sales sales,List<SalesInfo> salesInfos);
}
