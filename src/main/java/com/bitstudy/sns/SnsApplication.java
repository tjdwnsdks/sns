package com.bitstudy.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/* 이 코드 돌리면 맨 아래
* Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.
* 	이 메세지 나옴. url 이 없다는 소리인데. 아직 우리가 build.gradle 파일에 jpa 를 설정했는데, 걔가 DB 설정을 자동으로 해준다.
* 그런데 우리가 연결할 DB의 URL 설정을 한게 없어서 나는 에러다.
* 아직은 우리가 DB 설정 안했기 때문에 exclude = DataSourceAutoConfiguration.class 으로 자동으로 DB 설정하는걸 안하게 해놓자.
* DataSourceAutoConfiguration 는 DB 구성을 자동으로 하겠다는건데 exclude 에 담으면 안하겠다는 말임.
* 
* 위에거 하고 다시 실행하면 알아서 톰캣도 8080으로 뜨고 실행되는걸 볼 수 있다.
* 크롬 가서 http://localhost:8080/ 주소 넣어보면 화면 나옴
* 해당 로그인 화면은 우리가 spring security 를 설정해놨기 때문에  모든 경로의 접근에서 뜸.
*  */
//@SpringBootApplication
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnsApplication.class, args);
	}

}
