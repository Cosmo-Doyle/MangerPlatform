package org.acme.service;

import org.acme.domain.System;

import java.util.List;

public interface SystemService {
    System createService(System newSystem);

    int deleteService(System oldSystem);

    List<System> findBySystemNameService(String searchContent);

    List<System> findByTest_unitService(String searchContent);

    List<System> findByFiling_certificate_numberService(String searchContent);

    List<System> findByProtect_levelService(String searchContent);

    List<System> findByTest_statusService(String searchContent);
}
