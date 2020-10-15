package groovy

import com.sap.gateway.ip.core.customdev.util.Message
import com.sap.gateway.ip.core.customdev.util.AttachmentWrapper


def Message processData(Message message) {
	
	def log = messageLogFactory.getMessageLog(message) //this messageLogFactory is a variable made 
	//available by runtime to the script
	
	if(log) {
		
		log.setStringProperty("someStringProperty","somevalue set in log")
		
		def body_str = message.getBody().toString()
		
		log.addAttachmentAsString("att_log",body_str,"text/json")
		
	}
	
	
}


