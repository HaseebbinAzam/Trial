package XMLPackage;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXML {
	
	public static void main(String[] args){
		
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("James");
		e1.setSalary(36000);
		
		try
		{
			File file = new File("C:\\Users\\A07208trng_b4a.03.28\\Desktop\\WorkspaceHM\\XML\\EmployeeXML.xml");
		
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			
			marshaller.marshal(e1,file);
			marshaller.marshal(e1, System.out);	
		}
		catch(Exception e)
		{
			System.out.println("Exception happened:" +e.getMessage());
		}
	}

}
