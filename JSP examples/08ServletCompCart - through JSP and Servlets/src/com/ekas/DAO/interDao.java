 package com.ekas.DAO;

import java.sql.SQLException;
import java.util.List;

public interface interDao {
	public boolean search(String username, String pass) ;
	
	public boolean addProd(String itemName, Float itemQty);
	public boolean buyProd(String itemName, Float itemQty);
	public float searchProd(String itemName);
	public boolean deleteProd(String itemName);
	public List<product> searchAllProd();
}
