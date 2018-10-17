package XMLPackage;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class JAXB_XMLToJava {
	
	public static void main(String[] args) {
		
		try
		
		{
			File file = new File("C:\\Users\\A07208trng_b4a.03.28\\Desktop\\WorkspaceHM\\XML\\EmployeeXML.xml");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			
			Employee e1 = (Employee)unmarshaller.unmarshal(file);
			System.out.println(e1.getId()+ " "+ e1.getName()+ " "+ e1.getSalary());
		}
		
		catch(Exception e)
		{
			System.out.println("Exception happened:" +e.getMessage());
		}
	}

}
