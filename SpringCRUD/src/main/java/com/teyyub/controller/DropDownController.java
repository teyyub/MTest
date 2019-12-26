package com.teyyub.controller;

import com.teyyub.model.PersonData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author teyyub , 1:39:35 AM
 */
@Controller
public class DropDownController {

    @RequestMapping(value = "/dropDown.web", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "dropDown";
    }

    @RequestMapping(value = "/populatePersonDataFromServer", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody
    List<PersonData> populateActivePSwapBasket() {
        System.out.println("response body ");
        PersonData personData = new PersonData();
        personData.setPersonId(10);
        personData.setPersonName("Java Honk");

        List<PersonData> personDatas = new ArrayList<>();
        personDatas.add(personData);

        personData = new PersonData();
        personData.setPersonId(11);
        personData.setPersonName("AngularJS combo box");
        personDatas.add(personData);

        personData = new PersonData();
        personData.setPersonId(11);
        personData.setPersonName("Select box list");
        personDatas.add(personData);

        return personDatas;
    }

}
