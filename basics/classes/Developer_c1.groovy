@groovy.transform.ToString()
class Developer_c1 {
    String firstName
    String lastName
    def progLanguage = []

    void work(){
        println "Developer $firstName $lastName is working...!"
    }

}