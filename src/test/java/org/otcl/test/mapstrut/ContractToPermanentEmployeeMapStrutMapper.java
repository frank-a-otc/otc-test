package org.otcl.test.mapstrut;

import org.mapstruct.Mapper;
import org.otcl.test.dto.ContractEmployee;
import org.otcl.test.dto.PermanentEmployee;

@Mapper
public interface ContractToPermanentEmployeeMapStrutMapper {
	
//	@Mapping(source = "name", target = "name")
	PermanentEmployee convertContractToPermanentEmployee(ContractEmployee contractEmployee);
}
