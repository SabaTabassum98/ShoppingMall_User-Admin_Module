package com.cg.smm.repository;

import com.cg.smm.entities.MallAdmin;

public class IMallAdminRepository {
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin deleteMallAdmin(long id);
	public MallAdmin searchMallAdmin(long id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
