package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Objective
{
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TopicService tst = (TopicService) context.getBean("ts");
		System.out.println(tst);
		System.out.println("hello" + " " + tst.askForTopic());
		
		Topic newTopic = new SpringTopic();
		tst.setTo(newTopic);
		System.out.println(tst);
		
		TopicService tst1 = (TopicService) context.getBean("ts");
		System.out.println(tst);		
		
		System.out.println("hello" + " " + tst.askForTopic());
		System.out.println("hello" + " " + tst1.askForTopic());
	}
}
