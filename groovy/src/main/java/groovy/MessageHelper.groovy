package groovy

import javax.activation.DataHandler
import org.apache.camel.Attachment

import com.sap.gateway.ip.core.customdev.util.AttachmentWrapper
import com.sap.gateway.ip.core.customdev.util.Message

class MessageHelper implements Message {
	
	def properties = [:]
	def headers = [:]
	def body = new String()

	public MessageHelper() {
		super()
		// TODO Auto-generated constructor stub
	}

	public void addAttachmentHeader(String arg0, String arg1, AttachmentWrapper arg2) {
		// TODO Auto-generated method stub

	}

	public void addAttachmentObject(String arg0, AttachmentWrapper arg1) {
		// TODO Auto-generated method stub

	}

	public String getAttachmentHeader(String arg0, AttachmentWrapper arg1) {
		// TODO Auto-generated method stub
		return null
	}

	public Map<String, AttachmentWrapper> getAttachmentWrapperObjects() {
		// TODO Auto-generated method stub
		return null
	}

	public Map<String, DataHandler> getAttachments() {
		// TODO Auto-generated method stub
		return null
	}

	public long getAttachmentsSize() {
		// TODO Auto-generated method stub
		return 0
	}

	public Object getBody() {
		// TODO Auto-generated method stub
		return body
	}

	public <T> T getBody(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null
	}

	public long getBodySize() {
		// TODO Auto-generated method stub
		return 0
	}

	public <T> T getHeader(String arg0, Class<T> arg1) {
		// TODO Auto-generated method stub
		return null
	}

	public Map<String, Object> getHeaders() {
		// TODO Auto-generated method stub
		return headers
	}

	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return properties
	}

	public void removeAttachmentHeader(String arg0, AttachmentWrapper arg1) {
		// TODO Auto-generated method stub

	}

	public void setAttachmentHeader(String arg0, String arg1, AttachmentWrapper arg2) {
		// TODO Auto-generated method stub

	}

	public void setAttachmentWrapperObjects(Map<String, AttachmentWrapper> arg0) {
		// TODO Auto-generated method stub

	}

	public void setAttachments(Map<String, DataHandler> arg0) {
		// TODO Auto-generated method stub

	}

	public void setBody(Object arg0) {
		// TODO Auto-generated method stub
		
		body = arg0

	}

	public void setHeader(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		headers."$arg0" = arg1

	}

	public void setHeaders(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		arg0.each { headers << it }

	}

	public void setProperties(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
		arg0.each { properties << it }

	}
	
}
