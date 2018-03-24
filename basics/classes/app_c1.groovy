def developer = new Developer_c1()
//the above is similar to the following...
//Developer_c1 developer = new Developer_c1()

developer.setFirstName("Willys")
developer.setLastName("Tjiawi")

developer.progLanguage << "Java"
developer.progLanguage << "Groovy"

developer.work()
println "Language of expertise are " + developer.progLanguage