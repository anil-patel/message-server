package org.patel.messageserver.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/about")
public class AboutController {

    private String aboutMessage = "This is default message";

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String about() {
        return aboutMessage;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createAboutMessage(String aboutMessage) {
        this.aboutMessage = aboutMessage;
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void replaceAboutMessage(String aboutMessage) {
        this.aboutMessage = aboutMessage;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAboutMessage() {
        this.aboutMessage = null;
    }


}
