package org.otcl.core.converter;

import java.util.Map;

import org.otcl2.common.engine.converter.OtclConverter;


public class TestConverter implements OtclConverter {

	@Override
	public <T,S> T convert(T targetObject, S sourceObject, Map<String, Object> config) {
		// TODO Auto-generated method stub
		System.out.println("Testing - converter called!");
		return null;
	}

}
