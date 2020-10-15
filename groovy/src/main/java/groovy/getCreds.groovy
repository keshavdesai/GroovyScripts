package groovyHelper

import com.sap.gateway.ip.core.customdev.util.Message
import java.util.HashMap
import com.sap.it.api.ITApiFactory
import com.sap.it.api.securestore.SecureStoreService
import com.sap.it.api.securestore.UserCredential


def Message processData(Message message) {
    
        def cred_service = ITApiFactory.getApi(SecureStoreService,null)
        
        def cred = cred_service.getUserCredential("ECC") //name of the cred
        
        if(cred == null) {
        	throw new Exception("invalid credential")
        } else {
            
            def map = message.getProperties()
            
			//example. you can use it anywhere, obv pwd mustnt be assigned to properties or logged
            message.setProperty("Username",cred.getUsername())
            message.setProperty("Password",cred.getPassword().toString())
        }

       return message;
       
}