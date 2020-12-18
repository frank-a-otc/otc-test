
package org.otcl;

import org.otcl2.common.engine.profiler.dto.IndexedCollectionsDto;
import org.otcl2.common.engine.executor.CodeExecutor;
import java.util.Map;
import java.util.HashMap;
import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class KronosToAthena
	implements CodeExecutor<KronosAirlinePassenger, AthenaAirlinePassenger> {
	
	@Override
	public AthenaAirlinePassenger execute(KronosAirlinePassenger kronosAirlinePassenger, IndexedCollectionsDto sourceICD,
			Map<String, Object> data) {
		
		AthenaAirlinePassenger athenaAirlinePassenger = new AthenaAirlinePassenger();
		IndexedCollectionsDto targetICD = new IndexedCollectionsDto();
		targetICD.children = new HashMap<>();
		
		org.otcl.TC_MPET_29.execute(kronosAirlinePassenger, sourceICD, athenaAirlinePassenger, targetICD, data);
		
		org.otcl.TC_MPET_30.execute(kronosAirlinePassenger, sourceICD, athenaAirlinePassenger, targetICD, data);
		return athenaAirlinePassenger;
	}
}