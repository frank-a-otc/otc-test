package org.otcframework.test.benchmark.otc;


import java.util.HashMap;
import java.util.Map;

import org.otcframework.common.engine.indexer.dto.IndexedCollectionsDto;
import org.otcframework.common.executor.CodeExecutor;

import benchmark.test.ContractEmployees;
import benchmark.test.PermanentEmployee;

public class ContractEmployeesToPermanent
	implements CodeExecutor<ContractEmployees, PermanentEmployee> {
	
	@Override
	public PermanentEmployee execute(ContractEmployees contractEmployees, IndexedCollectionsDto sourceICD,
			Map<String, Object> data) {
		
		PermanentEmployee permanentEmployee = new PermanentEmployee();
		IndexedCollectionsDto targetICD = new IndexedCollectionsDto();
		targetICD.children = new HashMap<>();
		
		CP2.execute(contractEmployees, sourceICD, permanentEmployee, targetICD, data);
		return permanentEmployee;
	}
}