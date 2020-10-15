package groovyHelper

/**@
 USE alt+shift+x and press G to run as Groovy Script
 */


println "hello - prints newline after texts"

//below doesnt print in newline,unless explicitly specified
print "hello again - 1"
print "hello again - 2"+'\n'

println("brackets make me print in a new line")

//single quotes, double quotes dont matter?	apparently String and GString
def somestr = 'somestring'
println "$somestr".getClass() //use $ as prefix to variable when being used 
                              //inside quotes - avoid concatenation of str
println somestr.getClass()

//-----testing groovydoc - disabled by default------


/**@
 * Some class groovydoc for Foo
 */
groovyHelperFoo {
	/**@
	 * Some method groovydoc for bar
	 */
	void bar() {
	}
}

//println this.class.getGroovydoc()

//-----testing groovydoc ----------------------------

//Quoted identifiers -- Maps - this is how the headers and body are returned 
//in CPI

def map = [:]

map."somekey"="someval"
map."newkey" = "newval"
map.'onekey'='oneval'
map.name = 'somename'


map.put('key1', 'val1')

println map

println map.get('name')