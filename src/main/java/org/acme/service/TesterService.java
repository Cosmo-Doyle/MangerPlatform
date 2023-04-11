package org.acme.service;

import org.acme.domain.System;
import org.acme.domain.Tester;

public interface TesterService {
    Tester createService(Tester tester);

    int deleteService(Tester oldTester);


}
