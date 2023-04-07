package org.acme.service.servicelmpl;

import org.acme.domain.Project;
import org.acme.domain.System;
import org.acme.repository.SystemDao;
import org.acme.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    @Resource
    private SystemDao systemDao;
    @Autowired
    public SystemServiceImpl(SystemDao systemDao){
        this.systemDao=systemDao;
    };
    @Override
    public System createService(System system) {
        if (systemDao.findBySystem_name(system.getSystem_name()) != null) {
            //条件无法新增
            return null;
        } else {
            System newSystem = systemDao.save(system);
            return newSystem;
        }
    }

    @Override
    public int deleteService(System system) {
        if(systemDao.findBySystem_id(system.getSystem_id())!=null){
            systemDao.deleteBySystem_id(system.getSystem_id());
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public List<System> findBySystemNameService(String searchContent) {
        return  systemDao.findSystemBySystem_name(searchContent);
    }

    @Override
    public List<System> findByTest_unitService(String searchContent) {
        return  systemDao.findSystemByTest_unit(searchContent);
    }

    @Override
    public List<System> findByFiling_certificate_numberService(String searchContent) {
        return  systemDao.findSystemByFiling_certificate_number(searchContent);
    }

    @Override
    public List<System> findByProtect_levelService(String searchContent) {
        return  systemDao.findSystemByProtect_level(searchContent);
    }

    @Override
    public List<System> findByTest_statusService(String searchContent) {
        return  systemDao.findSystemByTest_status(searchContent);
    }
}
