package id.reinaldy.demo.service;

import id.reinaldy.demo.entity.DemoEntity;
import id.reinaldy.demo.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoService {

    private final DemoRepo demoRepo;

    @Autowired
    public DemoService(DemoRepo demoRepo) {
        this.demoRepo = demoRepo;
    }

    @Transactional(readOnly = true)
    public List<DemoEntity> getDemo(String name, String type) {
        System.out.println("getDemo => name: "+name+", type: "+type);
        return demoRepo.getDemoByNameAndType(name, type);
    }
}
