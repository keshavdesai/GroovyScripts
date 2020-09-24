package groovy

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
class Foo {
	
	/**@
	 * Some method groovydoc for bar
	 */
    private String pri = 'pri str'
	private String bar() {
		return pri
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

// why dont the private methods - see bar() - work?
def f = new Foo()
println f.bar()
try {
println Foo.pri //private attributes work 
}catch (e) {
	println e.message
}


interface Inter{
	String interstr = 'inter str'
	String getter()
	String setter(String)
}

class InterImpl implements Inter{
	
	private String interstr

	public String getter() {
		// TODO Auto-generated method stub
		return interstr;
	}

	public String setter(str) {
		// TODO Auto-generated method stub
		interstr = str
		return "$str set as value";
	}
	
}

def inter = new InterImpl()

println 'interstr before : ' + inter.getter()
inter.setter('djioejoijo')
println 'interstr after : ' + inter.getter()

try {
println Inter.interstr
println InterImpl.interstr
}catch (e) {
	println e.message
}
