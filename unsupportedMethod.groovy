import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;

def Message processData(Message message) {
	 
    throw new Exception("Unsupported method: "+message.getHeaders().get("CamelHTTPMethod"));

}
