
package net.codetojoy.util

class FileUtil {

    def writeFile(def path, def content) {
        def file = new File(path)
        file.parentFile.mkdirs()
        file.withWriter { writer ->
            writer.write(content)
            writer.write("\n")
        }
    }
}
