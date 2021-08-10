package org.otcframework.test.benchmark.mapstruct;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import benchmark.test.ContractEmployees;
import benchmark.test.PermanentEmployee;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapstructContractEmployeesToPermanent {
	
	@BeanMapping(ignoreByDefault = true)
//	@Mapping(source = "employees.employeeName", target = "employeeName")
	PermanentEmployee convertContractToPermanent(ContractEmployees contractEmployees);
}
