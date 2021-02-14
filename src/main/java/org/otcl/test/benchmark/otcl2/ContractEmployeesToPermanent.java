package org.otcl.test.benchmark.otcl2;


import org.otcl2.common.engine.profiler.dto.IndexedCollectionsDto;
import org.otcl2.common.executor.CodeExecutor;
import java.util.Map;
import java.util.HashMap;
import benchmark.test.PermanentEmployee;
import benchmark.test.ContractEmployees;

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