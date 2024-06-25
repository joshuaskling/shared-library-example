def call(String input = "Running UPDTcleaner") {
    script {
        sh """
            echo Hi ${input}
            echo ${JOB_NAME}
        """
        test_var = true
        if("${test_var}" == "true"){
            echo "Passed test_var"
        } else {
            echo "Did not pass test_var"
        }
        echo "${TEST}"
        echo "${}"
    }
}
