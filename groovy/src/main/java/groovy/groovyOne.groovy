package groovy

import groovy.json.*

def String build(fname, lname, plc) {
	
	def jb = new JsonBuilder()
	
	jb.people{
		person {
			firstname "$fname"
			lastname "$lname"
			place "$plc"
		}
	}
	
	def jstring = jb.toPrettyString()
	
	print jstring
		
	return jstring
	
}

def String slurp(jstring) {
	
	def slurper = new JsonSlurper()
	
	def parsedtext = slurper.parseText(jstring)
	
	print '\n\n'
	print parsedtext.people.person.firstname+'\n'
	print parsedtext.people.person.lastname+'\n'
	print parsedtext.people.person.place+'\n'

}

slurp(build('jon','doe','ny'))