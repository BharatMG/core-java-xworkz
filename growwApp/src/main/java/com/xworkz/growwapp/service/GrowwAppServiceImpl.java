package com.xworkz.growwapp.service;

import com.xworkz.growwapp.dto.GrowwAppDTO;
import com.xworkz.growwapp.repository.GrowwAppRepository;
import com.xworkz.growwapp.repository.GrowwAppRepositoryImpl;

public class GrowwAppServiceImpl implements GrowwAppService {

	public GrowwAppServiceImpl() {
		System.out.println("GrowwAppServiceImpl constructor");
	}

	GrowwAppRepository repository=new GrowwAppRepositoryImpl();
	@Override
	public boolean checkAndSave(GrowwAppDTO dto) {
		if (dto!=null) {
		boolean save =repository.onSave(dto);
			
			
		}
		return false;
	}
}
