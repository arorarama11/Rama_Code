package Spring;

import org.springframework.stereotype.Component;

@Component("st")
public class StrutsTopic implements Topic {

public String getTopicName() {
		
		return "Struts";
	}
}
