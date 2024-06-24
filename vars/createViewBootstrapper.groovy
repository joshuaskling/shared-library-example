def call(String input = "test") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}
