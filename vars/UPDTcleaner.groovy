def call(String input = "Running UPDTcleaner") {
    script {
        sh """
            echo Hi ${input}
            echo ${JOB_NAME}
        """
        test_var = true
        when{
            expression {${test_var} == true}
        }
        echo "Passed test_var"
    }
}
