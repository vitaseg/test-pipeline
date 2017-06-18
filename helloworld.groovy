["Rod", "Carlos", "Chris"].each{println it}
def process = "ls -l".execute()             
process.in.eachLine { line ->               
    println line                            
}
def technologies = []

/*** Adding a elements to the list ***/

// As with Java
technologies.add("Grails")

// Left shift adds, and returns the list
technologies << "Groovy"

// Add multiple elements
technologies.addAll(["Gradle","Griffon"])

/*** Removing elements from the list ***/

// As with Java
technologies.remove("Griffon")

// Subtraction works also
technologies = technologies - 'Grails'

/*** Iterating Lists ***/

// Iterate over elements of a list
technologies.each { println "Technology: $it"}
technologies.eachWithIndex { it, i -> println "$i: $it"}

def username = 'Jenkins'
def cloA = {param ->
    def cloB = {
        return param * 10    
    }
}

def b = cloA(10)
println b(10)