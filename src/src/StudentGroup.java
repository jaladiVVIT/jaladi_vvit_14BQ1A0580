import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation extends Exception {

	private Student[] students;
	Date d=new Date();
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
			throw new IllegalArgumentException;
		else
		{
			students[students.length()].id=students.id;
			students[students.length()].birthDate=students.birthDate;
			students[students.length()].avgMark=students.avgMark;
			students[students.length()].fullName=students.fullName;
		}
	}

	@Override
	public Student getStudent(int index) {
		{
		if(index<0 || index>=students.length())
			throw  new IllegalArgumentException;
		return students[index];
	}

	}

	@Override
	public void setStudent(Student student, int index) {
		if(student==null)
			throw new IllegalArgumentException;
		else
		{
			if(index<0 || index>=students.length())
				throw new IllegalArgumentException;
			else
			{
				students[index]=student;
			}
		}
	}

	@Override
	public void addFirst(Student student) {
		for(int i=students.length();i>=1;i--)
		{
			students[i]=students[i-1];
		}
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		students[students.length()]=student;
	}

	@Override
	public void add(Student student, int index) {
		if(index<0 || index>students.length()+1)
			throw IllegalArgumentException;
		if(index==0)
			addFirst(student);
		if(index==student.length())
			addLast(student);
		for(int i=students.length();i>=index+1;i--)
		{
			student[i]=students[i-1];
		}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		if(index<0 || index>students.length()+1)
			throw IllegalArgumentException;
		for(int i=index;i<students.length();i++)
		{
			students[i]=students[i+1];
		}
		
	}

	@Override
	public void remove(Student student) {
		if(student==null)
			throw IllegalArgumentException;
		else
		{
			for(int i=0;i<n;i++)
			{
				if(students[i]==student)
				{	
					for(int j=i;j<students.length();j++)
					{
						students[j]=students[j+1];
					}
				}
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0 || index>students.length()+1)
			throw IllegalArgumentException;
		for(int i=index;i<students.length();i++)
		{
			students[i]=null;
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
	if(student==null)
			throw IllegalArgumentException;
	else
	{
		for(int i=0;i<students.index();i++)
		{
			if(students[i]=student)
				break;
		}
		for(int j=i;j<students.index();j++)
			students[j]=null;
		
	}
}

	@Override
	public void removeToIndex(int index) {
		if(index<0 || index>students.length()+1)
			throw IllegalArgumentException;
		else
		{
			for(int j=0,i=index;i<students.length();i++,j++)
			{
				students[j]=students[i];
			}
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null)
			throw IllegalArgumentException;
		else
		{
			for(int i=0;i<students.length();i++)
			{
				if(students[i]==student)
				{
					break;
				}
			}
			for(int i=0;j=i;j<students.length();i++,j++)
			{
				students[i]=students[j];
			}
					
		}
	}

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null)
		throw new IllegalArgumentException;
		Student[] arr_;
		int j=0;
		for(int i=0;i<students.length();i++)
		{
			if(date==students.birthDate)
				arr_[j++]=students[i];
		}
		return arr_;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if(firstDate==null || lastDate==null)
			throw new IllegalArgumentException;
		Student[] arr_;
		int j=0;
		for(int i=0;i<students.length();i++)
		{
			if(firstDate<students.birthDate || lastDate>students.birthDate)
				arr_[j++]=students[i];
		}
		return arr_;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		
		
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {	
		return d.getDate()-students[indexOfStudent];
		
		
	}

	@Override
	public Student[] getStudentsByAge(int age) {
	Student[] arr_;
	int j=0;
	for(int i=0;i<students.length()-1;i++)
		{
			if(age==students[i].birthDate)
			arr_[j++]=students[i];
		}
		return arr_;
		
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		int max=0,j=0;
		Student[] arr_;
		for(int i=0;i<students.length()-1;i++)
		{	
			if(max<students[i].avgMark)
				max=students[i].avgMark;
		}
		for(int i=0;i<students.length()-1;i++)
		{
			if(max==students[i].avgMark)
			arr_[j++]=students[i];
		}
		return arr_;
			
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
		throw IllegalArgumentException;
		else
		{
			for(int i=0;i<=students.length()-1;i++)
			{
				if(i==students.length()-1)
					return null;
				if(students[i]==student)
					return students[i+1];
				
				
			}
				
		}
	}
}
