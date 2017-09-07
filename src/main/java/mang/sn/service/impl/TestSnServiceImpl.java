package mang.sn.service.impl;

import org.springframework.transaction.annotation.Transactional;

import mang.sn.dao.SnNumberLogDAO;
import mang.sn.entity.SnNumberLog;
import mang.sn.generate.DayNumberGenerateServerDate;
import mang.sn.generate.DayNumberGenerate;
import mang.sn.generate.DayFormatNumberGenerate;
import mang.sn.generate.NumberGenerate;
import mang.sn.service.SnService;
import mang.sn.service.TestSnService;
import mang.sn.tools.SnType;

@Transactional
public class TestSnServiceImpl implements TestSnService {
	
	private SnService snService;
	
	private SnNumberLogDAO snNumberLogDAO;

	@Override
	public void testTransaction() {
		SnNumberLog snLog1=new SnNumberLog();
		snLog1.setRunMemo("取单号前");
//		snNumberLogDAO.save(snLog1);
		snNumberLogDAO.saveOrUpdate(snLog1);
		
		String sn=snService.doGetDayDateSn("QC", "Test");
		System.out.println(sn);
		
		SnNumberLog snLog2=new SnNumberLog();
		snLog2.setRunMemo("取单号后");
		snNumberLogDAO.save(snLog2);
		
		
	}

	@Override
	public void testYearSn() {
		String sn=snService.doGetSn("QC", "test", SnType.yearDate, null);
		System.out.println(sn);
	}

	@Override
	public void testWeekSn() {
		String sn=snService.doGetSn("QC", "test", SnType.weekDate, null);
		System.out.println(sn);
	}

	@Override
	public void testMonthSn() {
		String sn=snService.doGetSn("QC", "test", SnType.monthDate, null);
		System.out.println(sn);
	}

	@Override
	public void testDateSn() {
//		String sn=snService.doGetSn("QC", "test", SnType.dayDate, null);
		String sn=snService.doGetSn("QC", "test", SnType.dayDate, new DayFormatNumberGenerate());
		System.out.println(sn);
	}

	public SnService getSnService() {
		return snService;
	}

	public void setSnService(SnService snService) {
		this.snService = snService;
	}

	public SnNumberLogDAO getSnNumberLogDAO() {
		return snNumberLogDAO;
	}

	public void setSnNumberLogDAO(SnNumberLogDAO snNumberLogDAO) {
		this.snNumberLogDAO = snNumberLogDAO;
	}
	

}
