package com.company.Games;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class MagicController {
        //CREATE A NEW ARRAY LIST
        private List<Magic> respList;

        //CREATE AN INSTANCE OF THE RANDOM CLASS
        Random rand = new Random();

        //CONSTRUCTOR
        public MagicController (){
                respList = new ArrayList<>();
                //ADD 6 ENTRIES OF RESPONSES
                this.respList.add(new Magic("It is Certain"));
                this.respList.add(new Magic("Without a Doubt"));
                this.respList.add(new Magic("Don't Count On Tt"));
                this.respList.add(new Magic ("Yes"));
                this.respList.add(new Magic ("No"));
                this.respList.add(new Magic("Ask Again Later"));
        }

        //POST ROUTE
       @RequestMapping(value = "/magic", method = RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public Magic getResponse (){
                //RETURN RANDOM RESPONSE
           return this.respList.get(rand.nextInt(respList.size()));

        }

}
