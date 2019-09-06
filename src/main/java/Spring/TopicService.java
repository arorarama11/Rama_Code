package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ts")
@Scope("singleton")
public class TopicService {

	@Autowired
	@Qualifier("st")
	Topic to; //= new StrutsTopic();
	
	String askForTopic()
	{
		return to.getTopicName();
	}

	public void setTo(Topic to) {
		this.to = to;
	}
	
}
