package org.acme.service.servicelmpl;

import org.acme.domain.Tester;
import org.acme.repository.TesterDao;
import org.acme.service.TesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class TesterServiceImpl implements TesterService {

    @Resource
    private TesterDao testerDao;

    @Autowired
    public TesterServiceImpl(TesterDao testerDao){
        this.testerDao=testerDao;
    };
    @Override
    public Tester createService(Tester tester) {
        if(testerDao.findByTester_id(tester.getTester_id())!=null){
            return null;
        }else{
            Tester newTester=testerDao.save(tester);
            return newTester;
        }
    }

    @Override
    public int deleteService(Tester oldTester) {
        if(testerDao.findByTester_id(oldTester.getTester_id())!=null){
            testerDao.deleteByTester_id(oldTester.getTester_id());
            return 1;
        }else {
            return 0;
        }
    }
}
