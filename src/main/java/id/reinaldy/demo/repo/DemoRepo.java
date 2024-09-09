package id.reinaldy.demo.repo;

import id.reinaldy.demo.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface DemoRepo extends JpaRepository<DemoEntity, Long> {

    @Query(value = "select * from demo d " +
            "where d.NAME = :name " +
            "and d.TYPE = :type ", nativeQuery = true)
    List<DemoEntity> getDemoByNameAndType(String name, String type);

}
