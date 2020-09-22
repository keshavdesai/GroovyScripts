import groovy.json.*;

def String someFunc(){
    
    def slurper = new JsonSlurper()

    def result = slurper.parseText('{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}')

    def jb = new JsonBuilder()

    jb.people{
        person {
            name 'keshav'
            place 'london'
        }
    }
   
    def jstr = jb.toString()
    

    def someArray = []
    
    someArray << result.person.name
    someArray << result.person.age
    
    return someArray+jstr
} 

print someFunc()
print '\n'

