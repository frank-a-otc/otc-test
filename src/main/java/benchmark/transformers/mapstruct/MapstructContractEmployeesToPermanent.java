/**
* Copyright (c) otcframework.org
*
* @author  Franklin J Abel
* @version 1.0
* @since   2020-06-08 
*
* This file is part of the OTC framework.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/
package benchmark.transformers.mapstruct;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import benchmark.dto.ContractEmployees;
import benchmark.dto.PermanentEmployee;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapstructContractEmployeesToPermanent {
	
	@BeanMapping(ignoreByDefault = true)
//	@Mapping(source = "employees.employeeName", target = "employeeName")
	PermanentEmployee convertContractToPermanent(ContractEmployees contractEmployees);
}
