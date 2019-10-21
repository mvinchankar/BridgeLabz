import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface DoctorPatientInterface {
	void add() throws IOException;

	void search() throws IOException;

	void display() throws IOException;

	void popularDoctor() throws JsonParseException, JsonMappingException, IOException;

	void takeAppointment() throws IOException;

	
	
	
	
}
