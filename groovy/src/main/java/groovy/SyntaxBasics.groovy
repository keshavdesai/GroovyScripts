package groovy

/*
 USE alt+shift+x and press G to run as Groovy Script
 */


println "hello - prints newline after texts"

//below doesnt print in newline,unless explicitly specified
print "hello again - 1"
print "hello again - 2"+'\n'

println("brackets make me print in a new line")

//single quotes, double quotes dont matter?	apparently String and GString
def somestr = 'somestring'
println "$somestr".getClass()
println somestr.getClass()

