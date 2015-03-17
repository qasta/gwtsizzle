# Introduction #

GWT Sizzle is a GWT library that let you use the great [sizzlejs.com/ sizzlejs] - a javascript library for supporting CSS selectors on any browsers. Is the same library that jquery uses internally. Now it is available for GWT


# Getting started #

Using gwtsizzle in your GWT projects is simple. These are the steps:

  * First download the [gwtsizzle.jar](http://code.google.com/p/gwtsizzle/downloads/list).
  * Add it to your gwt project's java class path.
  * Add the following line in your project's GWT module definition (gwt.xml file) :

```
<inherits name="org.sgx.gwtsizzle.Sizzle" />
```

  * Now you are ready to use it, for example:

```
public class SizzleTest implements EntryPoint {

	@Override
	public void onModuleLoad() {

		// ala JavaScript
		JsArray<Element> result = Sizzle.sizzleArray("div p");
		for (int i = 0; i < result.length(); i++)
			System.out.println(result.get(i).getTagName());

		// ala Java
		for (Element e : Sizzle.sizzleCol("div p"))
			System.out.println(e.getTagName());

	}

}

```