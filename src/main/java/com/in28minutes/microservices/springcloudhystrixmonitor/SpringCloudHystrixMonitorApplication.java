package com.in28minutes.microservices.springcloudhystrixmonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
//@EnableTurbine
//@EnableEurekaClient
public class SpringCloudHystrixMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixMonitorApplication.class, args);
	}
}
