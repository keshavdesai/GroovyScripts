import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
import java.net.URLDecoder;


def Message processData(Message message) {

	def query_parameter = message.getHeaders().get("CamelHTTPQuery");

	if(query_parameter.equals("")){
		
		return message;
	}
	else {
		
		String[] query_string = query_parameter.split('&');
		String[] key_val;
		def urldecoder = new URLDecoder();
		def odataquery = [];
		for (String pair:query_string){

			key_val = pair.split('=');
			try{

				if(!key_val[1].isNumber()){
					
					key_val[1] = "'"+urldecoder.decode(key_val[1],"UTF-8")+"'";
				}
				if(odataquery.size()>0){
					odataquery.add(" and ");
				}
				odataquery.add(new String((key_val[0]+" eq "+key_val[1])));
				
			}
			catch(Exception e){
                 //dont do anything, just process the valid query parameters
			}
		}
		
		message.setProperty("filterCrit",odataquery.join());
		
		return message;
	}
}
