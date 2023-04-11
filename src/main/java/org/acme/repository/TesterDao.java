package org.acme.repository;

import org.acme.domain.Tester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesterDao extends JpaRepository<Tester,Long> {
    Tester findByTester_name(String tester_name);

    Tester findByTester_id(long tester_id);

    void deleteByTester_id(long tester_id);


}
