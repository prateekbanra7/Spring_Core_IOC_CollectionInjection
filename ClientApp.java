package in.abc.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.abc.bean.College;
import in.abc.bean.ContactsInfo;
import in.abc.bean.MarksInfo;
import in.abc.bean.UniversityInfo;

public class ClientApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/abc/cfg/applicationContext.xml");

		// Array object is injected
		MarksInfo marksInfo = factory.getBean("marksInfo", MarksInfo.class);
		System.out.println(marksInfo);
		
		System.out.println();

		//List object is injected
		College clg = factory.getBean("college", College.class);
		System.out.println(clg);
		
		System.out.println();

		//Set object is injected
		ContactsInfo info = factory.getBean("cinfo", ContactsInfo.class);
		System.out.println(info);
		
		System.out.println(); 
		
		//Map object is injecting
		UniversityInfo universityInfo = factory.getBean("university", UniversityInfo.class);
		System.out.println(universityInfo);
	}
}
