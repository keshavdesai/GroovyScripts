import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
import groovy.json.*;

def Message processData(Message message) {

	def query_parameter = message.getHeaders().get("CamelHTTPQuery").toString();

	if(query_parameter.equals("")){
		return message;
	}
	else {
		String[] query_string = query_parameter.split('&');
		String[] key_val;
		for (String pair:query_string){
			key_val = pair.split('=');
			try{
				message.setProperty(key_val[0],key_val[1]);
			}
			catch(Exception e){
				//dont do anything, just process the valid query parameters
			}
		}
		return message;
	}
}
