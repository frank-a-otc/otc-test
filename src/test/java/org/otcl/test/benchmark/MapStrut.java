/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.otcl.test.benchmark;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;

import org.mapstruct.factory.Mappers;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;
import org.otcl.test.AbstractTest;
import org.otcl.test.dto.ContractEmployee;
import org.otcl.test.dto.PermanentEmployee;
import org.otcl.test.mapstrut.ContractToPermanentEmployeeMapStrutMapper;
import org.otcl2.common.OtclConstants;
import org.otcl2.common.config.OtclConfig;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.core.engine.OtclEngineImpl;

import com.kronos.airlines.dto.KronosAirlinePassenger;

public class MapStrut extends AbstractTest {

	private static KronosAirlinePassenger kronosAirlinePassenger;
	private static ContractEmployee contractEmployee = null;
	private static OtclEngine otclEngine = (OtclEngineImpl) OtclEngineImpl.instance;
	private static ContractToPermanentEmployeeMapStrutMapper mapper = null;
	private static JAXBContext jaxbContext;
	private static String otclFileName = "org.otcl.test.dto.PermanentEmployee-org.otcl.test.dto.ContractEmployee.otcl";
//	private static String otclFileName = "org.otcl.airlines.athena.dto.AthenaAirlinePassenger-org.otcl.airlines.kronos.dto.KronosAirlinePassenger.otcl";
	private static String deploymentId = OtclConstants.DEFAULT_NAMESPACE + "." + otclFileName;

	public static void main(String[] args) throws IOException  {
		org.openjdk.jmh.Main.main(args);
//		new MyBenchmark().testOtcl();
	}

    @State(Scope.Thread)
    public static class MyState {

    	public static int counter;
    	@Setup(Level.Trial)
        public void doSetup() {
    		contractEmployee = loadContractEmployeeFromXml();
//    		kronosAirlinePassenger = loadKronosXml();
    		OtclConfig.enableTestProfile();
    		otclEngine.deploy();
//    		try {
//    			jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
//    		} catch (JAXBException e) {
//    			e.printStackTrace();
//    		}
    		counter = 0;
    		System.out.println("initilized MapStrut test..............."); 
        }

        @TearDown(Level.Trial)
        public void doTearDown() {
        	System.out.println("Total operations - " + counter);
        }

    }
    
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 50, time = 200, timeUnit = TimeUnit.MILLISECONDS)
    public void testMapStrut(MyState myState) {
		if (mapper == null) {
			System.out.println("loaded..............."); 
		}
		mapper = Mappers.getMapper(ContractToPermanentEmployeeMapStrutMapper.class);
		PermanentEmployee permanentEmployee = mapper.convertContractToPermanentEmployee(contractEmployee);
		myState.counter++;
//		print(athenaAirlinePassenger, jaxbContext); 
    }

}
