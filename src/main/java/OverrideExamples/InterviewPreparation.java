/*package OverrideExamples;

import java.util.HashSet;

class InterviewPreparation
{
	String name;
	int age;
	
	InterviewPreparation(String name, int age)
	{
        this.name = name;
        this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewPreparation other = (InterviewPreparation) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public static void main(String[] args)
	{
		InterviewPreparation ip = new InterviewPreparation("R", 20);
		InterviewPreparation ip1 = new InterviewPreparation("R", 20);
		
		HashSet<InterviewPreparation> s = new HashSet<>();
		s.add(ip);
		s.add(ip1);
		System.out.println(s.size());
		
	}
}*/