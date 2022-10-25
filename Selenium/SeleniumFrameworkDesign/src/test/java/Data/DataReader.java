package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class DataReader {

	public  List<HashMap<String, String>> getJsonDataToMap(String dataUrl) throws JsonIOException, JsonSyntaxException,
			FileNotFoundException, JsonMappingException, JsonProcessingException {
		File input = new File(dataUrl);

		JsonElement fileElement = JsonParser.parseReader(new FileReader(input));

		ObjectMapper mapper = new ObjectMapper();

		System.out.println(fileElement);
		List<HashMap<String, String>> data = mapper.readValue(fileElement.toString(),
				new TypeReference<List<HashMap<String, String>>>() {

				});
		return data;
//			JsonObject fileObject = fileElement.getAsJsonObject();
//			String email = fileObject.get("adress").getAsString();
//			String password = fileObject.get("password").getAsString();
//			String product = fileObject.get("product").getAsString();
//			System.out.println("email" + email + "---" + "password" + password + "---" + "product" + product);

	}

}
