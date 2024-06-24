def call(String input = "Running updateUPDTClearCase") {
    script {
        sh """
            echo Hi ${input}
        """
    }
}
