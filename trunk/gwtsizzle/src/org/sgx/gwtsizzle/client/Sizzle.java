package org.sgx.gwtsizzle.client;

import java.util.Collection;

import org.sgx.gwtsizzle.client.jsutil.JsArrayCollection;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

/**
 * Main Sizzle object - this GWT overlay type will wrapp the global Sizzle object.
 * @see https://github.com/jquery/sizzle/wiki/Sizzle-Documentation
 * 
 * @author sg
 * 
 */
public class Sizzle extends JavaScriptObject {
	protected Sizzle() {
	}

	public static final native Sizzle get()/*-{
		return $wnd.Sizzle;
	}-*/;

	/**
	 * This is the main function for finding elements. It will use querySelectorAll if available.
	 * 
	 * @param selector
	 *            A css selector
	 * @return all of the elements matching the selector
	 */
	public final native JsArray<Element> sizzleArray(String selector)/*-{
		return $wnd.Sizzle(selector);
	}-*/;

	/**
	 * This is the main function for finding elements. It will use querySelectorAll if available.
	 * 
	 * @param selector
	 *            A css selector
	 * @return all of the elements matching the selector
	 */
	public final native Collection<Element> sizzleCol(String selector)/*-{
		return @org.sgx.gwtsizzle.client.jsutil.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)($wnd.Sizzle(selector)); 
	}-*/;

	/**
	 * This is the main function for finding elements. It will use querySelectorAll if available.
	 * 
	 * @param selector
	 *            A css selector
	 * @param context
	 *            An element or document to use as the context for finding elements. The default is the current document.
	 * @return all of the elements matching the selector
	 */
	public final native JsArray<Element> sizzleArray(String selector, Element context)/*-{
		return $wnd.Sizzle(selector, context);
	}-*/;

	/**
	 * This is the main function for finding elements. It will use querySelectorAll if available.
	 * 
	 * @param selector
	 *            A css selector
	 * @param context
	 *            An element or document to use as the context for finding elements. The default is the current document.
	 * @return all of the elements matching the selector
	 */
	public final native Collection<Element> sizzleCol(String selector, Element context)/*-{
		return @org.sgx.gwtsizzle.client.jsutil.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)($wnd.Sizzle(selector, context)); 
	}-*/;

	/**
	 * This is the main function for finding elements. It will use querySelectorAll if available.
	 * 
	 * @param selector
	 *            A css selector
	 * @param context
	 *            An element or document to use as the context for finding elements. The default is the current document.
	 * @return all of the elements matching the selector
	 */
	public final native JsArray<Element> sizzleArray(String selector, Element context, JsArray<Element> results)/*-{
		return $wnd.Sizzle(selector, context, results);
	}-*/;

	/**
	 * This is the main function for finding elements. It will use querySelectorAll if available.
	 * 
	 * @param selector
	 *            A css selector
	 * @param context
	 *            An element or document to use as the context for finding elements. The default is the current document.
	 * @return all of the elements matching the selector
	 */
	public final native Collection<Element> sizzleCol(String selector, Element context,
			JsArrayCollection<Element> results)/*-{
		var r = results.@org.sgx.gwtsizzle.client.jsutil.JsArrayCollection::_data; 
		return @org.sgx.gwtsizzle.client.jsutil.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)($wnd.Sizzle(selector, context, r)); 
	}-*/;
	
	/**
	 * Uses native matchesSelector if available.
	 * @param element A DOMElement against which Sizzle will test the selector
	 * @param selector A css selector
	 * @return  whether the given element matches the selector
	 */
	public final native boolean matchesSelector(Element element, String selector)/*-{
		return this.matchesSelector(element, selector); 
	}-*/;
	
	/**
	 * 
	 * @param selector A css selector
	 * @param elements An array of DOMElements to filter against the specified selector.
	 * @return  All the elements in the set that match the given selector.
	 */
	public final native JsArray<Element> matches(String selector, JsArray<Element> elements)/*-{
		return this.matches(selector, elements); 
	}-*/;


	/**
	 * 
	 * @param selector A css selector
	 * @param elements An array of DOMElements to filter against the specified selector.
	 * @return  All the elements in the set that match the given selector.
	 */
	public final native Collection<Element> matches(String selector, JsArrayCollection<Element> elements)/*-{
		var r = elements.@org.sgx.gwtsizzle.client.jsutil.JsArrayCollection::_data; 
		return @org.sgx.gwtsizzle.client.jsutil.JsUtil::toJavaCollection(Lcom/google/gwt/core/client/JavaScriptObject;)(this.matches(selector, r)); 
	}-*/;
	
}
