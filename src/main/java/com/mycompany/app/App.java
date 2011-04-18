package com.mycompany.app;

import org.apache.log4j.Logger;

/**
 * Main class to test json parser.
 * 
 */
public class App {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(App.class);
		try {
			log.info("Starting Json Parsing.");

			IMapperFactory mf = Mapper.getJsonMapperFactory();
			INotationObj obj = mf.createNotationObject(ClassLoader.getSystemResourceAsStream("all_case.txt"));
			log.info("is array, Expected: true, Actual: " + obj.isArray());
			log.info("");

			log.info("Inspecting element: 0");
			INotationObj subObj = obj.getINotationObj(0);
			log.info("is array, Expected: false, Actual: " + subObj.isArray());
			log.info("key: foo, Expected: bar, Acutual: " + subObj.getINotationObj("foo").toString());
			log.info("");
			
			log.info("Inspecting element: 1");
			subObj = obj.getINotationObj(1);
			log.info("is array, Expected: false, Actual: " + subObj.isArray());
			log.info("Inspecting element: foo1 of element: 1");
			INotationObj foo1 = subObj.getINotationObj("foo1");
			log.info("is array, Expected: true, Acutual: " + foo1.isArray());
			log.info("");
			
			log.info("Inspecting element: 0 of element: foo1");
			INotationObj foo1subObj = foo1.getINotationObj(0);
			log.info("is array, Expected: false, Acutual: " + foo1subObj.isArray());
			log.info("key: foo11, Expected: bar11, Acutual: " + foo1subObj.getINotationObj("foo11").toString());
			log.info("");
			
			log.info("Inspecting element: 1 of element: foo1");
			foo1subObj = foo1.getINotationObj(1);
			log.info("is array, Expected: false, Acutual: " + foo1subObj.isArray());
			log.info("key: foo12.foo121, Expected: bar121, Acutual: " + foo1subObj.getINotationObj("foo12").getINotationObj("foo121").toString());
			log.info("");
			
			log.info("Inspecting element: 2 of element: foo1");
			foo1subObj = foo1.getINotationObj(2);
			log.info("is array, Expected: false, Acutual: " + foo1subObj.isArray());
			log.info("key: foo13, Expected: bar13, Acutual: " + foo1subObj.getINotationObj("foo13").toString());
			log.info("");
			
			log.info("Inspecting element: 2");
			subObj = obj.getINotationObj(2);
			log.info("is array, Expected: true, Actual: " + subObj.isArray());
			log.info("");
			
			log.info("Inspecting element: 0 of element: 2");
			INotationObj subObjsub = subObj.getINotationObj(0);
			log.info("is array, Expected: false , Actual: " + subObjsub.isArray());
			log.info("key: foo21, Expected: bar21, Acutual: " + subObjsub.getINotationObj("foo21").toString());
			log.info("");
			
			log.info("Inspecting element: 1 of element: 2");
			subObjsub = subObj.getINotationObj(1);
			log.info("is array, Expected: false , Actual: " + subObjsub.isArray());
			log.info("key: foo22, Expected: bar22, Acutual: " + subObjsub.getINotationObj("foo22").toString());
			log.info("");
			
			log.info("Inspecting element: 3");
			subObj = obj.getINotationObj(3);
			log.info("is array, Expected: false, Actual: " + subObj.isArray());
			log.info("key: foo3, Expected: 32323, Acutual: " + subObj.getINotationObj("foo3").toString());
			log.info("key: foo31, Expected: bar31, Acutual: " + subObj.getINotationObj("foo31").toString());
			log.info("key: foo32, Expected: bar32, Acutual: " + subObj.getINotationObj("foo32").toString());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}
}
