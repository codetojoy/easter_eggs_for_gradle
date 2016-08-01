
package net.codetojoy.ext

class CamelCaseExtension {

    // silly example
    // translate a string to camel-case, using spaces as the boundaries between words
    // "this is a test" -> "thisIsATest"

    static String camelCase(String s) {
        StringBuilder result = new StringBuilder()

        def isAfterSpace = false

        s.eachWithIndex { letter, index ->
            def newLetter = ""

            if (letter == " ") {
                newLetter = ""
                isAfterSpace = true
            } else {
                if (index == 0) {
                    newLetter = letter.toLowerCase()
                } else {
                    newLetter = (isAfterSpace) ? letter.toUpperCase() : letter.toLowerCase()
                }  
                isAfterSpace = false
            }

            result.append(newLetter)
        }

        return result.toString()
    }
}
