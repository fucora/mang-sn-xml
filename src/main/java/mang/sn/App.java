
package mang.sn;

import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mang.sn.service.TestSnService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DOMConfigurator.configure(ClassLoader.getSystemResource("conf/log4j.xml"));
        
        
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/applicationContext-mysql.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/applicationContext-oracle.xml");
        
//        TestSnService service=ctx.getBean(TestSnService.class);
        TestSnService service=(TestSnService) ctx.getBean("testSnService");
        service.testTransaction();
//          service.testDateSn();
//        service.testYearSn();
//        service.testMonthSn();
//        service.testWeekSn();
        
        
        
        System.out.println("hah");

    }
}
