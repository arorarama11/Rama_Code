package Spring;

import org.springframework.stereotype.Component;


@Component("sp")
public class SpringTopic implements Topic{


	public String getTopicName() {
		
		return "Spring";
	}

	
}
