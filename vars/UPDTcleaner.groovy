def call(String input = "Running UPDTcleaner") {
    script {
        sh """
            echo Hi ${input}
        """
    }
}
