package org.otcl.test.benchmark.otcl2;


import org.otcl2.common.engine.profiler.dto.IndexedCollectionsDto;

import benchmark.test.PermanentEmployee;
import benchmark.test.ContractEmployee;
import benchmark.test.ContractEmployees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;


public class CP2 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CP2.class);
	
	public static void execute(ContractEmployees contractEmployees, IndexedCollectionsDto sourceICD,
			PermanentEmployee permanentEmployee, IndexedCollectionsDto targetICD,
			Map<String, Object> data) {
		
		IndexedCollectionsDto parentSourceICD = null;
		IndexedCollectionsDto memberSourceICD = null;
		int idx = 0;
		int len = 0;
		
		if (sourceICD == null) {
			LOGGER.warn("Cannot continue! No collections present in source-object.");
			return;
		}
		parentSourceICD = sourceICD.children.get("employees[*]");
		if (parentSourceICD == null || parentSourceICD.children == null || parentSourceICD.children.size() == 0) {
			LOGGER.warn("'employees[*]' is null!.");
			return;
		}
		memberSourceICD = parentSourceICD.children.get("0");
		if (memberSourceICD == null) {
			LOGGER.warn("'employees' is null!");
			return;
		}
		ContractEmployee employees = (ContractEmployee) memberSourceICD.profiledObject;
		String employeeName = employees.getEmployeeName();
		if (employeeName == null) {
			LOGGER.warn("'employees[*].employeeName' is null!.");
			return;
		}
		permanentEmployee.setEmployeeName(employeeName);
		return ;
	}
}