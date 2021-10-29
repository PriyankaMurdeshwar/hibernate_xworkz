package com.xworkz.tv;

import com.xworkz.tv.dao.TvDAO;
import com.xworkz.tv.dao.TvDAOImpl;

public class TvTester {

	public static void main(String[] args) {

		TvDAO tv = new TvDAOImpl();
		// tv.saveTvEntity();
		tv.getTvEntity();
		// tv.updateTvEntity();
		// tv.deleteTvEntity();
	}
}
