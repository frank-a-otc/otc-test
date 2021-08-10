package org.otcframework.test.benchmark.mapstruct;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KronosToAthenaMapStructMapper {
	
	@BeanMapping(ignoreByDefault = true)
	@Mapping(source = "mainPassengerName", target = "mainPassengerName")
	AthenaAirlinePassenger convertKronosToAthena(KronosAirlinePassenger kronosAirlinePassenger);
}
