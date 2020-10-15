package groovy

import com.sap.gateway.ip.core.customdev.util.*


def Message processData(Message message) {
    
//    def log = messageLogFactory.getMessageLog(message) //this messageLogFactory is a variable made 
//    //available by runtime to the script
//    
//    if(log) {
//        
//        log.setStringProperty("someStringProperty","somevalue set in log")
//        
//        def body_str = message.getBody().toString()
//        
//        log.addAttachmentAsString("att_log",body_str,"text/json")
//        
//    }
    
    def map = message.getHeaders()


    message.setHeader("newkey", "newval")
    
   // println message.getHeaders()
    
    return message
    
    
}

Message msg = new MessageHelper()
def map = [:]
map."somekey" = "someval"

msg.setHeaders(map)

println msg.getHeaders()

Message ret_msg = processData(msg)

println ret_msg.getHeaders()