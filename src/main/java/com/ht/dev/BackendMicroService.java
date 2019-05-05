package com.ht.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendMicroService {

    @RequestMapping(value="/backend", method=RequestMethod.GET, produces="application/json")
       @ResponseBody
    public Reponse backendReponse(){
        return new Reponse(String.format("Bonjour de la part du Backend service"));
    }


     @RequestMapping(value="/delete", method=RequestMethod.DELETE)
       @ResponseBody
    public void backendDelete(){
       //ne fait rien pour l'instant
    }

	public static void main(String[] args) {
		SpringApplication.run(BackendMicroService.class, args);
	}
}
