package org.otcframework.test.benchmark.mapstruct;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import benchmark.test.ContractEmployee;
import benchmark.test.PermanentEmployee;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapstructContractToPermanentEmployee {
	
	@BeanMapping(ignoreByDefault = true)
	@Mapping(source = "employeeName", target = "employeeName")
	PermanentEmployee convertContractToPermanent(ContractEmployee contractEmployee);
}