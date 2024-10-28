def call( ) {
     if(isUnix()) {
		 sh "mvn -Dmaven.test.failure.ignore=true clean package"
	} else {
		 bat "mvn -Dmaven.test.failure.ignore=true clean package"
	}
    
}
