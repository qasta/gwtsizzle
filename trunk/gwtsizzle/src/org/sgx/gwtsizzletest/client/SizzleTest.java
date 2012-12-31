package org.sgx.gwtsizzletest.client;

import org.sgx.gwtsizzle.client.Sizzle;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

public class SizzleTest implements EntryPoint {

@Override
public void onModuleLoad() {
	
//Sizzle sizzle = Sizzle.get(); 

//ala JavaScript
JsArray<Element> result = Sizzle.sizzleArray("div p"); 
for (int i = 0; i < result.length(); i++) 
	System.out.println(result.get(i).getTagName());	

//ala Java
for(Element e : Sizzle.sizzleCol("div p")) 
	System.out.println(e.getTagName());
	
}

}
