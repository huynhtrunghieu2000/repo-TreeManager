package tk.dntree.utils;

import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtil {
	private String value;

	public HttpUtil(String value) {
		this.value= value;
	}
	
	public <T> T toModel(Class<T> tClass) {
		try {
			return new ObjectMapper().readValue(value, tClass);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return null;
	}
//Receive Input -> convert json to string
	public static HttpUtil of(BufferedReader reader) {
		StringBuilder stringBuilder = new StringBuilder();

		try {
			String line;
			while ((line = reader.readLine()) != null) {
				stringBuilder.append(line);
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		return new HttpUtil(stringBuilder.toString());
	}

}
