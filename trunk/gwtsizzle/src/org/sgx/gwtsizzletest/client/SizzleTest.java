package org.sgx.gwtsizzletest.client;

import org.sgx.gwtsizzle.client.Sizzle;

import com.google.gwt.core.client.EntryPoint;

public class SizzleTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		System.out.println(Sizzle.get().sizzleArray("div p").length());
	}

}
