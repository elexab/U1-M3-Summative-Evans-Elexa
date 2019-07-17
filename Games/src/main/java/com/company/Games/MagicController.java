package com.company.Games;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



@RestController
public class MagicController {


        //CREATE A NEW ARRAY LIST
        private List<String> responses = new ArrayList<>();

        //CREATE AN INSTANCE OF THE RANDOM CLASS
        Random rand = new Random();


        //CONSTRUCTOR
        public MagicController (){
                //ADD 6 ENTRIES OF RESPONSES
                this.responses.add("It is Certain");
                this.responses.add("Without a Doubt");
                this.responses.add("Don't Count On Tt");
                this.responses.add("Yes");
                this.responses.add("No");
                this.responses.add("Ask Again Later");
        }

        //POST ROUTE
       @RequestMapping(value = "/magic", method = RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public String getResponse (){
                //RETURN RANDOM RESPONSE
               return responses.get(rand.nextInt(responses.size()));
        }


}
